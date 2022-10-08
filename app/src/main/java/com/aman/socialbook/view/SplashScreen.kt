package com.aman.socialbook.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.aman.socialbook.R
import com.aman.socialbook.view.ui.UserLogin

class SplashScreen : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_view)
        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this,UserLogin::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}