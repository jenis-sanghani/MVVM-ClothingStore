package com.designer.fashion.models

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Keep
@Entity(tableName = "bottomData")
@TypeConverters(BottomData.Convertors::class)
data class BottomData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val design_occasion: ArrayList<DesignOccasion>,
    val message: String,
    val range_of_pattern: ArrayList<RangeOfPattern>,
    val status: String
) {
    class Convertors {
        companion object {
            @JvmStatic
            @TypeConverter
            fun fromDesignOccasionString(value: String): ArrayList<DesignOccasion> {
                val listType = object : TypeToken<ArrayList<DesignOccasion>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromDesignOccasionArrayList(list: ArrayList<DesignOccasion>): String {
                val gson = Gson()
                return gson.toJson(list)
            }

            @JvmStatic
            @TypeConverter
            fun fromRangeOfPatternString(value: String): ArrayList<RangeOfPattern> {
                val listType = object : TypeToken<ArrayList<RangeOfPattern>>() {}.type
                return Gson().fromJson(value, listType)
            }

            @JvmStatic
            @TypeConverter
            fun fromRangeOfPatternArrayList(list: ArrayList<RangeOfPattern>): String {
                val gson = Gson()
                return gson.toJson(list)
            }
        }
    }
}