package com.example.clase9.model

import androidx.room.Entity
import androidx.room.PrimaryKey

//  Utilizamos el decorador Entity para establecer, mediante Room, que es una entidad, una tabla
@Entity
data class Student(
    @PrimaryKey val id: Int,
    val name: String,
    val lastName: String,
    val dni: String,
    val city: String,
    val cp: String
)

//  Decorador @PrimaryKey debe estar dado
//  @ColumnInfo es tipo SerializedName