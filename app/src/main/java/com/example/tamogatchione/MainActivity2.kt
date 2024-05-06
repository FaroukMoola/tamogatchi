package com.example.tamogatchione

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun buttonClicked(view: View) {
        val button = view as Button
        val imageView = findViewById<ImageView>(R.id.pet_image_view)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progressBar2 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar3 = findViewById<ProgressBar>(R.id.progressBar3)

        when (button.id) {
            R.id.play_button -> {
                imageView.setImageResource(R.drawable.img_1)
                progressBar.incrementProgressBy(10)
            }
            R.id.feed_button -> {
                imageView.setImageResource(R.drawable.img_2)
                progressBar2.incrementProgressBy(10)
            }
            R.id.clean_button -> {
                imageView.setImageResource(R.drawable.img_3)
                progressBar3.incrementProgressBy(10)
            }



        }
    }
}

