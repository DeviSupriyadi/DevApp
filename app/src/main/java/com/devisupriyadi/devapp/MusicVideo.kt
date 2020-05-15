package com.devisupriyadi.devapp
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
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
        backmenu5.setOnClickListener(){
            var intent = Intent(Intent(this,MainActivity::class.java))
            startActivity(intent)
        }
    }
}
