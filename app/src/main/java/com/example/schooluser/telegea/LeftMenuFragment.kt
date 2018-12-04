package com.example.schooluser.telegea

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_left_menu.*

class LeftMenuFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_left_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        night_mode.setOnClickListener {
            sw1.isChecked = !sw1.isChecked
            darktheme()

        }

        sw1.setOnClickListener {
            darktheme()
        }
    }

    fun darktheme() {
        if (sw1.isChecked) {
            infopanel.setBackgroundResource(R.color.colorBlack2Telegram)
            textpanel.setBackgroundResource(R.color.colorBlack1Telegram)
            txt1.setTextColor(Color.parseColor("#ffffff"))
            txt2.setTextColor(Color.parseColor("#ffffff"))
            txt3.setTextColor(Color.parseColor("#ffffff"))
            txt4.setTextColor(Color.parseColor("#ffffff"))
            txt5.setTextColor(Color.parseColor("#ffffff"))
            txt6.setTextColor(Color.parseColor("#ffffff"))
            txt7.setTextColor(Color.parseColor("#ffffff"))
            txt8.setTextColor(Color.parseColor("#ffffff"))
            txt9.setTextColor(Color.parseColor("#ffffff"))
            txt10.setTextColor(Color.parseColor("#ffffff"))

        } else {
            infopanel.setBackgroundResource(R.color.colorBlueTelegram)
            textpanel.setBackgroundResource(R.color.colorWhite)
            txt1.setTextColor(Color.parseColor("#3d3d3d"))
            txt2.setTextColor(Color.parseColor("#3d3d3d"))
            txt3.setTextColor(Color.parseColor("#3d3d3d"))
            txt4.setTextColor(Color.parseColor("#3d3d3d"))
            txt5.setTextColor(Color.parseColor("#3d3d3d"))
            txt6.setTextColor(Color.parseColor("#3d3d3d"))
            txt7.setTextColor(Color.parseColor("#3d3d3d"))
            txt8.setTextColor(Color.parseColor("#3d3d3d"))
            txt9.setTextColor(Color.parseColor("#3d3d3d"))
            txt10.setTextColor(Color.parseColor("#3d3d3d"))
        }
    }
}