package com.karenkotlin.jcroom.room

import android.app.Application
import androidx.room.Room
import com.karenkotlin.jcroom.room.entities.AppDatabase


class RoomApp : Application() {

    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "alumno_database"
        ).build()
    }
}