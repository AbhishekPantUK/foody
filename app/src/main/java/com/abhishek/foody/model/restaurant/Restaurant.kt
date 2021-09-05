package com.abhishek.foody.model.restaurant


import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "restaurant_table")
@Parcelize
data class Restaurant(
    @PrimaryKey
    val id: Int,
    val name: String,
    val neighborhood: String,
    val photograph: String,
    val address: String,
    val cuisineType: String,
    @Embedded
    val latlng: Latlng,
    @Embedded
    val operatingHours: OperatingHours
) : Parcelable