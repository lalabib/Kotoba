package com.example.kotoba

object Binatang {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Burung kecil",
                        "ことり",
                        "Kotori"
                    )
                )
                add(
                    N4(
                        "Serangga, Kutu, Cacing",
                        "むし",
                        "Mushi"
                    )
                )
            }
            return it
        }
    }
}