package com.example.mytwitter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MyAdapter
    private lateinit var tweetList: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button view in your layout
        findViewById<Button>(R.id.button_create_tweet)
        findViewById<Button>(R.id.Profile_button)

        // Find the RecyclerView view in your layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        // Set up the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        tweetList = mutableListOf()
        adapter = MyAdapter(tweetList)
        recyclerView.adapter = adapter


        val Profile_button: Button = findViewById(R.id.Profile_button)
        Profile_button.setOnClickListener {
            val intent = Intent(this, myprofile::class.java)
            startActivity(intent)

            val button_create_tweet: Button = findViewById(R.id.button_create_tweet)
            button_create_tweet.setOnClickListener {
                val intent = Intent(this, CreateTweets::class.java)
                startActivity(intent)
            }
        }
    }

    class MyAdapter(private val data: List<String>) :
        RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.createatweet, parent, false)
            return MyViewHolder(view)
        }

        override fun getItemCount() = data.size

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val tweetText = data[position]
            holder.bind(tweetText)
        }

        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val createTweets: TextView = itemView.findViewById(R.id.button_create_tweet)

            fun bind(tweetText: String) {
                createTweets.text = tweetText
            }
        }
    }
}
