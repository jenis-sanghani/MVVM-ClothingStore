package com.designer.fashion.models

import androidx.annotation.Keep

@Keep
data class BoutiqueCollection(
    val banner_id: String,
    val banner_image: String,
    val cta: String,
    val name: String
)