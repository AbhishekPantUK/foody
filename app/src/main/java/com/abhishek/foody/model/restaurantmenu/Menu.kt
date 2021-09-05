package com.abhishek.foody.model.restaurantmenu

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "menu_category_table")
@Parcelize
data class Menu(
    @PrimaryKey
    @SerializedName("restaurantId")
    @Expose
    val restaurantId: Int,
    @SerializedName("categories")
    @Expose
    @NonNull
    val categories: List<Category>
) : Parcelable