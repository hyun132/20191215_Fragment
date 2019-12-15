package com.example.a20191215_fragment

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}