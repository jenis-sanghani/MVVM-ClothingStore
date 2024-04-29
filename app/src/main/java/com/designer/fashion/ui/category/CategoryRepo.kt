package com.designer.fashion.ui.category

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.designer.fashion.db.FashionDatabase
import com.designer.fashion.api.ApiService
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.utils.NetworkUtils.Companion.isInternetAvailable

class CategoryRepo(
    private val apiService: ApiService,
    private val database: FashionDatabase,
    private val applicationContext: Context
) {

    private val homeCategoriesLiveData = MutableLiveData<HomeCategories>()
    val homeCategories: LiveData<HomeCategories>
        get() = homeCategoriesLiveData

    suspend fun getCategoryData() {
        if (isInternetAvailable(applicationContext)) {
            // HomeCategories  
            val responseCategories = apiService.getHomeCategoriesData()
            if (responseCategories.body() != null) {
                database.homeCategoriesDao().insertHomeCategoriesDao(responseCategories.body()!!)
                homeCategoriesLiveData.postValue(responseCategories.body())
            }
        } else {
            homeCategoriesLiveData.postValue(database.homeCategoriesDao().getHomeCategoriesDao())
        }
    }
}