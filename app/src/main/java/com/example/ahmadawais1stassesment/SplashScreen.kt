package com.example.ahmadawais1stassesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({NewAc()},3000)
    }

    private fun NewAc() {
        var i= Intent(this, LogIn::class.java)
        startActivity(i)
        finish()
    }

}