package com.example.kotoba

object Jumlah {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Berlipat",
                        "ばい",
                        "Bai"
                    )
                )
                add(
                    N4(
                        "Satu kali, Sekali",
                        "いちど",
                        "Ichido"
                    )
                )
                add(
                    N4(
                        "Banyak",
                        "じゅうぶん",
                        "Juubun"
                    )
                )
                add(
                    N4(
                        "Ratus juta",
                        "おく",
                        "Oku"
                    )
                )
            }
            return it
        }
    }
}