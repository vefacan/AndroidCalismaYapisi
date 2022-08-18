package com.example.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oyun_ekrani.*
import kotlinx.android.synthetic.main.activity_oyun_ekrani_b.*

class OyunEkraniB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_ekrani_b)



        buttonBitir.setOnClickListener {

            val intent = Intent(this@OyunEkraniB,OyunEkraniC::class.java)

            finish()

            startActivity(intent)

        }
    }
}