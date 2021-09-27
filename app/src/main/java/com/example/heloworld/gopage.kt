package com.example.heloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class gopage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gopage)
        var txt = findViewById<TextView>(R.id.txt)
        txt.text = intent.getStringExtra("info")
    }
}