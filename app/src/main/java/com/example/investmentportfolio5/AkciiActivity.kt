package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AkciiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akcii)
    }
    fun buttonSendClick6(view: View) {
        val intent: Intent = Intent(this@AkciiActivity, InvestActivity::class.java)
        startActivity(intent)


    }
}