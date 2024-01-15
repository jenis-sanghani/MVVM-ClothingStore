package com.designer.fashion.models


import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Keep
@Entity(tableName = "middleData")
@TypeConverters(MiddleData.Convertors::class)
data class MiddleData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val Unstitched: ArrayList<UnstitchedX>,
    val boutique_collection: ArrayList<BoutiqueCollectionX>,
    val message: String,
    val shop_by_category: ArrayList<ShopByCategoryX>,
    val shop_by_fabric: ArrayList<ShopByFabricX>,
    val status: String
) {
    class Convertors {
        companion object {
            @JvmStatic
            @TypeConverter
            fun fromUnstitchedXString(value: String): ArrayList<UnstitchedX> {
                val listType = object : TypeToken<ArrayList<UnstitchedX>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromUnstitchedXArrayList(list: ArrayList<UnstitchedX>): String {
                val gson = Gson()
                return gson.toJson(list)
            }

            @JvmStatic
            @TypeConverter
            fun fromBoutiqueCollectionXString(value: String): ArrayList<BoutiqueCollectionX> {
                val listType = object : TypeToken<ArrayList<BoutiqueCollectionX>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromBoutiqueCollectionXArrayList(list: ArrayList<BoutiqueCollectionX>): String {
                val gson = Gson()
                return gson.toJson(list)
            }

            @JvmStatic
            @TypeConverter
            fun fromShopByCategoryXString(value: String): ArrayList<ShopByCategoryX> {
                val listType = object : TypeToken<ArrayList<ShopByCategoryX>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromShopByCategoryXArrayList(list: ArrayList<ShopByCategoryX>): String {
                val gson = Gson()
                return gson.toJson(list)
            }

            @JvmStatic
            @TypeConverter
            fun fromShopByFabricXString(value: String): ArrayList<ShopByFabricX> {
                val listType = object : TypeToken<ArrayList<ShopByFabricX>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromShopByFabricXArrayList(list: ArrayList<ShopByFabricX>): String {
                val gson = Gson()
                return gson.toJson(list)
            }
        }
    }
}