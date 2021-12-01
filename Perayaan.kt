package com.example.kotoba

object Perayaan {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Alkohol",
                        "アルコール",
                        "Arukooru"
                    )
                )
                add(
                    N4(
                        "Menikmati musim bunga",
                        "はなみ",
                        "Hanami"
                    )
                )
                add(
                    N4(
                        "Kuil Shinto",
                        "じんじゃ",
                        "Jinja"
                    )
                )
                add(
                    N4(
                        "Perayaan, Ucapan selamat",
                        "おいわい",
                        "Oiwai"
                    )
                )
                add(
                    N4(
                        "Pemberian, Hadiah",
                        "おくりもの",
                        "Okurimono"
                    )
                )
                add(
                    N4(
                        "Festival",
                        "おまつり",
                        "Omatsuri"
                    )
                )
                add(
                    N4(
                        "Hadiah",
                        "プレゼント",
                        "Purezento"
                    )
                )
            }
            return it
        }
    }
}