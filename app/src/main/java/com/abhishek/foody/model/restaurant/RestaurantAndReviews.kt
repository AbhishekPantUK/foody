package com.abhishek.foody.model.restaurant

import androidx.room.Embedded
import androidx.room.Relation

data class RestaurantAndReviews(
    @Embedded
    val restaurant: Restaurant,
    @Relation(
        parentColumn = "id",
        entityColumn = "restaurantId"
    )
    val reviews: List<Review>
)