package com.example.introapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.btnRegister
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_register)

        Toast.makeText(this, "Enter your information here to register.", Toast.LENGTH_LONG).show()

        btnRegister.setOnClickListener{
            intent= Intent(this, LoginActivity::class.java)
            intent.putExtra("USERNAME",edtName.text.toString())
            intent.putExtra("PASSWORD",edtPassword.text.toString())
            intent.putExtra("EMAIL",edtEmail.text.toString())
            intent.putExtra("ADDRESS",edtAddress.text.toString())
            intent.putExtra("CITY",edtCity.text.toString())
            intent.putExtra("ZIP",edtZipCode.text.toString())
            startActivity(intent)
            //Toast.makeText(this, "Press Login to login to your profile.", Toast.LENGTH_LONG).show()
        }

        btnCancel.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
