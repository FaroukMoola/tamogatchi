package com.example.tamogatchione

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<Button>(R.id.button3)
        next.setOnClickListener{

         val intent = Intent ( this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}

