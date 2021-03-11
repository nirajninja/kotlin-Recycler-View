package com.example.recycler_view_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todoList= mutableListOf(
            Todo("niraj",true),
            Todo("hello",false)
        )

        val adapter=TodoAdapter(todoList)
        rvTodo.adapter=adapter
        rvTodo.layoutManager=LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title=etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemChanged(todoList.size-1)

        }
    }
}