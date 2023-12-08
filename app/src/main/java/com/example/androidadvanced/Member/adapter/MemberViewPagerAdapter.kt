package com.example.androidadvanced.Member.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.lifecycle.Lifecycle
import com.example.androidadvanced.Member.presentation.HCAIFragment
import com.example.androidadvanced.Member.presentation.MobileFragment
import com.example.androidadvanced.Member.presentation.WebFragment


class MemberViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle:  Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> MobileFragment()
            1 -> WebFragment()
            2 -> HCAIFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
