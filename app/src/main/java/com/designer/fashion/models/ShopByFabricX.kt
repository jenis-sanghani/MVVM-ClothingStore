package com.designer.fashion.models


import androidx.annotation.Keep

@Keep
data class ShopByFabricX(
    val fabric_id: String,
    val image: String,
    val name: String,
    val sort_order: String,
    val tint_color: String
)