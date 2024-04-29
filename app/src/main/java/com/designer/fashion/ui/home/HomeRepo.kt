package com.designer.fashion.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.designer.fashion.db.FashionDatabase
import com.designer.fashion.api.ApiService
import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeData
import com.designer.fashion.models.MiddleData
import com.designer.fashion.utils.NetworkUtils

class HomeRepo(
    private val apiService: ApiService,
    private val database: FashionDatabase,
    private val applicationContext: Context
) {

    private val homeLiveData = MutableLiveData<HomeData>()
    val homeData: LiveData<HomeData>
        get() = homeLiveData

    private val middleLiveData = MutableLiveData<MiddleData>()
    val middleData: LiveData<MiddleData>
        get() = middleLiveData

    private val bottomLiveData = MutableLiveData<BottomData>()
    val bottomData: LiveData<BottomData>
        get() = bottomLiveData

    suspend fun getHomeData() {
        // HomeData
        if (database.homedao().getHomeDao() != null) {
            homeLiveData.postValue(database.homedao().getHomeDao())
        } else {
            if (NetworkUtils.isInternetAvailable(applicationContext)) {
                val topRepoResponse = apiService.getTopRepoData()
                if (topRepoResponse.body() != null) {
                    database.homedao().insertHomeDao(topRepoResponse.body()!!)
                    homeLiveData.postValue(topRepoResponse.body())
                }
            }
        }

        // MiddleData
        if (database.middleDao().getMiddleDataDao() != null) {
            middleLiveData.postValue(database.middleDao().getMiddleDataDao())
        } else {
            if (NetworkUtils.isInternetAvailable(applicationContext)) {
                val middleRepoResponse = apiService.getMiddleRepoData()
                if (middleRepoResponse.body() != null) {
                    database.middleDao().insertMiddleDataDao(middleRepoResponse.body()!!)
                    middleLiveData.postValue(middleRepoResponse.body())
                }
            }
        }

        // BottomData
        if (database.bottomDao().getBottomDaoDao() != null) {
            bottomLiveData.postValue(database.bottomDao().getBottomDaoDao())
        } else {
            if (NetworkUtils.isInternetAvailable(applicationContext)) {
                val bottomRepoResponse = apiService.getBottomRepoData()
                if (bottomRepoResponse.body() != null) {
                    database.bottomDao().insertBottomDaoDao(bottomRepoResponse.body()!!)
                    bottomLiveData.postValue(bottomRepoResponse.body())
                }
            }
        }
    }
}