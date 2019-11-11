package com.jeyabalaji.kotlin_recyclerview

import android.content.Context
import android.media.MediaPlayer
import android.provider.MediaStore
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
                System.out.println("position clickec: "+position)

                val mediaPlayer = buildMediaPlayer(position)
                if(mediaPlayer!= null && mediaPlayer.isPlaying) {
                    mediaPlayer.stop()
                    mediaPlayer.release()
                } else mediaPlayer?.start()
            }
        })
    }

    fun buildMediaPlayer(position: Int): MediaPlayer? {
            if(position.equals(1)) {
                return MediaPlayer.create(context, R.raw.s9)
            } else if(position.equals(2)) {
                return MediaPlayer.create(context, R.raw.s1)
            } else if(position.equals(3)) {
                return MediaPlayer.create(context, R.raw.s2)
            } else if(position.equals(4)) {
                return MediaPlayer.create(context, R.raw.s3)
            } else if(position.equals(5)) {
                return MediaPlayer.create(context, R.raw.s4)
            } else if(position.equals(6)) {
                return MediaPlayer.create(context, R.raw.s5)
            } else if(position.equals(7)) {
                return MediaPlayer.create(context, R.raw.s6)
            } else if(position.equals(8)) {
                return MediaPlayer.create(context, R.raw.s7)
            } else if(position.equals(9)) {
                return MediaPlayer.create(context, R.raw.s8)
            } else if(position.equals(0)) {
                return MediaPlayer.create(context, R.raw.s12)
            }
        return null
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.thumbnail)

    }
}