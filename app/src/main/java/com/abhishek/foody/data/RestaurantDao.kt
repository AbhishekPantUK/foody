package com.abhishek.foody.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.abhishek.foody.model.restaurant.Restaurant
import com.abhishek.foody.model.restaurantmenu.Category
import com.abhishek.foody.model.restaurantmenu.Menu
import com.abhishek.foody.model.restaurantmenu.MenuItem
import kotlinx.coroutines.flow.Flow

@Dao
interface RestaurantDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCategory(menu: List<Category>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertMenuItem(menu: List<MenuItem>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRestaurants(restaurant: List<Restaurant>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMenus(menu: List<Menu>)

    @Query("SELECT * FROM restaurant_table")
    fun getRestaurants(): Flow<List<Restaurant>>

    @Query("SELECT * FROM restaurant_table WHERE neighborhood LIKE '%' || :searchQuery || '%' OR cuisineType LIKE '%' || :searchQuery || '%' OR name LIKE '%' || :searchQuery || '%'")
    fun getRestaurantsBySearch(searchQuery: String): Flow<List<Restaurant>>

    @Query("SELECT * FROM category_table WHERE id LIKE '%' || :searchQuery || '%'")
    fun getCategories(searchQuery: Int?): Flow<List<Category>>


//    @Query(
//        "SELECT * FROM restaurant_table " +
//                "INNER JOIN menu_category_table ON menu_category_table.restaurantId = restaurant_table.id " +
//                "INNER JOIN category_table ON category_table.id = menu_category_table.restaurantId " +
//                "INNER JOIN menu_item_table ON menu_item_table.id = category_table.id " +
//                "WHERE menu_item_table.dishName LIKE :searchQuery"
//    )
//    fun getRestaurantByMenuItem(searchQuery: String): Flow<List<Restaurant>>
}