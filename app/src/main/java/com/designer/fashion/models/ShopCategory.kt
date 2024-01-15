package com.designer.fashion.models

import androidx.annotation.Keep

@Keep
data class ShopCategory(
    val Unstitched: List<Unstitched>,
    val boutique_collection: List<BoutiqueCollection>,
    val message: String,
    val shop_by_category: List<ShopByCategory>,
    val shop_by_fabric: List<ShopByFabric>,
    val status: String
)