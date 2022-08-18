package com.example.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_oyun_ekrani.*

class OyunEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_ekrani)


        button.setOnClickListener {

            Toast.makeText(this@OyunEkrani,"Vefa Can Beytorun",Toast.LENGTH_SHORT).show()



        }

        buttonOyna.setOnClickListener {


            val intent = Intent(this@OyunEkrani,OyunEkraniB::class.java)

            startActivity(intent)


        }



    }
}