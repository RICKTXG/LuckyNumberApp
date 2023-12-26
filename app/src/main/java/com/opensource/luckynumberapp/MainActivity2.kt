package com.opensource.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text1 : TextView = findViewById(R.id.txt2)
        val luckyText : TextView = findViewById(R.id.result)
        val shareBtn : Button = findViewById(R.id.btn2)
        var user_name = receiveUserName()

        var random_num = generateRandomNum()

       luckyText.setText(""+random_num)
        shareBtn.setOnClickListener(){
            sharedata(user_name,random_num)
        }

    }


    fun receiveUserName() : String {
        var bundle: Bundle?= intent.extras
        var username = bundle?.get("name").toString()
        return username
    }

    //Random number
    fun generateRandomNum():Int {
        val random = Random.nextInt(1000)
        return random
    }

    //Share data via button

    fun sharedata(username:String,num:Int){
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT,"$username 's lucky number is $num")
        startActivity(i)
    }

}