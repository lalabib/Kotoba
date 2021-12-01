package com.example.kotoba

object BangunanBagiannya {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Bangunan",
                        "ビル",
                        "Biru"
                    )
                )
                add(
                    N4(
                        "Pemanas ruangan",
                        "だんぼう",
                        "Danbou"
                    )
                )
                add(
                    N4(
                        "Lampu",
                        "でんとう",
                        "Dentou"
                    )
                )
                add(
                    N4(
                        "Eskalator, Tangga jalan",
                        "エスカレーター",
                        "Esukareetaa"
                    )
                )
                add(
                    N4(
                        "Gelas, Kaca",
                        "ガラス",
                        "Garasu"
                    )
                )
                add(
                    N4(
                        "Dinding",
                        "かべ",
                        "Kabe"
                    )
                )
                add(
                    N4(
                        "Auditorium, Aula",
                        "こうどう",
                        "Koudou"
                    )
                )
                add(
                    N4(
                        "Bangunan 2 lantai",
                        "にかいだて",
                        "Nikaidate"
                    )
                )
                add(
                    N4(
                        "Diatas atap",
                        "おくじょう",
                        "Okujou"
                    )
                )
                add(
                    N4(
                        "Pendingin ruangan, AC",
                        "れいぼう",
                        "Reibou"
                    )
                )
            }
            return it
        }
    }
}