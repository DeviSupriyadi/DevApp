package com.devisupriyadi.devapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_gallery.*

class Galeri : AppCompatActivity() {
    private lateinit var betn: Button
    private lateinit var galeri : GalleryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)
            val data = Gallery.setDataGall()
        galeri = GalleryAdapter()
        galeri.setGalleryAdapter(data)
        recyclegal.apply{
            layoutManager = LinearLayoutManager(this@Galeri)
            this.adapter = galeri
        }
        betn = findViewById(R.id.backmenu3)
        betn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
