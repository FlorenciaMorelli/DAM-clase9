package com.example.clase9.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.clase9.databinding.ActivityMainBinding
import com.example.clase9.databinding.StudentItemBinding
import com.example.clase9.model.Student

class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = StudentItemBinding.bind(view)

    fun bind(student: Student){
        binding.tvName.text = student.name
        binding.tvLastname.text = student.lastName
        binding.tvDni.text = student.dni
        binding.tvCity.text = student.city
        binding.tvCp.text = student.cp
    }

}