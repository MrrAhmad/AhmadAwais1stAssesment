package com.example.ahmadawais1stassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = intent
        val getnamee = i.getStringExtra("name")
        val getmail = i.getStringExtra("email")
        val getb = i.getStringExtra("birth")
        getname.text= "User Name :"+ getnamee
        getemail.text="User Email :"+getmail
        getdob.text="User BithDate :" +getb
    }
}