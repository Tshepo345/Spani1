package com.example.spani1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        //hide action bar
        supportActionBar?.hide()

        val btnBack = findViewById(R.id.btnBack) as Button
         btnBack.setOnClickListener {
         finish()
     }
    }
}