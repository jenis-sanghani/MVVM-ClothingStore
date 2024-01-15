package com.designer.fashion.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.HomeData
import com.designer.fashion.models.MiddleData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: HomeRepo) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getHomeData()
        }
    }

    val homeData: LiveData<HomeData>
        get() = repository.homeData

    val middleData: LiveData<MiddleData>
        get() = repository.middleData

    val bottomData: LiveData<BottomData>
        get() = repository.bottomData

}