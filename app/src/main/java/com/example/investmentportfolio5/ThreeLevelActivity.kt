package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThreeLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_level)
    }
    fun buttonSendClick17(view: View){
        val intent: Intent = Intent(this@ThreeLevelActivity, PortfelActivity::class.java)
        startActivity(intent)
    }
}