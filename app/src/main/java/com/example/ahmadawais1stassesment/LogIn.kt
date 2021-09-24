package com.example.ahmadawais1stassesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        forget.setOnClickListener {
            var i= Intent(this,ForgetPassword::class.java)
            startActivity(i)
        }

        sign.setOnClickListener {
            var i = Intent(this,SignUp::class.java)
            startActivity(i)
        }

        loginbutton.setOnClickListener {
            val uname= username.text.toString()
            val upass= pass.text.toString()
            if(uname.isEmpty()){
                username.error="This feild can not be empty"
                return@setOnClickListener

            }
            else{
        }
            if(upass.isEmpty()){
                pass.error="This feild can not be empty"
                return@setOnClickListener

            }
            else{
                var i= Intent(this, MainActivity::class.java)
                i.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(i)
            }
        }
    }

}