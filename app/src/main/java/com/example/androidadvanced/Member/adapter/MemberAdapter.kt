package com.example.androidadvanced.Member.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidadvanced.Member.data.modelMember
import com.example.androidadvanced.databinding.ItemMemberBinding

class MemberAdapter : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {

    var memberList: List<modelMember> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(private val binding: ItemMemberBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(member: modelMember) {
            binding.nama.text = member.nama
            binding.role.text = member.role
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMemberBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = memberList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(memberList[position])
    }
}