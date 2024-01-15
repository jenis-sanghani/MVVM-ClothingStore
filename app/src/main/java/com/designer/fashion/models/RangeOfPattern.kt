package com.designer.fashion.models


import androidx.annotation.Keep

@Keep
data class RangeOfPattern(
    val image: String,
    val name: String,
    val product_id: String
)