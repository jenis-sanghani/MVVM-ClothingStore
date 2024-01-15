package com.designer.fashion.models

import androidx.annotation.Keep

@Keep
data class Category(
    val category_id: String,
    val category_name: String,
    val child: List<Child>,
    val parent_id: String
)