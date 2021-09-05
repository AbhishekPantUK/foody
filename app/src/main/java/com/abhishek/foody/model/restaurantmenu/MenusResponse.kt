package com.abhishek.foody.model.restaurantmenu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MenusResponse(
    val menus: List<Menu>
) : Parcelable