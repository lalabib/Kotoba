package com.example.kotoba

object PolitikHukum {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Hukum",
                        "ほうりつ",
                        "Houritsu"
                    )
                )
                add(
                    N4(
                        "Politik",
                        "せいじ",
                        "Seiji"
                    )
                )
            }
            return it
        }
    }
}