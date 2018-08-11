package com.example.yabgu.kotlinlandmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var landMarkNames = ArrayList<String>()

        landMarkNames.add("Bayrak")
        landMarkNames.add("At")
        landMarkNames.add("Kız Kulesi")
        landMarkNames.add("Boğaziçi Üniversitesi")


        val at = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.at)
        val bayrak = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bayrak)
        val kizKulesi = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kizkulesi)
        val bogaziciUni= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bogazici)
        var imagesArray = ArrayList<Bitmap>()
        imagesArray.add(bayrak)
        imagesArray.add(at)
        imagesArray.add(kizKulesi)
        imagesArray.add(bogaziciUni)


        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landMarkNames)
        listView.adapter = arrayAdapter


        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(applicationContext,ListDetail::class.java)
            intent.putExtra("name",landMarkNames[i])

            var bitmap = imagesArray[i]

            var chosen = Globals.Choosen

            chosen.chosenImage = bitmap

            startActivity(intent)







        }


    }
}
