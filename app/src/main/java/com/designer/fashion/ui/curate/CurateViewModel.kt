package com.designer.fashion.ui.curate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CurateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Curate Fragment"
    }
    val text: LiveData<String> = _text
}