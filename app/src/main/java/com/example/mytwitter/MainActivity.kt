package com.example.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var button_create_tweet: TextView
    private lateinit var adapter: MyAdapter
    private lateinit var tweetList: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button view in your layout
        val button = findViewById<Button>(R.id.button_create_tweet)

        // Find the RecyclerView view in your layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        // Set up the RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        tweetList = mutableListOf()
        adapter = MyAdapter(tweetList)
        recyclerView.adapter = adapter

        // Find the tweet text TextView
        button_create_tweet = findViewById(R.id.tweet_text_view)

        // Set a click listener on the button
        button.setOnClickListener {
            // Get the text from the tweet text TextView
            val tweetText = button_create_tweet.text.toString()

            // Add the tweet text to the tweet list and notify the adapter of the change
            tweetList.add(tweetText)
            adapter.notifyDataSetChanged()

            // Clear the tweet text TextView
            button_create_tweet.text = ""
        }
    }

    private class MyAdapter(private val data: List<String>) :
        RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
            return MyViewHolder(view)
        }

        override fun getItemCount() = data.size

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val tweetText = data[position]
            holder.bind(tweetText)
        }

        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            private val textView3: TextView = itemView.findViewById(R.id.textView3)

            fun bind(tweetText: String) {
                textView3.text = tweetText
            }
        }
    }

    private fun getData(): List<String> {
        // This is just an example list of data to populate the RecyclerView
        return listOf("Tweet 1", "Tweet 2", "Tweet 3")
    }
}
