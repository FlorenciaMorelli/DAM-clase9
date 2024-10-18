package com.example.clase9

import androidx.room.Dao
import androidx.room.Query
import com.example.clase9.model.Student

//  Data access object. Objeto al que se lo va a acceder como una data. Toma los datos y hace una alta, baja o modificación de los datos (ABM)
@Dao
interface UserDao {

    @Query("SELECT * FROM student")
    fun getStudents(): List<Student>
}