package com.example.beedevelopers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test_btn.setOnClickListener(this)

        // Agregar OnClickListener de manera indiviual
        /*test_btn.setOnClickListener {
            val saludo = "Hola ${name_et.text}"

            saludo_tv.text = saludo
        }*/
    }

    // Listener por Activity
    override fun onClick(v: View?) {
        when (v!!.id) {
            test_btn.id -> {
                val saludo = "Hola ${name_et.text}"

                saludo_tv.text = saludo
            }
        }
    }
}
