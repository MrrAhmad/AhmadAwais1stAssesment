package com.example.ahmadawais1stassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_forget_password.*

class ForgetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        Forgetbutton.setOnClickListener {
            var eemm = veremail.text.toString()
            if(eemm.isEmpty()){

                veremail.error="Required Feild"
                return@setOnClickListener
            }
            else {
                Toast.makeText(this,"Password has been sent to email",Toast.LENGTH_LONG).show()
            }
        }
    }
}