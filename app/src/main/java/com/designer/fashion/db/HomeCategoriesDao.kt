package com.designer.fashion.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.designer.fashion.models.HomeCategories

@Dao
interface HomeCategoriesDao {

    @Query("SELECT * from HomeCategories")
    fun getHomeCategoriesDao() : HomeCategories

    @Insert
    suspend fun insertHomeCategoriesDao(homeCategories: HomeCategories)
}