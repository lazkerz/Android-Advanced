package com.example.androidadvanced.Member.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidadvanced.Member.adapter.MemberAdapter
import com.example.androidadvanced.Member.data.MemberDataProvider
import com.example.androidadvanced.Member.data.modelMember
import com.example.androidadvanced.Member.presentation.view_model.MemberViewModel
import com.example.androidadvanced.databinding.FragmentMobileBinding

class MobileFragment : Fragment() {

    private lateinit var binding: FragmentMobileBinding
    private lateinit var viewModel: MemberViewModel
    private val adapter = MemberAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMobileBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(MemberViewModel::class.java)

        // Observe the mobile members list
        viewModel.memberMobileList.observe(viewLifecycleOwner, { mobileMemberList ->
            adapter.memberList = mobileMemberList
        })

        // Set up RecyclerView with the adapter
        binding.rvMobile.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMobile.adapter = adapter

        viewModel.initializeMemberList()
    }

    companion object {

    }
}