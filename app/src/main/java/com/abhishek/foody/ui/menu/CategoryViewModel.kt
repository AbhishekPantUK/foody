package com.abhishek.foody.ui.menu

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.abhishek.foody.data.RestaurantDao
import com.abhishek.foody.model.restaurant.Restaurant
import com.abhishek.foody.model.restaurantmenu.Category
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val restaurantDao: RestaurantDao,
    private val state: SavedStateHandle
) : ViewModel() {

    val restaurant = state.get<Restaurant>("restaurant")

    val restaurantId = MutableStateFlow(restaurant?.id)

    private val menuFlow = restaurantId.flatMapLatest {
        restaurantDao.getCategories(it)
    }

    val category = menuFlow.asLiveData()

    fun onCategorySelected(category: Category) {
    }

}