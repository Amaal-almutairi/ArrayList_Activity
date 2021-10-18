package com.example.arraylistactivity

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var ednames:EditText
    lateinit var endix:EditText
    lateinit var btnNames:Button
    lateinit var btnNamber:Button
    lateinit var display:TextView
    lateinit var names :ArrayList<String>
    lateinit var share:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ednames=findViewById(R.id.edarray)
        endix = findViewById(R.id.ednumber)
        btnNames = findViewById(R.id.b1)
        btnNamber = findViewById(R.id.b2)
        display = findViewById(R.id.tv)

        names = ArrayList()

        btnNames.setOnClickListener {
            var nam = ednames.text.toString()
            names.add(nam)
            display.text= "${nam}"

        }

        btnNamber.setOnClickListener {
        //    var i ="".toInt()
            var index = endix.text.toString().toInt()
            names.get(index)
            display.text= "${names[index]}"

        }


    }


    }
