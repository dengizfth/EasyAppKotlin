package com.example.yabgu.catchtheflag

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.example.yabgu.catchtheflag.R.id.scoreView
import com.example.yabgu.catchtheflag.R.id.timeText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    var score : Int = 0

    var imageArray = ArrayList<ImageView>()
    var handlere : Handler = Handler()
    var runnable : Runnable = Runnable {  }









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        score = 0

        imageArray = arrayListOf(imageView,imageView1,imageView2,imageView3,imageView4,imageView5,
                imageView6,imageView7,imageView8,imageView9,imageView10,imageView11)

        zamanlayici()





    }



    fun zamanlayici(){
        object : CountDownTimer(30000,1000){
            override fun onFinish() {
                timeText.text = "Time's up"

                // Oyunu zaman bittiğinde Durduğum alan .
                handlere.removeCallbacks(runnable)
                // Oyun durunca Açıkta kalan Resimleri Sakladığım alan
                for(images in imageArray){
                    images.visibility = View.INVISIBLE
                }

                ekranKutu()





            }

            override fun onTick(p0: Long) {
                timeText.text = "Time : " + p0/1000



            }


        }.start()
        resimSakla()
    }

    fun resimSakla(){

        runnable = object : Runnable{
            override fun run() {
                for(images in imageArray){
                    images.visibility = View.INVISIBLE
                 }

                 val random = Random()
                 val index = random.nextInt(11-0)

                 imageArray[index].visibility = View.VISIBLE

                 handlere.postDelayed(runnable,500)




            }

        }
        handlere.post(runnable)

    }




    fun tikla(view: View){


        score++

        scoreView.text = "Score : "+ score


    }




    fun ekranKutu(){

        val alert = AlertDialog.Builder(this)

        alert.setTitle(" Oyun Bitti!!  ")
        alert.setMessage("Skorunuz : $score")
        alert.setPositiveButton("Restart(Yeniden Oyna)") { dialogInterface: DialogInterface, i: Int -> zamanlayici() }
       // alert.setNegativeButton("No") {dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show() }
        alert.show()



    }






}
