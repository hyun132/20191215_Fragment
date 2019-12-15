package com.example.a20191215_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a20191215_fragment.R

class ThirdFragment :BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third,container,false)
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        }
}