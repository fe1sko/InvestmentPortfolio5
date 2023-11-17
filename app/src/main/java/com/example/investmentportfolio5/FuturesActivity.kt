package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FuturesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futures)
    }
    fun buttonSendClick9(view: View) {
        val intent: Intent = Intent(this@FuturesActivity, InvestActivity::class.java)
        startActivity(intent)


    }
}