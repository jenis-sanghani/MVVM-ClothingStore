package com.designer.fashion.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.HomeData
import com.designer.fashion.models.MiddleData

@Database(entities = [HomeData::class, MiddleData::class, BottomData::class, HomeCategories::class], version = 1)
abstract class FashionDatabase : RoomDatabase() {
    abstract fun homedao() : HomeDao
    abstract fun middleDao() : MiddleDao
    abstract fun bottomDao() : BottomDao
    abstract fun homeCategoriesDao() : HomeCategoriesDao

    companion object {
        @Volatile
        private var INSTANCE : FashionDatabase? = null
        fun getDatabase(context: Context) : FashionDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(context,
                        FashionDatabase::class.java,
                        "fashion_database"
                    ).build()
                }
            }
            return INSTANCE!!
        }
    }
}