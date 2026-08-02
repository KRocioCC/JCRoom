package com.karenkotlin.jcroom.room.entities

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Insect::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase(){
    abstract fun InsectDao(): InsectDao
}
