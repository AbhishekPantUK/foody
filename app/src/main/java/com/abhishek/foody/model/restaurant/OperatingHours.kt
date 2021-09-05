package com.abhishek.foody.model.restaurant

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OperatingHours(
    val monday: String,
    val tuesday: String,
    val wednesday: String,
    val thursday: String,
    val friday: String,
    val saturday: String,
    val sunday: String
) : Parcelable {
    override fun toString(): String {
        return "OperatingHours(monday='$monday', tuesday='$tuesday', wednesday='$wednesday', thursday='$thursday', friday='$friday', saturday='$saturday', sunday='$sunday')"
    }
}
