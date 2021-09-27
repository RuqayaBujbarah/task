package com.example.heloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tbtn = findViewById<Button>(R.id.tbtn)
        var tvbtn = findViewById<Button>(R.id.tvbtn)
        var gbtn = findViewById<Button>(R.id.gbtn)
        var ntxt = findViewById<EditText>(R.id.ntxt)
        var ltxt = findViewById<EditText>(R.id.ltxt)
        var mtxt = findViewById<EditText>(R.id.mtxt)
        var tvtxt = findViewById<TextView>(R.id.tvtxt)
        var mylayout = findViewById<ConstraintLayout>(R.id.clmain)




        tbtn.setOnClickListener(){
            Toast.makeText(applicationContext, "${ntxt.text} \n ${ltxt.text} \n ${mtxt.text}", Toast.LENGTH_LONG).show()
        }

        tvbtn.setOnClickListener(){
            tvtxt.text = "${ntxt.text} \n ${ltxt.text} \n ${mtxt.text}"
        }

        gbtn.setOnClickListener(){
            val intent = Intent(this, gopage::class.java)
            intent.putExtra("info","${ntxt.text} \n ${ltxt.text} \n ${mtxt.text}")
            startActivity(intent)


        }




    }
}