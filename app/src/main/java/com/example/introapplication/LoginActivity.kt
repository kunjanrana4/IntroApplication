package com.example.introapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_login)
        val bundle:Bundle?= intent.extras
        val username = bundle?.get("USERNAME")
        val password = bundle?.get("PASSWORD")
        val email = bundle?.get("EMAIL")
        val address = bundle?.get("ADDRESS")
        val city = bundle?.get("CITY")
        val zip = bundle?.get("ZIP")
        edtName.text = username as Editable?
        edtPassword.text = password as Editable?

        btnLogin.setOnClickListener{
            if(username.isNullOrBlank() or password.isNullOrBlank())
            {
                Toast.makeText(this,"First you need to register.", Toast.LENGTH_LONG).show()
            }
            else
            {
                intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("USERNAME",username.toString())
                intent.putExtra("EMAIL",email.toString())
                intent.putExtra("ADDRESS",address.toString())
                intent.putExtra("CITY",city.toString())
                intent.putExtra("ZIP",zip.toString())
                startActivity(intent)
                Toast.makeText(this,"Welcome to your Profile", Toast.LENGTH_LONG).show()
            }
        }
    }

}
