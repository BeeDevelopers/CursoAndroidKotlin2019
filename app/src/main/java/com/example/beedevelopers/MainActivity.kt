package com.example.beedevelopers

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val email = "h"
    val pass = "h"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Agregar OnClickListener de manera indiviual
        login_btn.setOnClickListener {
            if (email_et.text.toString() == email && pass_et.text.toString() == pass) {
                // Mostrar un Toast
                Toast.makeText(this, "Loggeado!", Toast.LENGTH_LONG).show()

                // Abrir una activity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            } else {
                // Mostrar un Alert
                val builder = AlertDialog.Builder(this)
                builder.setTitle("ERROR")
                builder.setMessage("Contraseña incorrecta")
                builder.setPositiveButton("Aceptar") { dialogInterface: DialogInterface, i: Int ->

                }

                val alert: AlertDialog = builder.create()
                alert.show()
            }

        }
    }
}
