package com.example.kotoba

object Penyakit {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Luka",
                        "けが",
                        "Kega"
                    )
                )
                add(
                    N4(
                        "Panas, Demam",
                        "ねつ",
                        "Netsu"
                    )
                )
            }
            return it
        }
    }
}