package com.example.a20191215_fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.a20191215_fragment.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment :BaseFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {
        okBtn.setOnClickListener {
            Toast.makeText(activity,"${nameEdt.text.toString()} / ${nicknameEdt.text.toString()}",Toast.LENGTH_SHORT).show()
        }
    }

    override fun setValues() {
    }


}