package com.devisupriyadi.devapp.walkthrough

/* Tanggal Pengerjaan : 7 Mei 2020
    Deksripsi         : Bikin Walkthrough
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devisupriyadi.devapp.R
import kotlinx.android.synthetic.main.activity_walkt.*

class Walkt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkt)

        viewpager.adapter = MyPagerAdapter(
            supportFragmentManager
        )
    }
}
