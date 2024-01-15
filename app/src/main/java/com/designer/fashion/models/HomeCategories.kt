package com.designer.fashion.models

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Keep
@Entity(tableName = "homeCategories")
@TypeConverters(HomeCategories.Convertors::class)
data class HomeCategories(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val banner_image: String,
    val categories: ArrayList<Category>,
    val message: String,
    val status: String
) {
    class Convertors {
        companion object {
            @JvmStatic
            @TypeConverter
            fun fromString(value: String): ArrayList<Category> {
                val listType = object : TypeToken<ArrayList<Category>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromArrayList(list: ArrayList<Category>): String {
                val gson = Gson()
                return gson.toJson(list)
            }
        }
    }
}