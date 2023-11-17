package com.example.investmentportfolio5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonSendClick(view: View){
        val intent: Intent = Intent(this@MainActivity,SecondActivity::class.java)
                    startActivity(intent)
    }
    }

