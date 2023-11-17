package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OneLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_level)
    }
    fun buttonSendClick15(view: View){
        val intent: Intent = Intent(this@OneLevelActivity, PortfelActivity::class.java)
        startActivity(intent)
    }
}