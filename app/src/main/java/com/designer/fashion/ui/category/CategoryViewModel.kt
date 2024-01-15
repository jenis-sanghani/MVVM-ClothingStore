package com.designer.fashion.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.designer.fashion.models.BottomData
import com.designer.fashion.models.HomeCategories
import com.designer.fashion.models.HomeData
import com.designer.fashion.models.MiddleData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryViewModel(private val repository: CategoryRepo) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getCategoryData()
        }
    }

    val homeCategories: LiveData<HomeCategories>
        get() = repository.homeCategories

}