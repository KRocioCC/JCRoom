package com.karenkotlin.jcroom.room.entities

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface InsectDao {
    @Query("SELECT * FROM Insect")
    suspend fun getAllInsects(): List<Insect>

    @Insert
    suspend fun addInsect(insect: Insect): Long

    @Insert
    suspend fun addInsects(insect: List<Insect>): List<Long>

    @Delete
    suspend fun deleteInsect(insect: Insect): Int

    @Update
    suspend fun update(insect: Insect)

}

