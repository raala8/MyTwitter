package com.example.mytwitter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView

class HomeActivity<SimpleDraweeView> : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private var draweeUserPhoto: SimpleDraweeView = TODO()
    private lateinit var customTitle: TextView
    private lateinit var recyclerViewTweets: RecyclerView
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var fabCompose: FloatingActionButton
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private var draweeUserPhotoNav: SimpleDraweeView = TODO()
    private lateinit var tvName: TextView
    private lateinit var tvUsername: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        toolbar = findViewById(R.id.toolbar)
        draweeUserPhoto = findViewById(R.id.drawee_user_photo)
        customTitle = findViewById(R.id.custom_title)
        recyclerViewTweets = findViewById(R.id.recyclerview_tweets)
        swipeRefreshLayout = findViewById(R.id.tweets_refresh_layout)
        bottomNavigationView = findViewById(R.id.bottom_navigation)
        fabCompose = findViewById(R.id.fab_compose)
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigation_view)
        draweeUserPhotoNav = navigationView.getHeaderView(0).findViewById(R.id.drawee_user_photo_nav)
        tvName = navigationView.getHeaderView(0).findViewById(R.id.tv_name)
        tvUsername = navigationView.getHeaderView(0).findViewById(R.id.tv_username)

        // Set up the toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        // Set up the user photo in the toolbar
        draweeUserPhoto.setImageURI("https://via.placeholder.com/30x30")

        // Set up the user photo and name in the navigation header
        draweeUserPhotoNav.setImageURI("https://via.placeholder.com/70x70")
        tvName.text = "User Name"
        tvUsername.text = "@username"

        // Set up the recycler view
        recyclerViewTweets.layoutManager = LinearLayoutManager(this)
        recyclerViewTweets.adapter = TweetAdapter()

        // Set up the swipe refresh layout
        swipeRefreshLayout.setOnRefreshListener {
            // Refresh the tweets
            swipeRefreshLayout.isRefreshing = false
        }

        // Set up the bottom navigation view
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    // Show the home screen
                    true
                }
                R.id.menu_search -> {
                    // Show the search screen
                    true
                }
                R.id.menu_notifications -> {
                    // Show the notifications screen
                    true
                }
                R.id.menu_messages -> {
                    // Show the messages screen
                    true
                }
                else -> false
            }
        }

        // Set up the FAB
        fabCompose.setOnClickListener {
            // Show the compose tweet screen
        }
    }

    private fun TweetAdapter(): TweetAdapter {


    }
}

fun View.setImageURI(s: String?) {


}
