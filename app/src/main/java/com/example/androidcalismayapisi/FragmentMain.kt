package com.example.androidcalismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_main)


        val fm = supportFragmentManager
        val ft = fm.beginTransaction()

        ft.add(R.id.fragment_tutucu1,FragmentBirinci())
        ft.add(R.id.fragment_tutucu2,Fragmentikinci())

        ft.commit()




    }
}