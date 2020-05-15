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
import kotlinx.android.synthetic.main.activity_daily.*

class Daily : AppCompatActivity() {
    private lateinit var betn: Button
    private lateinit var dailyy: DailyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily)
            val data = dbdaily.setData()
        dailyy = DailyAdapter()
        dailyy.setDailyAdapter(data)
        recycledai.apply{
            layoutManager = LinearLayoutManager(this@Daily)
            this.adapter = dailyy
        }

        backmenu2.setOnClickListener(){
            var intent = Intent(Intent(this,MainActivity::class.java))
            startActivity(intent)
        }
    }
}
