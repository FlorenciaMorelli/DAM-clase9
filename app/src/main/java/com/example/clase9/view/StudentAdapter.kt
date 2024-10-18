package com.example.clase9.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clase9.R
import com.example.clase9.model.Student

class StudentAdapter (val students: List<Student>) : RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(layoutInflater)
    }

    override fun getItemCount() = students.size

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val item = students[position]
        holder.bind(item)
    }
}