package com.designer.fashion.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.MiddleData

@Dao
interface BottomDao {

    @Query("SELECT * from bottomData")
    fun getBottomDaoDao() : BottomData

    @Insert
    suspend fun insertBottomDaoDao(middleData: BottomData)
}