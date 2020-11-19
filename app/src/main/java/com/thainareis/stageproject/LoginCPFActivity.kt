package com.thainareis.stageproject

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.thainareis.stageproject.utils.CPFUtil
import com.thainareis.stageproject.utils.Mask
import kotlinx.android.synthetic.main.activity_login_cpf.*


class LoginCPFActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cpf)


        CpfEditText.addTextChangedListener(Mask.mask("###.###.###-##" , CpfEditText))

        val cpf = findViewById<EditText>(R.id.CpfEditText)

        goToPasswordPageImage.setOnClickListener{

            if(CPFUtil.ValidateCPF(cpf.text.toString())) {

                startActivity(LoginPasswordActivity.newIntent(this, cpf.text.toString()))
                println("cpf" + cpf.text.toString())

            }
            else {
                println("cpf invalido")
            }
        }
    }

    companion object{

        fun newIntent(context: Context) = Intent(context, LoginCPFActivity::class.java)
    }
}