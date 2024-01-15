package com.designer.fashion.models

import androidx.annotation.Keep

@Keep
data class Child(
    val category_id: String,
    val category_name: String,
    val parent_id: String
)