package com.example.mytwitter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CreateTweets : AppCompatActivity() {

    private lateinit var tweet_text_view: EditText
    private lateinit var postButton: Button

    private val tweetList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.createatweet)

        tweet_text_view = findViewById(R.id.tweet_text_view)
        postButton = findViewById(R.id.PostTweetButton)

        postButton.setOnClickListener {
            val tweet = tweet_text_view.text.toString()
            if (tweet.isNotEmpty()) {
                tweetList.add(tweet)
                tweet_text_view.text.clear()
            }
        }

        val postButton: Button = findViewById(R.id.PostTweetButton)
        postButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

