package com.example.recyclerview_adapterkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemList=generateDummyList(50)
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.adapter=ItemAdapter(itemList)
        recyclerView?.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView?.setHasFixedSize(true)
    }

    private fun generateDummyList(size:Int):List<Item>{
        val list=ArrayList<Item>()

        for (i in 0 until size){
            val drawable=when(i % 3){
                0->R.drawable.a
                1->R.drawable.b
                else ->R.drawable.c
            }
            val item=Item(drawable,"Head$i","Desc$i")
            list.add(item)
        }
        return list

    }
}