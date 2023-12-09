package com.example.androidadvanced.Member.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.androidadvanced.Member.adapter.MemberViewPagerAdapter
import com.example.androidadvanced.R
import com.example.androidadvanced.databinding.FragmentMemberBinding
import com.example.androidadvanced.databinding.FragmentMobileBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MemberFragment : Fragment() {

    private lateinit var _binding: FragmentMemberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMemberBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewPager()
    }

    private fun setViewPager() {
        val memberViewPagerAdapter = MemberViewPagerAdapter(childFragmentManager, lifecycle)
        val viewPager: ViewPager2 = _binding.vpMember
        viewPager.adapter = memberViewPagerAdapter
        viewPager.isUserInputEnabled = false
        val tabs: TabLayout = _binding.tbMember

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLE[position])
        }.attach()
    }

    companion object {
        private val TAB_TITLE = intArrayOf(
            R.string.Mobile,
            R.string.Web,
            R.string.HCAI,
        )
    }
}