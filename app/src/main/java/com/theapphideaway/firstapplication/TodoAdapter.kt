package com.theapphideaway.firstapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.todo_item.view.*

class TodoAdapter(val todoList: List<ToDoResponse>, val context: Context):RecyclerView.Adapter<TodoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val todo_item =  LayoutInflater.from(context).inflate(R.layout.todo_item, viewGroup, false)
        return ViewHolder(todo_item)
    }

    override fun getItemCount(): Int {
        return todoList.count()
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindTodo(todoList[position].title + todoList[position].userId)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindTodo(todo: String){
            itemView.tv_title.text = todo
        }
    }
}