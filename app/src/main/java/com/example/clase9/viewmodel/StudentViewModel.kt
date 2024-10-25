package com.example.clase9.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.clase9.model.Student
import com.example.clase9.model.StudentRepository

class StudentViewModel : ViewModel() {
    private val _students = MutableLiveData<List<Student>>()
    val students: LiveData<List<Student>> = _students

    init {
        _students.value = StudentRepository.students
    }

    fun addStudent(name: String, lastName: String, dni: String, city: String, cp: String){
        // TO DO
    }
}