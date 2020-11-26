package com.thainareis.stageproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thainareis.stageproject.ui.login.cpf.LoginCPFActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            startActivity(LoginCPFActivity.newIntent(this))
        }
    }
}