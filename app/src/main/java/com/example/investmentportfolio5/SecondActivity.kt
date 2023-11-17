package com.example.investmentportfolio5

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.textView3)
        val arguments: Bundle? = intent.extras
        if (arguments != null) {
            val editTextPhone: String = arguments.get("editTextPhone").toString()
            val editTextTextPassword: String? = arguments.getString("editTextTextPassword")

            textView.text =
                "editTextPhone: $editTextPhone \neditTextTextPassword: $editTextTextPassword"
        }


    }

    fun buttonSendClick2(view: View) {
        val intent: Intent = Intent(this@SecondActivity, InvestActivity::class.java)
        startActivity(intent)


    }
}
