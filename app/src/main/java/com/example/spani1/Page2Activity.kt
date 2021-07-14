package com.example.spani1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        //hide action bar
        supportActionBar?.hide()

        val btnBack = findViewById(R.id.btnBack) as Button
        btnBack.setOnClickListener {
            finish()
        }
    }
}