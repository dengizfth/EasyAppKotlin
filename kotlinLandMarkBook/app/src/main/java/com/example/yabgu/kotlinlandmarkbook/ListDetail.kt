package com.example.yabgu.kotlinlandmarkbook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView



import kotlinx.android.synthetic.main.activity_list_detail.*

class ListDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)


        val intent = intent

        val name = intent.getStringExtra("name")


        textView.text = name


        val chosen = Globals.Choosen
        val selectImages = chosen.returnImage()

        imageView.setImageBitmap(selectImages)

    }
}
