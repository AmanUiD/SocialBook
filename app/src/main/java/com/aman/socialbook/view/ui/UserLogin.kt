package com.aman.socialbook.view.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aman.socialbook.R
import kotlinx.android.synthetic.main.user_login.*

class UserLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_login)

        signUP.setOnClickListener {
            val intent = Intent(this, UserSignUp::class.java)
            startActivity(intent)
        }
    }
}