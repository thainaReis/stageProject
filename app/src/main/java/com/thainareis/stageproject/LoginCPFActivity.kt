package com.thainareis.stageproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_cpf.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginCPFActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cpf)


        button2.setOnClickListener{
            val intent = Intent(this, LoginPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}