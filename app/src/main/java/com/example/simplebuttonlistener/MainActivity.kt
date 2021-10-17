package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var b1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1=findViewById(R.id.b1)
        b1.setOnClickListener {
            Toast.makeText(this, "implemented using Kotlin code", Toast.LENGTH_SHORT).show()
        }
    }
    fun xmlbutton(view: android.view.View) {
        Toast.makeText(this, "implemented using XML", Toast.LENGTH_SHORT).show()
    }
}