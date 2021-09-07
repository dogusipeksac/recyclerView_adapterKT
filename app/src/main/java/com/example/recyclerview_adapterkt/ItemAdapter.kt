package com.example.recyclerview_adapterkt

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter(val itemList:List<Item>) : RecyclerView.Adapter<ItemAdapter.MyItemViewHolder>() {


    class MyItemViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val imageResourse:ImageView=itemView.findViewById(R.id.image)
        val head:TextView=itemView.findViewById(R.id.head)
        val desc:TextView=itemView.findViewById(R.id.desc)


        fun bindItems(item: Item) {
            imageResourse.setImageResource(item.imageResource)
            head.text = item.head
            desc.text = item.desc
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,
            parent, false)

        return  MyItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyItemViewHolder, position: Int) {

        holder.bindItems(itemList[position])

    }

    override fun getItemCount()= itemList.size

}