package com.abhishek.foody.model.restaurant

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
/*@Entity(foreignKeys = arrayOf(ForeignKey(entity = Restaurant::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("restaurantId"),
    onDelete = ForeignKey.CASCADE)))*/
data class Review(
    val restaurantId: Int,
    @PrimaryKey
    val name: String,
    val date: String,
    val rating: Int,
    val comments: String
) : Parcelable