package com.designer.fashion

import android.app.Application
import com.designer.fashion.api.RetrofitHelper
import com.designer.fashion.api.ApiService
import com.designer.fashion.db.FashionDatabase
import com.designer.fashion.ui.category.CategoryRepo
import com.designer.fashion.ui.home.HomeRepo

class FashionApplication : Application() {

    lateinit var homeRepo: HomeRepo
    lateinit var categoryRepo: CategoryRepo

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val homeService = RetrofitHelper.getInstance().create(ApiService::class.java)
        val database = FashionDatabase.getDatabase(applicationContext)
        homeRepo = HomeRepo(homeService, database, applicationContext)
        categoryRepo = CategoryRepo(homeService, database, applicationContext)
    }
}