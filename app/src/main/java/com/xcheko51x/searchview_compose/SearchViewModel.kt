package com.xcheko51x.searchview_compose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel: ViewModel() {
    private var _listaPersonas = MutableLiveData<List<Persona>>()
    val listaPersonas: LiveData<List<Persona>> get() = _listaPersonas

    init {
        _listaPersonas.value = dataPersonas()
    }
}

fun dataPersonas(): List<Persona> {
    return listOf(
        Persona("Sergio"),
        Persona("Ana"),
        Persona("Luis"),
        Persona("Raul"),
        Persona("Laura"),
        Persona("Maria")
    )
}