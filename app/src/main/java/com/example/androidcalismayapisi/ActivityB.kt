package com.example.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        /* val gelenVeri = intent.getStringExtra("veri")
        textViewCikti.text = gelenVeri



        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)


            Log.e("mesaj",gelenMesaj.toString())
            Log.e("yas",gelenYas.toString())
            Log.e("boy",gelenBoy.toString())


        val gelenKisi = intent.getSerializableExtra("nesne") as Kisiler

        Log.e("KİŞİ TCNO", (gelenKisi.tcNo).toString())
        Log.e("KİŞİ İSİM",(gelenKisi.isim))
        Log.e("KİŞİ BOY",(gelenKisi.boy).toString()) */


        buttonGoToC.setOnClickListener {

            val yeniIntent = Intent(this@ActivityB,ActivityC::class.java)
            startActivity(yeniIntent)
        }



    }

}