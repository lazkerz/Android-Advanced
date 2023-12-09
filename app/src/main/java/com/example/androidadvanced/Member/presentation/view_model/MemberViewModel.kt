package com.example.androidadvanced.Member.presentation.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidadvanced.Member.data.MemberDataProvider
import com.example.androidadvanced.Member.data.Program
import com.example.androidadvanced.Member.data.modelMember


class MemberViewModel : ViewModel() {
    private val _allMemberList = MutableLiveData<List<modelMember>>()
    val allMemberList: LiveData<List<modelMember>> get() = _allMemberList

    // Initialize the LiveData for each program
    private val _memberMobileList = MutableLiveData<List<modelMember>>()
    val memberMobileList: LiveData<List<modelMember>> get() = _memberMobileList

    private val _memberWebList = MutableLiveData<List<modelMember>>()
    val memberWebList: LiveData<List<modelMember>> get() = _memberWebList

    private val _memberHCAIList = MutableLiveData<List<modelMember>>()
    val memberHCAIList: LiveData<List<modelMember>> get() = _memberHCAIList

    // Function to set the original member list
    fun initializeMemberList() {
        val initialMemberList = MemberDataProvider.dataMember()
        _allMemberList.value = initialMemberList
        filterMembersByProgram(Program.Mobile)
        filterMembersByProgram(Program.Web)
        filterMembersByProgram(Program.HCAI)
    }

    // Function to filter members by program and update the corresponding LiveData
    private fun filterMembersByProgram(program: Program) {
        val memberList = _allMemberList.value ?: emptyList()
        val filteredList = memberList.filter { it.program == program }

        when (program) {
            Program.Mobile -> _memberMobileList.value = filteredList
            Program.Web -> _memberWebList.value = filteredList
            Program.HCAI -> _memberHCAIList.value = filteredList
        }
    }
}