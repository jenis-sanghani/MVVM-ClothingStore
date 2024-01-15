package com.designer.fashion

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.designer.fashion.model.HomeData

@Dao
interface HomeDao {

    @Query("SELECT * from HomeData")
    fun getHomeDao() : LiveData<HomeData>

    @Insert
    suspend fun insertHomeDao(homeData: HomeData)
}