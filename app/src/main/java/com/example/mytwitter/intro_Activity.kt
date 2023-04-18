package com.example.mytwitter

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity


private val IntroActivity.root: Int
    get() {}

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: IntroActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = IntroActivity.inflate (layoutInflater)
        setContentView(binding.root)

        // set up the intro UI elements and animations

        Handler(Looper.getMainLooper()).postDelayed({
            // start the LoginActivity after a delay of 2 seconds
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}

