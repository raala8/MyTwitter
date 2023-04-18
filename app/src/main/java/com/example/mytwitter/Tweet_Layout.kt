package com.example.mytwitter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.facebook.drawee.view.SimpleDraweeView

class TweetLayout(context: Context, attrs: AttributeSet?) : RelativeLayout(context, attrs) {

    private val profilePhoto: SimpleDraweeView
    private val nameTextView: TextView
    private val usernameTextView: TextView
    private val tweetTextView: TextView
    private val editedTextView: TextView
    private val replyImageView: ImageView
    private val retweetImageView: ImageView
    private val likeImageView: ImageView
    private val editImageView: ImageView

    init {
        LayoutInflater.from(context).inflate(R.layout.itemlayout_tweet, this, true)

        profilePhoto = findViewById(R.id.profile_photo)
        nameTextView = findViewById(R.id.tv_name)
        usernameTextView = findViewById(R.id.tv_username)
        tweetTextView = findViewById(R.id.tv_tweet_text)
        editedTextView = findViewById(R.id.tv_tweet_edited)
        replyImageView = findViewById(R.id.tweet_action_reply)
        retweetImageView = findViewById(R.id.tweet_action_retweet)
        likeImageView = findViewById(R.id.tweet_action_like)
        editImageView = findViewById(R.id.tweet_action_edit)
    }

    fun setProfilePhotoUrl(url: String) {
        profilePhoto.setImageURI(url)
    }

    fun setName(name: String) {
        nameTextView.text = name
    }

    fun setUsername(username: String) {
        usernameTextView.text = "@$username"
    }

    fun setTweetText(text: String) {
        tweetTextView.text = text
    }

    fun setEdited(isEdited: Boolean) {
        editedTextView.visibility = if (isEdited) VISIBLE else GONE
    }

    fun setOnReplyClickListener(listener: OnClickListener) {
        replyImageView.setOnClickListener(listener)
    }

    fun setOnRetweetClickListener(listener: OnClickListener) {
        retweetImageView.setOnClickListener(listener)
    }

    fun setOnLikeClickListener(listener: OnClickListener) {
        likeImageView.setOnClickListener(listener)
    }

    fun setOnEditClickListener(listener: OnClickListener) {
        editImageView.setOnClickListener(listener)
    }
}
