package com.example.clase9

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clase9.databinding.ActivityMainBinding
import com.example.clase9.model.Student
import com.example.clase9.model.StudentRepository
import com.example.clase9.view.StudentAdapter
import com.example.clase9.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var studentViewModel: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        studentViewModel = StudentViewModel()
        studentViewModel.students.observe(this){ student ->
            initRecycler(StudentRepository.students)
        }

    }

    private fun initRecycler(students: List<Student>) {
        binding.rvStudents.layoutManager = LinearLayoutManager(this)
        binding.rvStudents.adapter = StudentAdapter(students)
    }
}