package com.abhishek.foody.ui.restaurants

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.abhishek.foody.data.RestaurantDao
import com.abhishek.foody.model.restaurant.Restaurant
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class RestaurantViewModel @Inject constructor(
    private val restaurantDao: RestaurantDao
) : ViewModel(){

    val searchQuery = MutableStateFlow("")

    private val restaurantFlow = searchQuery.flatMapLatest {
        restaurantDao.getRestaurantsBySearch(it)
    }

    val restaurants = restaurantFlow.asLiveData()

    fun onRestaurantSelected(restaurant: Restaurant) {

    }
}