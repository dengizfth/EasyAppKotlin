package com.example.yabgu.kotlinsamplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }


    fun sum(view: View){

        val sayi1:Float = firstTextInput.text.toString().toFloat()
        val sayi2:Float = secondTextInput.text.toString().toFloat()

        val sonuc:Float = sayi1+sayi2


        resultView.text = "$sonuc"

    }

    fun sub(view: View){

        val sayi1 = firstTextInput.text.toString().toFloat()
        val sayi2 = secondTextInput.text.toString().toFloat()

        val sonuc:Float = sayi1-sayi2


        resultView.text = "$sonuc"


    }

    fun simply(view: View){

        val sayi1:Float = firstTextInput.text.toString().toFloat()
        val sayi2:Float = secondTextInput.text.toString().toFloat()

        val sonuc:Float = sayi1*sayi2


        resultView.text = "$sonuc"


    }

    fun div(view: View){

        val sayi1 = firstTextInput.text.toString().toFloat()
        val sayi2 = secondTextInput.text.toString().toFloat()

        val sonuc:Float = sayi1/sayi2


        resultView.text = "$sonuc"



    }












}
