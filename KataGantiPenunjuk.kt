package com.example.kotoba

object KataGantiPenunjuk {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Seperti ini, Begini",
                        "こんな",
                        "Konna"
                    )
                )
                add(
                    N4(
                        "Seperti itu, Begitu",
                        "そんな",
                        "Sonna"
                    )
                )
                add(
                    N4(
                        "Seperti itu, Demikian",
                        "あんな",
                        "Anna"
                    )
                )
                add(
                    N4(
                        "Yang bagaimana",
                        "どんな",
                        "Donna"
                    )
                )
                add(
                    N4(
                        "Begini",
                        "こう",
                        "Kou"
                    )
                )
                add(
                    N4(
                        "Begitu",
                        "そう",
                        "Sou"
                    )
                )
                add(
                    N4(
                        "Begitu",
                        "ああ",
                        "Aa"
                    )
                )
                add(
                    N4(
                        "Bagaimana",
                        "どう",
                        "Dou"
                    )
                )
            }
            return it
        }
    }
}