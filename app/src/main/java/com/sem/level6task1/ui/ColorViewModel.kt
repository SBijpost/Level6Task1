package com.sem.level6task1.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sem.level6task1.database.ColorRepository
import com.sem.level6task1.model.ColorItem

class ColorViewModel : ViewModel(){
    private val colorRepository = ColorRepository()

    //use encapsulation to expose as LiveData
    val colorItems: LiveData<List<ColorItem>>
        get() = _colorItems

    private val _colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}
