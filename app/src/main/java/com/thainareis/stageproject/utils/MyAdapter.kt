package com.thainareis.stageproject.utils

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.thainareis.stageproject.R
import com.thainareis.stageproject.ui.home.HomeCells



class MyAdapter(var itemList:List<HomeCells>, var activity: Activity) : BaseAdapter() {


    override fun getItem(position: Int): Any {
        return itemList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View?{

        val view = convertView

        val tv_num = view?.findViewById<TextView>(R.id.tv_number) as TextView
        val tv_lang = view?.findViewById<TextView>(R.id.tv_lang) as TextView
        val img_lang= view?.findViewById<ImageView>(R.id.im_lang)


        tv_num.text = (position+1).toString()+"."
        tv_lang.text = itemList.get(position).name
        val lang_pic =itemList.get(position).img_icon
//        img_lang.drawable =itemList.get(position).img_icon
        img_lang.setImageResource(lang_pic)



        return view
    }
}