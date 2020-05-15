package com.devisupriyadi.devapp.profile
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devisupriyadi.devapp.Contact
import com.devisupriyadi.devapp.MainActivity
import com.devisupriyadi.devapp.Maps
import com.devisupriyadi.devapp.R
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        backmenu.setOnClickListener(){
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn_map.setOnClickListener(){
            val intent=Intent(this,Maps::class.java)
            startActivity(intent)
        }
    }
}
