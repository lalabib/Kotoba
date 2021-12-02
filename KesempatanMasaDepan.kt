package com.example.kotoba

object KesempatanMasaDepan {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Kesempatan",
                        "きかい",
                        "Kikai"
                    )
                )
                add(
                    N4(
                        "Masa Depan",
                        "しょうらい",
                        "Shourai"
                    )
                )
                add(
                    N4(
                        "Bermaksud, Percaya bahwa",
                        "つもり",
                        "Tsumori"
                    )
                )
                add(
                    N4(
                        "Ramalan",
                        "よほう",
                        "Yohou"
                    )
                )
                add(
                    N4(
                        "Mimpi",
                        "ゆめ",
                        "Yume"
                    )
                )
            }
            return it
        }
    }
}