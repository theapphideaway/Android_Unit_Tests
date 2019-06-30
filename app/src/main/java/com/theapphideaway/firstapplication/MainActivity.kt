package com.theapphideaway.firstapplication
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        rv_todo.layoutManager = LinearLayoutManager(this)

        viewModel.liveDataItem.observe(this, Observer<List<ToDoResponse>>{
            rv_todo.adapter = TodoAdapter(it!!, this@MainActivity)
        })

        viewModel.getTodoItems()
    }
}