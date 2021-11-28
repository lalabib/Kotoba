package com.example.kotoba

object KomunitasMasyarakat {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Dibicarakan, Dimusyawarahkan",
                        "はなし'あい",
                        "Hanashi'ai"
                    )
                )
                add(
                    N4(
                        "Jumlah penduduk, Populasi",
                        "じんこう",
                        "Jinkou"
                    )
                )
                add(
                    N4(
                        "Masyarakat",
                        "しゃかい",
                        "Shakai"
                    )
                )
                add(
                    N4(
                        "Penduduk Kota",
                        "しみん",
                        "Shimin"
                    )
                )
            }
            return it
        }
    }
}