package com.opensource.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 : Button = findViewById(R.id.btn)
        val txt : TextView = findViewById(R.id.textView)
        val editTXT : EditText = findViewById(R.id.EdtTxt1)


        b1.setOnClickListener(){
            var username = editTXT.text
            var i : Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("name",username)
            startActivity(i)
        }
    }


}