package com.karenkotlin.jcroom.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Insect (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var name: String = "",
    var imgLocation: String = "",
    var inDanger:Boolean = false,
)
