package com.devisupriyadi.devapp

/* Tanggal Pengerjaan : 4-7 Mei 2020
    Deksripsi         : Bikin Menu
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.devisupriyadi.devapp.profile.Contact
import com.devisupriyadi.devapp.profile.Profile
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
            R.id.homee -> {startActivity(Intent(this,MainActivity::class.java))
            }
            R.id.daily -> {startActivity(Intent(this,Profile::class.java))
            }
            R.id.gallery -> {startActivity(Intent(this,Profile::class.java))
            }
            R.id.music -> {startActivity(Intent(this,Contact::class.java))
            }
            R.id.profile -> {startActivity(Intent(this,Profile::class.java))
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
