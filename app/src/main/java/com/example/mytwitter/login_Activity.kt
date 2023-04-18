package com.example.mytwitter

import android.R
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    private var loginButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // initialize the login button
        loginButton = findViewById(R.id.login_button)
        loginButton.setOnClickListener(object : DialogInterface.OnClickListener() {
            fun onClick(view: View?) {
                // simulate a successful login
                simulateLogin()
                // start the HomeActivity
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
                finish() // finish the LoginActivity so that the user can't go back to it
            }
        })
    }

    private fun simulateLogin() {
        // simulate a successful login by adding some delay
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}
