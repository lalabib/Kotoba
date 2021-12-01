package com.example.kotoba

object KebudayaanSejarahAgama {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Kebudayaan",
                        "ぶんか",
                        "Bunka"
                    )
                )
                add(
                    N4(
                        "Berdoa",
                        "いのる",
                        "Inoru"
                    )
                )
                add(
                    N4(
                        "Gereja",
                        "きょうかい",
                        "Kyoukai"
                    )
                )
                add(
                    N4(
                        "Sejarah",
                        "れきし",
                        "Rekishi"
                    )
                )
                add(
                    N4(
                        "Negara barat",
                        "せいよう",
                        "Seiyou"
                    )
                )
                add(
                    N4(
                        "Cara, Upaya",
                        "しかた",
                        "Shikata"
                    )
                )
                add(
                    N4(
                        "Kebiasaan, Adat-Istiadat",
                        "しゅうかん",
                        "Shuukan"
                    )
                )
                add(
                    N4(
                        "Vihara, Kuil",
                        "てら",
                        "Tera"
                    )
                )
            }
            return it
        }
    }
}