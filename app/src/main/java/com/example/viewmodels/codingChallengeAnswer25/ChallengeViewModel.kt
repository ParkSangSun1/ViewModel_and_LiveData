package com.example.viewmodels.codingChallengeAnswer25

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChallengeViewModel:ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
        get() = total

    //@Bindable
    val inputText = MutableLiveData<String>()


    init {
        total.value = 10
    }

    fun setTotal(){
        val intInput : Int = inputText.value!!.toInt()
        total.value = (total.value)?.plus(intInput)
    }
}