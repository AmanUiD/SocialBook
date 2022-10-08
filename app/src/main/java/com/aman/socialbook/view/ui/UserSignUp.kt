package com.aman.socialbook.view.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aman.socialbook.R
import kotlinx.android.synthetic.main.user_login.*
import kotlinx.android.synthetic.main.user_sign_up.*

class UserSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_sign_up)
        logIN.setOnClickListener {
            val intent = Intent(this, UserLogin::class.java)
            startActivity(intent)
        }
    }
}