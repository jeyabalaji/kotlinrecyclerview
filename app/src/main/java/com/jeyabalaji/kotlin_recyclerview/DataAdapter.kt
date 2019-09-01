package com.jeyabalaji.kotlin_recyclerview

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DataAdapter(val userList: ArrayList<Model>, context : Context) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    val context:Context = context

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup?.context).inflate(R.layout.adapter_item_layout, viewGroup, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Glide.with(context).load(userList[position].imageId).into(viewHolder.image)

        viewHolder.image.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                println("successful")
                //call media player to play music
                val mediaPlayer = MediaPlayer.create(context, R.raw.soundfile)
                mediaPlayer.start()
            }
        })
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.thumbnail)

    }
}