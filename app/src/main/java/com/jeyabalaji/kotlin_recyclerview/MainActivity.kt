package com.jeyabalaji.kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 2)


        val arrayOfImages = intArrayOf(R.drawable.catanger,R.drawable.cateat, R.drawable.cathandsup,
            R.drawable.catjump, R.drawable.catplay, R.drawable.catsit, R.drawable.catsleep)

        val dataList = ArrayList<Model>()
        dataList.add(Model(arrayOfImages.get(0)))
        dataList.add(Model( arrayOfImages.get(1)))
        dataList.add(Model( arrayOfImages.get(2)))
        dataList.add(Model( arrayOfImages.get(3)))

        val recyclerViewDataAdapter = DataAdapter(dataList,this)

        recyclerView.adapter = recyclerViewDataAdapter;
    }
}
