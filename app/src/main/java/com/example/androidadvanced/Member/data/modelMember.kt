package com.example.androidadvanced.Member.data

import com.example.androidadvanced.R
import java.time.LocalDateTime

data class modelMember(
    val id: String,
    val nama: String,
    val role: String,
    val program: Program
)

enum class Program {
    Mobile,
    Web,
    HCAI,
}

object MemberDataProvider {
    fun dataMember(): List<modelMember> {
        return listOf(
            modelMember(
                "1",
                "Nurul Fatma Putri Lazira",
                "Scrum Master | Hacker",
                Program.Mobile
            ),
            modelMember(
                "2",
                "Rayhan Illyas Annabil",
                "Hacker",
                Program.Mobile
            ),
            modelMember(
                "3",
                "Fatimatuzzahra",
                "Hacker",
                Program.Mobile
            ),
            modelMember(
                "4",
                "Rifqi Nugraha",
                "Hipster",
                Program.Mobile
            ),
            modelMember(
                "5",
                "Fikry Azraq Arista",
                "Hipster",
                Program.Mobile
            ),
            modelMember(
                "6",
                "Adzhimatinur Azzahra",
                "Project Manager",
                Program.Web
            ),
            modelMember(
                "7",
                "Cahya Kelvin",
                "Scrum Master | Hipster",
                Program.Web
            ),
            modelMember(
                "8",
                "Ikram Jundullah",
                "Hacker",
                Program.Web
            ),
            modelMember(
                "9",
                "Raynaldi Nugroho",
                "Hacker",
                Program.Web
            ),
            modelMember(
                "10",
                "Febri Septio",
                "Hacker",
                Program.Web
            ),
            modelMember(
                "11",
                "Astrid Denisa",
                "Hipster",
                Program.Web
            ),
            modelMember(
                "12",
                "Prayoga",
                "Hacker",
                Program.HCAI
            ),
            modelMember(
                "13",
                "Aminah",
                "Hacker",
                Program.HCAI
            ),

        )
    }
}
