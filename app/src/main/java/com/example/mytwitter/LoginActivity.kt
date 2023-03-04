package com.example.mytwitter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logininterface)

        // Find the email and password EditText views
        editTextUsername = findViewById(R.id.editTextTextUsername)
        editTextTextPassword = findViewById(R.id.editTextTextPassword)

        // Find the login button and set its click listener
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // Navigate to the MainActivity when the login button is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
