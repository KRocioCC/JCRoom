package com.karenkotlin.jcroom.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.karenkotlin.jcroom.room.RoomApp
import com.karenkotlin.jcroom.room.entities.Insect
import kotlinx.coroutines.launch

class InsectViewModel : ViewModel() {
    private val dao = RoomApp.db.insectDao()

    // Lista de insectos para mostrar en Compose
    val insects = dao.getAllInsects()

    // Insertar
    fun addInsect(insect: Insect) {
        viewModelScope.launch {
            dao.addInsect(insect)
        }
    }
    // Eliminar
    fun deleteInsect(insect: Insect) {
        viewModelScope.launch {
            dao.deleteInsect(insect)
        }
    }
    // Actualizar
    fun updateInsect(insect: Insect) {
        viewModelScope.launch {
            dao.update(insect)
        }
    }
}