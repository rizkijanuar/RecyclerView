package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(R.drawable.ic_list, R.drawable.ic_checkbox, R.drawable.ic_image, R.drawable.ic_toggle, R.drawable.ic_date, R.drawable.ic_rating, R.drawable.ic_image, R.drawable.ic_toggle, R.drawable.ic_date, R.drawable.ic_rating, R.drawable.ic_time, R.drawable.ic_text, R.drawable.ic_edit, R.drawable.ic_camera)
        titleList = arrayOf("ListView", "Checkbox", "Image", "Toggle", "Date", "Rating", "Image", "Toggle", "Date", "Rating", "Time", "Text", "Edit", "Camera")

        recyclerView = findViewById(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = ArrayList()
        getData()

    }

    private fun getData() {
        for (i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }


}