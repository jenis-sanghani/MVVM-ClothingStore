package com.designer.fashion.models

import androidx.annotation.Keep

@Keep
data class Unstitched(
    val description: String,
    val image: String,
    val name: String,
    val range_id: String
)