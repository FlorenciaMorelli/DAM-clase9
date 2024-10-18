package com.example.clase9

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clase9.model.Student


//  Accede a la base de datos y devuelve un UserDao
//  "@Database" indica que es una base de datos
//  "entities = [Student::class]" indica las tablas (entidades) de la BD
//  "version = 1"
@Database(entities = [Student::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}