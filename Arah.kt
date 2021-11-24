package com.example.kotoba

object Arah {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Arah Pulang, Kepulangan",
                        "かえり",
                        "kaeri"
                    )
                )
                add(
                    N4(
                        "Sebrang Sana",
                        "むこう",
                        "Mukou"
                    )
                )
                add(
                    N4(
                        "Yang Jauh",
                        "とおく",
                        "Tooku"
                    )
                )
            }
            return it
        }
    }
}
