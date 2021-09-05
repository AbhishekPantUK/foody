package com.abhishek.foody.model.restaurant

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RestaurantResponse(
    val restaurants: List<Restaurant>
) : Parcelable