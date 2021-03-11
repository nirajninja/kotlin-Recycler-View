package com.example.recycler_view_tutorial

import android.media.session.PlaybackState
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_item.view.*

class TodoAdapter(var todos:List<Todo>):RecyclerView.Adapter<TodoAdapter.todoViewHolder>() {
    inner class todoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.todo_item, parent, false)

        return todoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: todoViewHolder, position: Int) {

        holder.itemView.apply {
            tvTitle.text=todos[position].title
            cbDone.isChecked=todos[position].isChecked
        }
    }
}