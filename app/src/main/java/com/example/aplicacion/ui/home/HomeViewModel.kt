package com.example.aplicacion.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenido al Home Fragment"
    }
    val text: LiveData<String> = _text

    // Guardar el nombre del usuario
    private val _userName = MutableLiveData<String>()
    val userName: LiveData<String> = _userName

    // Método para actualizar el nombre desde el Fragment
    fun setUserName(name: String) {
        _userName.value = name
    }
}