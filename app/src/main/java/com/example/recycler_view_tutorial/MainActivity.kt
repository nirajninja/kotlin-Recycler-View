package com.example.recycler_view_tutorial

import android.content.Intent
import android.graphics.Insets.add
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OneShotPreDrawListener.add
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),TodoAdapter.ontodoItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todoList= mutableListOf(
            Todo("arrays","https://www.geeksforgeeks.org/",R.drawable.ic_baseline_android_24),
            Todo("c++","https://www.geeksforgeeks.org/",R.drawable.map)

        )

        val adapter=TodoAdapter(todoList,this)
        rvTodo.adapter=adapter
        rvTodo.layoutManager=LinearLayoutManager(this)

        /*btnAddTodo.setOnClickListener {
            val title=etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemChanged(todoList.size-1)

        }
*/




    }

    override fun onItemClick(item: Todo, position: Int) {

        val url = item.link
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
        Toast.makeText(this,"${item.title }item clicked",Toast.LENGTH_SHORT).show()
    }
/*
    override fun onItemClick(position: Int) {

        Toast.makeText(this,"itemclicked",Toast.LENGTH_SHORT).show()
    }*/
}