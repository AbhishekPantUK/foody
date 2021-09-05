package com.abhishek.foody.model.restaurantmenu

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "category_table")
@Parcelize
data class Category(
    @PrimaryKey
    @SerializedName("id")
    val id: String,
    @SerializedName("menu_item")
    @Expose
    @NonNull
    val menuItems: List<MenuItem>,
    @SerializedName("name")
    val name: String
) : Parcelable