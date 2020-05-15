package com.devisupriyadi.devapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_maps.*

class Maps : AppCompatActivity() {
    private lateinit var bets: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        backprofi.setOnClickListener(){
            var intent = Intent(Intent(this,MainActivity::class.java))
            startActivity(intent)
        }

        val lok = findViewById(R.id.btn_homii) as TextView
        lok.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW)
            link.data= Uri.parse("https://goo.gl/maps/DPmwT5w8vGc62rdA9")
            startActivity(link)
        }
    }
}
