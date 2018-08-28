package com.example.yabgu.uctas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var oyunSirasi : Int = 0
    var oyunDurdur   =  Array<Int>(9){0}
    var oyunSonucu = Array<Char>(9){' '}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        oyunSirasi = 0


    }


    fun tikla(view: View){
        if(oyunDurdur[0] == 0) {
            if (oyunSirasi % 2 == 0) {
                textView.text = "X"
                oyunSonucu[0] = 'X'
            } else {
                textView.text = "Y"
                oyunSonucu[0] = 'Y'
            }
            oyunSirasi++
        }
        oyunDurdur[0] += 1
        OyunSonucu()

    }
    fun tikla2(view: View){
        if(oyunDurdur[1] == 0) { if ( oyunSirasi%2 == 0){
            textView2.text = "X"
            oyunSonucu[1] = 'X'
        }
        else {
            textView2.text = "Y"
            oyunSonucu[1] = 'Y'
        }
            oyunSirasi++}
        oyunDurdur[1] += 1
        OyunSonucu()

    }
    fun tikla3(view: View){
        if(oyunDurdur[2] == 0) {
            if ( oyunSirasi%2 == 0){
                textView3.text = "X"
                oyunSonucu[2] = 'X'
            }
            else {
                textView3.text = "Y"
                oyunSonucu[2] = 'Y'
            }
                oyunSirasi++
        }
        oyunDurdur[2] += 1
        OyunSonucu()

    }
    fun tikla4(view: View){
        if(oyunDurdur[3] == 0) {
            if ( oyunSirasi%2 == 0){
                textView4.text = "X"
                oyunSonucu[3] = 'X'
            }
            else {
                textView4.text = "Y"
                oyunSonucu[3] = 'Y'
            }
            oyunSirasi++
        }
        oyunDurdur[3] += 1

        OyunSonucu()

    }
    fun tikla5(view: View){
        if(oyunDurdur[4] == 0) {
            if ( oyunSirasi%2 == 0){
                textView5.text = "X"
                oyunSonucu[4] = 'X'
            }
            else {
                textView5.text = "Y"
                oyunSonucu[4] = 'Y'
            }
            oyunSirasi++}
        oyunDurdur[4] += 1

        OyunSonucu()

    }
    fun tikla6(view: View){
        if(oyunDurdur[5] == 0) {if ( oyunSirasi%2 == 0){
            textView6.text = "X"
            oyunSonucu[5] = 'X'
        }
        else {
            textView6.text = "Y"
            oyunSonucu[5] = 'Y'
        }
            oyunSirasi++}
        oyunDurdur[5] += 1

        OyunSonucu()


    }
    fun tikla7(view: View){
        if(oyunDurdur[6] == 0) {if ( oyunSirasi%2 == 0){
            textView7.text = "X"
            oyunSonucu[6] = 'X'
        }
        else {
            textView7.text = "Y"
            oyunSonucu[6] = 'Y'
        }
            oyunSirasi++}
        oyunDurdur[6] += 1
        OyunSonucu()


    }
    fun tikla8(view: View){
        if(oyunDurdur[7] == 0) {
            if ( oyunSirasi%2 == 0){
                textView8.text = "X"
                oyunSonucu[7] = 'X'
            }
            else {
                textView8.text = "Y"
                oyunSonucu[7] = 'Y'
            }
            oyunSirasi++
        }
        oyunDurdur[7] += 1

        OyunSonucu()

    }
    fun tikla9(view: View){
        if(oyunDurdur[8] == 0) {
            if ( oyunSirasi%2 == 0){
            textView9.text = "X"
                oyunSonucu[8] = 'X'
            }
            else {
            textView9.text = "Y"
                oyunSonucu[8] = 'Y'
            }
            oyunSirasi++
        }

        oyunDurdur[8] += 1

        OyunSonucu()

    }


    fun OyunSonucu() {
        if (oyunSirasi == 9) {


        if ((oyunSonucu[0] == 'X' && oyunSonucu[1] == 'X' && oyunSonucu[2] == 'X') ||
                (oyunSonucu[3] == 'X' && oyunSonucu[4] == 'X' && oyunSonucu[5] == 'X') ||
                (oyunSonucu[6] == 'X' && oyunSonucu[7] == 'X' && oyunSonucu[8] == 'X') ||

                (oyunSonucu[0] == 'X' && oyunSonucu[3] == 'X' && oyunSonucu[6] == 'X') ||
                (oyunSonucu[1] == 'X' && oyunSonucu[4] == 'X' && oyunSonucu[7] == 'X') ||
                (oyunSonucu[2] == 'X' && oyunSonucu[5] == 'X' && oyunSonucu[8] == 'X') ||

                (oyunSonucu[0] == 'X' && oyunSonucu[4] == 'X' && oyunSonucu[8] == 'X') ||
                (oyunSonucu[2] == 'X' && oyunSonucu[4] == 'X' && oyunSonucu[6] == 'X')
        ) {
            sonucView.text = "1. Oyuncu Kazandı"

        }
        else if ((oyunSonucu[0] == 'Y' && oyunSonucu[1] == 'Y' && oyunSonucu[2] == 'Y') ||
                (oyunSonucu[3] == 'Y' && oyunSonucu[4] == 'Y' && oyunSonucu[5] == 'Y') ||
                (oyunSonucu[6] == 'Y' && oyunSonucu[7] == 'Y' && oyunSonucu[8] == 'Y') ||

                (oyunSonucu[0] == 'Y' && oyunSonucu[3] == 'Y' && oyunSonucu[6] == 'Y') ||
                (oyunSonucu[1] == 'Y' && oyunSonucu[4] == 'Y' && oyunSonucu[7] == 'Y') ||
                (oyunSonucu[2] == 'Y' && oyunSonucu[5] == 'Y' && oyunSonucu[8] == 'Y') ||

                (oyunSonucu[0] == 'Y' && oyunSonucu[4] == 'Y' && oyunSonucu[8] == 'Y') ||
                (oyunSonucu[2] == 'Y' && oyunSonucu[4] == 'Y' && oyunSonucu[6] == 'Y')
        ) {
            sonucView.text = "2. Oyuncu Kazandı"

        } else {
            sonucView.text = "Kardeşlik Kazandı"

        }


    }

    }















}
