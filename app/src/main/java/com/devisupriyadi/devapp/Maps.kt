package com.devisupriyadi.devapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Maps : AppCompatActivity() {
    private lateinit var betns: Button
    private lateinit var bets: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        betns = findViewById(R.id.backprofi)
        betns.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        bets = findViewById(R.id.backmenu3)
        bets.setOnClickListener{
            val orul = Intent(Intent.ACTION_VIEW)
            orul.data = Uri.parse("https://goo.gl/maps/DPmwT5w8vGc62rdA9")
            startActivity(orul)
        }
        val lok = findViewById(R.id.btn_homii) as TextView
        lok.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW)
            link.data= Uri.parse("https://goo.gl/maps/DPmwT5w8vGc62rdA9")
            startActivity(link)
        }
    }
}
