package com.thainareis.stageproject.ui.login.cpf

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LoginCPFViewModel {

    private val _goToPasswordEvent = MutableLiveData<String>()
    val goToPasswordEvent: LiveData<String> = _goToPasswordEvent

    fun onPasswordClicked(password: String){
        _goToPasswordEvent.postValue(password)
    }

}