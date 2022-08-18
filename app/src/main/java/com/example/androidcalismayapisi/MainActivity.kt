package com.example.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            buttonGoToB.setOnClickListener {

                /*val kisi = Kisiler(99999,"Vefa",1.98)

                val alinanVeri = editTextGirdi.text.toString()

 */
                val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
 /*
                yeniIntent.putExtra("veri",alinanVeri)
                yeniIntent.putExtra("mesaj","Merhaba")
                yeniIntent.putExtra("yas",23)
                yeniIntent.putExtra("boy",1.80)
                yeniIntent.putExtra("nesne",kisi) */

                startActivity(yeniIntent)
            }

    }
}