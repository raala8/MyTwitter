package com.example.mytwitter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.drawee.backends.pipeline.Fresco


class ComposeTweetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(R.layout.activity_compose_tweet)

        toolbar.setNavigationOnClickListener { finish() }

        btn_update_tweet.setOnClickListener {
            // Implement update tweet functionality here
        }
    }
}
