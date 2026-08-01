package com.karenkotlin.jcroom.room.entities

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface InsectDao {

    @Insert
    suspend fun insert(insect: Insect)

    @Query("SELECT * FROM Insect")
    fun getAllInsects(): Flow<List<Insect>>

    @Update
    suspend fun update(insect: Insect)

    @Delete
    suspend fun delete(insect: Insect)

}