package com.example.beedevelopers

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_home.*

import kotlinx.android.synthetic.main.content_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        //Uso del listview
        val members = arrayListOf("Valeria", "Manuel", "Hugo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, members)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Snackbar.make(view, members[position], Snackbar.LENGTH_LONG).show()
        }
    }

}
