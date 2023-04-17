package com.example.mytwitter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class myprofile : AppCompatActivity() {

    private lateinit var editTextTextNickname: EditText
    private lateinit var editTextTextAbout_me: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.myprofile)

        editTextTextNickname = findViewById(R.id.editTextTextNickname)
        editTextTextAbout_me = findViewById(R.id.editTextTextAbout_me)

        val button : Button = findViewById(R.id.done_button)
        button.setOnClickListener {
             val  intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
