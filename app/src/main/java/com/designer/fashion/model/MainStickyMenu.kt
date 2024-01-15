package com.designer.fashion.model

import androidx.annotation.Keep

@Keep
data class MainStickyMenu(
    val image: String,
    val slider_images: List<SliderImage>,
    val sort_order: String,
    val title: String
)