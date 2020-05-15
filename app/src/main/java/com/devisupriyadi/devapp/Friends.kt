package com.devisupriyadi.devapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_friends.*

class Friends : AppCompatActivity() {
    private lateinit var betn: Button
    private lateinit var frenss: FrenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)
        val data = dbpren.setDatapren()
        frenss = FrenAdapter()
        frenss.setFriendAdapter(data)
        recyclepren.apply{
            layoutManager = LinearLayoutManager(this@Friends,LinearLayoutManager.HORIZONTAL,false)
            this.adapter = frenss
        }
        betn = findViewById(R.id.backmenu4)
        betn.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
