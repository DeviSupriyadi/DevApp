package com.devisupriyadi.devapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devisupriyadi.devapp.profile.Profile
import kotlinx.android.synthetic.main.activity_contact.*

class Contact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        backprof.setOnClickListener(){
            var intent = Intent(Intent(this,Profile::class.java))
            startActivity(intent)
        }
        fb1.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/devi.supriyadi.9"))
            startActivity(i)
        }
        twitter2.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/DeviSupriyadi"))
            startActivity(i)
        }
        ig2.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/devisupriyadi/"))
            startActivity(i)
        }
        spoti2.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/user/21ympproocq2xqhcz6niqwd3y?si=BUJeOAjrRqyg53xkBrDtvg"))
            startActivity(i)
        }
        btn_mail.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/1/#inbox?compose=CllgCJfrsgQldbszVnvxSrSZnjKcbwwpTDrjRJflcmTFSnvPqlnZhwWzXxvZlqnLLlnKSLbjtnV"))
            startActivity(i)
        }

    }
}
