package com.example.introapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener{
            intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Enter your Login information.", Toast.LENGTH_LONG).show()
        }
        btnRegister.setOnClickListener{
            intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Enter your information to register.", Toast.LENGTH_LONG).show()
        }
    }
}
