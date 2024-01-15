package com.designer.fashion.models


import androidx.annotation.Keep

@Keep
data class ShopByCategoryX(
    val category_id: String,
    val image: String,
    val name: String,
    val sort_order: String,
    val tint_color: String
)