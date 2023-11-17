package com.example.investmentportfolio5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InvestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invest)
    }

    fun buttonSendClick3(view: View) {
        val intent: Intent = Intent(this@InvestActivity, ObligaciiActivity::class.java)
        startActivity(intent)


    }

    fun buttonSendClick5(view: View) {
        val intent: Intent = Intent(this@InvestActivity, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick7(view: View){
        val intent: Intent = Intent(this@InvestActivity, SirieActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick10(view: View){
        val intent: Intent = Intent(this@InvestActivity, FuturesActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick11(view: View){
        val intent: Intent = Intent(this@InvestActivity, PortfelActivity::class.java)
        startActivity(intent)
    }
    fun buttonSendClick19(view: View){
        val intent: Intent = Intent(this@InvestActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}