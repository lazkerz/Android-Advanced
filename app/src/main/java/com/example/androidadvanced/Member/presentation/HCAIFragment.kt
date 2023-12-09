package com.example.androidadvanced.Member.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidadvanced.Member.adapter.MemberAdapter
import com.example.androidadvanced.Member.presentation.view_model.MemberViewModel
import com.example.androidadvanced.R
import com.example.androidadvanced.databinding.FragmentHCAIBinding
import com.example.androidadvanced.databinding.FragmentWebBinding

class HCAIFragment : Fragment() {

    private lateinit var binding: FragmentHCAIBinding
    private lateinit var viewModel: MemberViewModel
    private val adapter = MemberAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHCAIBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(MemberViewModel::class.java)

        // Observe the mobile members list
        viewModel.memberHCAIList.observe(viewLifecycleOwner, { HCAIMemberList ->
            adapter.memberList = HCAIMemberList
        })

        // Set up RecyclerView with the adapter
        binding.rvHCAI.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHCAI.adapter = adapter

        viewModel.initializeMemberList()
    }

    companion object {
    }
}