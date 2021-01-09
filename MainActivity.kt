package com.busra.Kod1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    var sayi1 : Double? = null
    var sayi2 : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun top(view : View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2== null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc =sayi1!! + sayi2!!
            textView4.text = "${sonuc}"
        }
    }
    fun cikar(view : View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2== null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc =sayi1!! - sayi2!!
            textView4.text = "${sonuc}"
        }
    }
    fun bol(view : View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2== null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc =sayi1!! / sayi2!!
            textView4.text = "${sonuc}"
        }
    }
    fun carp(view : View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2== null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc =sayi1!! * sayi2!!
            textView4.text = "${sonuc}"
        }
    }
    fun faktor (view : View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc=1.0
            while (sayi1 != 0.0){
                sonuc = sayi1!! * sonuc!!
                sayi1 = (sayi1!! -1)
            }
            textView4.text = "${sonuc}"
        }
    }
    fun mod (view : View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2== null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc =sayi1!! % sayi2!!
            textView4.text = "${sonuc}"
        }
    }
    fun karesi(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2== null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc =sayi1!! * sayi1!!
            textView4.text = "${sonuc}"
        }
    }
    fun usalma(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2==null) {
            textView4.text = "Did not enter number"
        }else{
            if (sayi2!! > 0){
                //sonuc = Math.pow(sayi1!!,sayi2!!) //tek satırla us alma
                sonuc=1.0
                while (sayi2 != 0.0){
                    sonuc = sayi1!! * sonuc!!
                    sayi2 = (sayi2!! -1)
                }
                textView4.text = "${sonuc}"
            }else{
                sonuc=1.0
                while (sayi2 != 0.0){
                    sonuc = sayi1!! * sonuc!!
                    sayi2 = (sayi2!! +1)
                }
                sonuc = 1 / sonuc!!
                textView4.text = "${sonuc}"
            }
        }
    }
    fun kesir(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc = 1.0 / sayi1!!
            textView4.text = "${sonuc}"
        }
    }
    fun eusu(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc=1.0
            while (sayi1 != 0.0){
                sonuc = 2.7182818285 * sonuc!!
                sayi1 = (sayi1!! -1)
            }
            textView4.text = "${sonuc}"
        }
    }
    fun karekok(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            sonuc = Math.sqrt(sayi1!!) // karekok aliyor
            textView4.text = "${sonuc}"
        }
    }
    fun cos(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            var radyan = sayi1!! * (Math.PI/180)
            sonuc = Math.cos(radyan)
            textView4.text = "${sonuc}"
        }
    }
    fun sin (view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            var radyan = sayi1!! * (Math.PI/180)
            sonuc = Math.sin(radyan)
            textView4.text = "${sonuc}"
        }
    }
    fun tan(view: View){
        sayi1= editText.text.toString().toDoubleOrNull()
        sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1 == null) {
            textView4.text = "Did not enter number"
        }else{
            var radyan = sayi1!! * (Math.PI/180)
            sonuc = Math.tan(radyan)
            textView4.text = "${sonuc}"
        }
    }
}