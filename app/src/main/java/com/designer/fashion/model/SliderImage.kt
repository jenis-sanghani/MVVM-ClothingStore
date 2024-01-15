package com.designer.fashion.model

import androidx.annotation.Keep

@Keep
data class SliderImage(
    val cta: String,
    val image: String,
    val sort_order: String,
    val title: String
)