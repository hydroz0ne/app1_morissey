package com.example.textanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView=findViewById<TextView>(R.id.textView)
        val textView2=findViewById<TextView>(R.id.textView2)
        val textView3=findViewById<TextView>(R.id.textView3)
        val button=findViewById<Button>(R.id.button)
        val imageView=findViewById<ImageView>(R.id.imageView)

        val imageanimation = AnimationUtils.loadAnimation(this, R.anim.anim3)
        imageView.startAnimation(imageanimation)

        val animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        textView.startAnimation(animation)

        val animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        textView2.startAnimation(animation2)

        val animation3 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        textView3.startAnimation(animation3)

        val anime4 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        button.setOnClickListener {
            button.startAnimation(anime4)
        }
    }
}