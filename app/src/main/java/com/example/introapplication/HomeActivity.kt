package com.example.introapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_home)
        val bundle:Bundle?= intent.extras
        val username = bundle?.get("USERNAME")
        val email = bundle?.get("EMAIL")
        val address = bundle?.get("ADDRESS")
        val city = bundle?.get("CITY")
        val zip = bundle?.get("ZIP")
        txtName.text = username.toString()
        txtEmail.text = email.toString()
        txtAddress.text = address.toString()
        txtCity.text = city.toString()
        txtZipCode.text = zip.toString()
    }

}
