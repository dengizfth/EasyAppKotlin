package com.example.yabgu.kotlinlandmarkbook

import android.graphics.Bitmap

class Globals {

    companion object Choosen{

        var chosenImage : Bitmap? = null
        fun returnImage():Bitmap {

            return  chosenImage!!
        }

    }


}