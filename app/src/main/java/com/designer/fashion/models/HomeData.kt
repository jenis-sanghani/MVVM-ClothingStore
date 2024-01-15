package com.designer.fashion.models

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Keep
@Entity(tableName = "homeData")
@TypeConverters(HomeData.Convertors::class)
data class HomeData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val main_sticky_menu: ArrayList<MainStickyMenu>,
    val message: String,
    val status: String
) {
    class Convertors {
        companion object {
            @JvmStatic
            @TypeConverter
            fun fromString(value: String): ArrayList<MainStickyMenu> {
                val listType = object : TypeToken<ArrayList<MainStickyMenu>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromArrayList(list: ArrayList<MainStickyMenu>): String {
                val gson = Gson()
                return gson.toJson(list)
            }
        }
    }
}