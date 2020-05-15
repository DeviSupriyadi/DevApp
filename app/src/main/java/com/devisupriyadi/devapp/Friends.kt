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
        backmenu4.setOnClickListener(){
            var intent = Intent(Intent(this,MainActivity::class.java))
            startActivity(intent)
        }
    }
}
