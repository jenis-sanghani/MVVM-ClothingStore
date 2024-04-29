package com.designer.fashion.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.designer.fashion.models.HomeData

@Dao
interface HomeDao {

    @Query("SELECT * from HomeData")
    fun getHomeDao() : HomeData?

    @Insert
    suspend fun insertHomeDao(homeData: HomeData)
}