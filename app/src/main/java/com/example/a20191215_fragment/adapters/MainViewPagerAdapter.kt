package com.example.a20191215_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.a20191215_fragment.fragments.FirstFragment
import com.example.a20191215_fragment.fragments.SecondFragment
import com.example.a20191215_fragment.fragments.ThirdFragment

class MainViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> {"사용자 정보"}
            1->{"두번째 화면"}
            else->{"마지막"}
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {FirstFragment()}
            1->{SecondFragment()}
            else -> {ThirdFragment()}
        }
    }

    override fun getCount(): Int {
        return 3
    }

}