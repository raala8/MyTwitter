package com.example.mytwitter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class CreateAccountActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var createButton: Button
    private lateinit var overlayLayout: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        // Initialize views
        nameEditText = findViewById(R.id.et_name)
        usernameEditText = findViewById(R.id.et_username)
        passwordEditText = findViewById(R.id.et_password)
        createButton = findViewById(R.id.btn_create)
        overlayLayout = findViewById(R.id.overlay)

        // Set up click listener for create button
        createButton.setOnClickListener {
            // Show progress bar
            overlayLayout.visibility = View.VISIBLE
            // Call method to create account
            createAccount()
        }
    }

    private fun createAccount() {
        // Get values from input fields
        val name = nameEditText.text.toString()
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        // TODO: Implement account creation logic
    }
}
