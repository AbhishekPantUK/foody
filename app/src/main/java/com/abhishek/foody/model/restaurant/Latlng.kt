package com.abhishek.foody.model.restaurant

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Latlng(
    val lat: Double,
    val lng: Double
) : Parcelable {

    override fun toString(): String {
        return "Latlng(lat=$lat, lng=$lng)"
    }
}