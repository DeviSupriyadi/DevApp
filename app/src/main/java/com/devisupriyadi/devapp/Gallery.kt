package com.devisupriyadi.devapp
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_gallery.*

class Gallery : AppCompatActivity() {
    private lateinit var betn: Button
    private lateinit var galeri : GalleryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        val data3 = dbgallery.setDataGall()
        galeri = GalleryAdapter()
        galeri.setGalleryAdapter(data3)
        recyclegal.apply{
            layoutManager = LinearLayoutManager(this@Gallery)
            this.adapter = galeri
        }
        backmenu3.setOnClickListener(){
            var intent = Intent(Intent(this,Gallery::class.java))
            startActivity(intent)
        }
    }
}
