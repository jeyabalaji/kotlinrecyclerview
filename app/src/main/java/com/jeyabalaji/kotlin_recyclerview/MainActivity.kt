package com.jeyabalaji.kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        Initializing the type of layout, here I have used LinearLayoutManager you can try GridLayoutManager
//        Based on your requirement to allow vertical or horizontal scroll , you can change it in  LinearLayout.VERTICAL
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)



        val dataList = ArrayList<Model>()
        dataList.add(Model("Phone", 1))
        dataList.add(Model("Watch", 2))
        dataList.add(Model("Note", 3))
        dataList.add(Model("Pin", 4))

        val recyclerViewDataAdapter = DataAdapter(dataList)

        recyclerView.adapter = recyclerViewDataAdapter;
    }
}
