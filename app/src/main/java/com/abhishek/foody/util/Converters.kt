package com.abhishek.foody.util

import androidx.room.TypeConverter
import com.abhishek.foody.model.restaurantmenu.Category
import com.abhishek.foody.model.restaurantmenu.MenuItem
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {
    @TypeConverter
    fun fromCategoryList(category: List<Category?>?): String? {
        val type = object : TypeToken<List<Category?>?>() {}.type
        return Gson().toJson(category, type)
    }

    @TypeConverter
    fun toCategoryList(categoryString: String?): List<Category>? {
        val type = object : TypeToken<List<Category?>?>() {}.type
        return Gson().fromJson<List<Category>>(categoryString, type)
    }

    @TypeConverter
    fun fromMenuItemList(menuItems: List<MenuItem>?): String? {
        val type = object : TypeToken<List<MenuItem?>?>() {}.type
        return Gson().toJson(menuItems, type)
    }

    @TypeConverter
    fun toMenuItemsList(menuItemsString: String?): List<MenuItem>? {
        val type = object : TypeToken<List<MenuItem?>?>() {}.type
        return Gson().fromJson<List<MenuItem>>(menuItemsString, type)
    }

    @TypeConverter
    fun stringListToJson(value: List<String>?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToStringList(value: String) = Gson().fromJson(value, Array<String>::class.java).toList()
}