package com.example.kotoba

object KataPanggilan {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Nona",
                        "おじょうさん",
                        "Ojousan"
                    )
                )
                add(
                    N4(
                        "Panggilan untuk teman dekat atau Anak - anak",
                        "ちゃん",
                        "Chan"
                    )
                )
            }
            return it
        }
    }
}