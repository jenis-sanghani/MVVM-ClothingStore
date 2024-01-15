package com.designer.fashion.models

import androidx.annotation.Keep

@Keep
data class SliderImage(
    val cta: String,
    val image: String,
    val sort_order: String,
    val title: String
)