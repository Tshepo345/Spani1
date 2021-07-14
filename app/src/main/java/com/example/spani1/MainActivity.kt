package com.example.spani1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hide action bar
        supportActionBar?.hide()
        // get reference to button
        val page1 = findViewById(R.id.page1) as Button
        page1.setOnClickListener {
            
             Intent(this, Page1Activity::class.java).also {
                 startActivity(it)
             }


            }
        val page2 = findViewById(R.id.page2) as Button
        page2.setOnClickListener {
            Intent(this, Page2Activity::class.java).also {
                startActivity(it)
            }


        }
        }


    }
