package com.thainareis.stageproject

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel

class UsersViewModel : ViewModel() {
    private val users =  ObservableArrayList<Users>()

    fun getUsers(): ObservableArrayList<Users> {
        return users
    }


}
