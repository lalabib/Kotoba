package com.example.kotoba

object KataGantiOrang {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Aku(Ucapan laki - laki)",
                        "ぼく",
                        "Boku"
                    )
                )
                add(
                    N4(
                        "Kamu(Ucapan kepada anak muda)",
                        "きみ",
                        "Kimi"
                    )
                )
                add(
                    N4(
                        "Saudara/i~ (Ucapan untuk teman dekat/junior)",
                        "~くん",
                        "~Kun"
                    )
                )
                add(
                    N4(
                        "Bapak-ibu sekalian, Semuanya",
                        "みな",
                        "Mina"
                    )
                )
            }
            return it
        }
    }
}