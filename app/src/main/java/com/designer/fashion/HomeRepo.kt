package com.designer.fashion

import androidx.lifecycle.LiveData
import com.designer.fashion.model.HomeData

class HomeRepo(private val homeDao: HomeDao) {

    fun getHomeData(): LiveData<HomeData> {
        return homeDao.getHomeDao()
    }

    suspend fun insertHomeData(homeData: HomeData) {
        homeDao.insertHomeDao(homeData)
    }
}