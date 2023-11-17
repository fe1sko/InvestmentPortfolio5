package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ObligaciiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obligacii)
    }
    fun buttonSendClick4(view: View) {
        val intent: Intent = Intent(this@ObligaciiActivity, InvestActivity::class.java)
        startActivity(intent)


    }
}