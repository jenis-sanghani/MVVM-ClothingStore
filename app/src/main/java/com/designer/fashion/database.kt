package com.designer.fashion

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.designer.fashion.model.HomeData

@Database(entities = [HomeData::class], version = 1)
abstract class FashionDatabase : RoomDatabase() {
    abstract fun homedao() : HomeDao

    companion object {
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