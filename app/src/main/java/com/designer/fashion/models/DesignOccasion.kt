package com.designer.fashion.models


import androidx.annotation.Keep

@Keep
data class DesignOccasion(
    val cta: String,
    val image: String,
    val name: String,
    val product_id: String,
    val sub_name: String
)