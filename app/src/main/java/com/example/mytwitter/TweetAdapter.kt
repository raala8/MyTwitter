package com.example.mytwitter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetAdapter(private val context: Context, private val tweets: List<Tweet>) : RecyclerView.Adapter<TweetAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userPhoto: View? = itemView.findViewById(R.id.drawee_user_photo)
        val userName: TextView = itemView.findViewById(R.id.tv_user_name)
        val userScreenName: TextView = itemView.findViewById(R.id.tv_user_screen_name)
        val tweetText: TextView = itemView.findViewById(R.id.tv_tweet_text)
        val tweetMedia: View? = itemView.findViewById(R.id.drawee_tweet_media)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemlayout_tweet, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tweet = tweets[position]

        // Bind the data to the views
        holder.userPhoto?.setImageURI(tweet.userPhotoUrl)
        holder.userName.text = tweet.userName
        holder.userScreenName.text = "@" + tweet.userScreenName
        holder.tweetText.text = tweet.text
        if (tweet.mediaUrl != null) {
            holder.tweetMedia!!.visibility = View.VISIBLE
            holder.tweetMedia.setImageURI(tweet.mediaUrl as String)
        } else {
            holder.tweetMedia!!.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return tweets.size
    }
}

