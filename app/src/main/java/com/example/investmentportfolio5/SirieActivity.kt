package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SirieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sirie)
    }
    fun buttonSendClick8(view: View) {
        val intent: Intent = Intent(this@SirieActivity, InvestActivity::class.java)
        startActivity(intent)


    }
}