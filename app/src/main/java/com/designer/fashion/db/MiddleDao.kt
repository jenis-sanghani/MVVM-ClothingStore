package com.designer.fashion.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.MiddleData

@Dao
interface MiddleDao {

    @Query("SELECT * from middleData")
    fun getMiddleDataDao() : MiddleData

    @Insert
    suspend fun insertMiddleDataDao(middleData: MiddleData)
}