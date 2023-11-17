package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TwoLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_level)
    }
    fun buttonSendClick16(view: View){
        val intent: Intent = Intent(this@TwoLevelActivity, PortfelActivity::class.java)
        startActivity(intent)
    }
}