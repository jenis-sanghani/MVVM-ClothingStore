package com.designer.fashion.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.designer.fashion.db.FashionDatabase
import com.designer.fashion.api.apiService
import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.HomeData
import com.designer.fashion.models.MiddleData
import com.designer.fashion.utils.NetworkUtils

class HomeRepo(
    private val apiService: apiService,
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
        if (NetworkUtils.isInternetAvailable(applicationContext)) {
            // HomeData
            val topRepoResponse = apiService.getTopRepoData()
            if (topRepoResponse?.body() != null) {
                database.homedao().insertHomeDao(topRepoResponse.body()!!)
                homeLiveData.postValue(topRepoResponse.body())
            }

            // MiddleData
            val middleRepoResponse = apiService.getMiddleRepoData()
            if (middleRepoResponse?.body() != null) {
                database.middleDao().insertMiddleDataDao(middleRepoResponse.body()!!)
                middleLiveData.postValue(middleRepoResponse.body())
            }

            // BottomData
            val bottomRepoResponse = apiService.getBottomRepoData()
            if (bottomRepoResponse?.body() != null) {
                database.bottomDao().insertBottomDaoDao(bottomRepoResponse.body()!!)
                bottomLiveData.postValue(bottomRepoResponse.body())
            }
        } else {
            homeLiveData.postValue(database.homedao().getHomeDao())
            middleLiveData.postValue(database.middleDao().getMiddleDataDao())
            bottomLiveData.postValue(database.bottomDao().getBottomDaoDao())
        }
    }
}