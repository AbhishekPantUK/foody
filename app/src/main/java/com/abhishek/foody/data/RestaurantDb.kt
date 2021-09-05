package com.abhishek.foody.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.abhishek.foody.di.ApplicationScope
import com.abhishek.foody.model.restaurant.Latlng
import com.abhishek.foody.model.restaurant.OperatingHours
import com.abhishek.foody.model.restaurant.Restaurant
import com.abhishek.foody.model.restaurant.Review
import com.abhishek.foody.model.restaurantmenu.Category
import com.abhishek.foody.model.restaurantmenu.Menu
import com.abhishek.foody.model.restaurantmenu.MenuItem
import com.abhishek.foody.util.Converters
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Restaurant::class, Menu::class, Category::class, MenuItem::class], version = 1)
@TypeConverters(Converters::class)
abstract class RestaurantDb : RoomDatabase() {

    abstract fun restaurantDao() : RestaurantDao

    class Callback @Inject constructor(
        private val database: Provider<RestaurantDb>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ): RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            val dao = database.get().restaurantDao()

            applicationScope.launch {
                dao.insertRestaurants(getRestaurants())
                dao.insertMenuItem(getMenuSoups())
                dao.insertMenuItem(getMenuStarters())
                dao.insertMenuItem(getMenuMainCourse())
                dao.insertMenuItem(getMenuRice())
                dao.insertCategory(getCategories())
                dao.insertMenus(getMenu())
            }
        }
    }
}