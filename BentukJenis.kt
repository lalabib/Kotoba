package com.example.kotoba

object BentukJenis {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Wujud, Bentuk",
                        "かっこう",
                        "Kakkou"
                    )
                )
                add(
                    N4(
                        "Bentuk",
                        "かたち",
                        "katachi"
                    )
                )
                add(
                    N4(
                        "Tipe, Jenis",
                        "タイプ",
                        "taipu"
                    )
                )
            }
            return it
        }
    }
}