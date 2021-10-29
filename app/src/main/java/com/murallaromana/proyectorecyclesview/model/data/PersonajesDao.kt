package com.murallaromana.proyectorecyclesview.model.data

import com.murallaromana.proyectorecyclesview.model.entities.Personaje

interface PersonajesDao {

    fun getTodos(): List<Personaje>


}