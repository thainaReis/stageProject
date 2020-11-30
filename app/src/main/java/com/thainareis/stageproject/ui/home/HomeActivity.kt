package com.thainareis.stageproject.ui.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thainareis.stageproject.R
import android.widget.GridView
import com.thainareis.stageproject.utils.MyAdapter

class HomeActivity : AppCompatActivity() {

    lateinit var list_lang: GridView
    var funcList: ArrayList<HomeCells> = ArrayList<HomeCells>()
    var adapter: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_lang = findViewById<GridView>(R.id.gridView) as GridView
        addLangData()
        adapter = MyAdapter(funcList, this)
        list_lang?.adapter = adapter
    }

    private fun addLangData() {
        val lang1 = HomeCells()
        lang1.name = "cartoes"
        lang1.img_icon=R.drawable.payment
        funcList.add(lang1)

        val lang2 = HomeCells()
        lang2.name = "pagar"
        lang2.img_icon=R.drawable.payment
        funcList.add(lang2)

        val lang3 = HomeCells()
        lang3.name = "transferir"
        lang3.img_icon=R.drawable.chat
        funcList.add(lang3)


    }

    companion object{

        fun newIntent(context: Context) = Intent(context, HomeActivity::class.java)
    }
}
