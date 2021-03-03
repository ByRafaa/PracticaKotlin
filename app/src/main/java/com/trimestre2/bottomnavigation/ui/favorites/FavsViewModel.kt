package com.trimestre2.bottomnavigation.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is favs Fragment"
    }
    val text: LiveData<String> = _text
}