package com.abhishek.foody.model.restaurantmenu

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "menu_item_table")
@Parcelize
data class MenuItem(
    @PrimaryKey
    @SerializedName("id")
    val id: String,
    @SerializedName("dishName")
    val dishName: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("price")
    val price: String
) : Parcelable