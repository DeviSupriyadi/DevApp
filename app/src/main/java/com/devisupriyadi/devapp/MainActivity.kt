package com.devisupriyadi.devapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.tulbars)
        setSupportActionBar(tulbars)

        drawerLayout = findViewById(R.id.drawer)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, tulbars,0,0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.homee -> {Toast.makeText(this,"Home clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.daily -> {Toast.makeText(this,"Daily clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.gallery -> {Toast.makeText(this,"Gallery clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.music -> {Toast.makeText(this,"Music clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.profile -> {Toast.makeText(this,"Profile clicked", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
