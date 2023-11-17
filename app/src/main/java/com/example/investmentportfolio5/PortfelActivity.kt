package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PortfelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfel)
    }
    fun buttonSendClick12(view: View){
        val intent: Intent = Intent(this@PortfelActivity, OneLevelActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick13(view: View){
        val intent: Intent = Intent(this@PortfelActivity, TwoLevelActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick14(view: View){
        val intent: Intent = Intent(this@PortfelActivity, ThreeLevelActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick18(view: View){
        val intent: Intent = Intent(this@PortfelActivity, InvestActivity::class.java)
        startActivity(intent)
    }
}