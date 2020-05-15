package com.devisupriyadi.devapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_music_video.*

class MusicVideo : AppCompatActivity() {
    private lateinit var dbmsk: MusikAdapter
    private lateinit var betts : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_video)
        val data= dbmusik.setDataMus()
        dbmsk= MusikAdapter()
        dbmsk.setMusikAdapter(data)
        recyclesik.apply{
            layoutManager = LinearLayoutManager(this@MusicVideo)
            this.adapter = dbmsk
        }
        betts= findViewById(R.id.backmenu5)
        betts.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
