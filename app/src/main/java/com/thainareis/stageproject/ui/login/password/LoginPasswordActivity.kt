package com.thainareis.stageproject.ui.login.password

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_password.*

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import com.thainareis.stageproject.R
import com.thainareis.stageproject.ui.home.HomeActivity


class LoginPasswordActivity : AppCompatActivity() {

    private var passWordVisibly = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_password)

        val cpf = intent.getStringExtra(ARG_CPF)
        findViewById<TextView>(R.id.CpfTextView).apply {
            text = cpf.toString()
        }

        seePasswordImage.setOnClickListener {
            if(passWordVisibly){
                passwordEditText.transformationMethod = HideReturnsTransformationMethod.getInstance()
                passWordVisibly = false
            } else{
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                passWordVisibly = true
            }
        }
        goToHomePageImage.setOnClickListener{
            HomeActivity.newIntent(this)
        }

    }

    companion object{

        private const val ARG_CPF = "arg_cpf"

        fun newIntent(context: Context, cpf: String) = Intent(context, LoginPasswordActivity::class.java).apply {
            putExtra(ARG_CPF, cpf)
        }
    }
}


