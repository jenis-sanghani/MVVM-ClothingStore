package com.designer.fashion.api

import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.HomeData
import com.designer.fashion.models.MiddleData
import retrofit2.Response
import retrofit2.http.GET

interface apiService {
    @GET("top_repository.json")
    suspend fun getTopRepoData() : Response<HomeData>

    @GET("middle_repository.json")
    suspend fun getMiddleRepoData() : Response<MiddleData>

    @GET("bottom_repository.json")
    suspend fun getBottomRepoData() : Response<BottomData>

    @GET("category_repository.json")
    suspend fun getHomeCategoriesData() : Response<HomeCategories>
}