package com.example.mytwitter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class ComposeTweet_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose_tweet)

        // Set toolbar as the action bar
        setSupportActionBar(toolbar)

        // Set the navigation icon listener
        toolbar.setNavigationOnClickListener {
            finish()
        }

        // Set the Tweet button click listener
        btn_tweet.setOnClickListener {
            // Get the tweet text
            val tweetText = et_tweet_text.text.toString()

            // Post the tweet
            postTweet(tweetText)
        }
    }

    private fun postTweet(tweetText: String) {
        // TODO: Implement the logic to post the tweet

        // Display a toast message to confirm the tweet was posted
        Toast.makeText(this, "Tweet posted: $tweetText", Toast.LENGTH_SHORT).show()
    }
}
