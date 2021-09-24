package com.example.ahmadawais1stassesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        Signupbutton.setOnClickListener {
            var fname= name.text.toString()
            var emaail= useremail.text.toString()
            var pp= userpassword.text.toString()
            var repp= repass.text.toString()
            var birth= dob.text.toString()

            if(fname.isEmpty()){
                name.error="Required feild"
                return@setOnClickListener
            }
            else { }
            if(emaail.isEmpty()){
                useremail.error="Required feild"
                return@setOnClickListener
            }
            else { }
            if(pp.isEmpty()){
                userpassword.error="Required feild"
                return@setOnClickListener
            }
            else { }
            if(repp.isEmpty()){
                repass.error="Required feild"
                return@setOnClickListener
            }
            else { }
            if(birth.isEmpty()){
                dob.error="Required feild"
                return@setOnClickListener
            }
            else {
                val i = Intent ( this,MainActivity::class.java)
                i.putExtra("name",fname)
                i.putExtra("email",emaail)
                i.putExtra("birth",birth)
                i.flags= Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(i)


            }




        }
    }
}