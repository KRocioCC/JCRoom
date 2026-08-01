package com.karenkotlin.jcroom.room.entities

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update

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