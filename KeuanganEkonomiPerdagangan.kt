package com.example.kotoba

object KeuanganEkonomiPerdagangan {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Ekonomi",
                        "けいざい",
                        "Keizai"
                    )
                )
                add(
                    N4(
                        "Harga",
                        "ねだん",
                        "Nedan"
                    )
                )
                add(
                    N4(
                        "Orang kaya",
                        "おかねもち",
                        "Okanemochi"
                    )
                )
                add(
                    N4(
                        "Uang kembalian",
                        "おつり",
                        "Otsuri"
                    )
                )
                add(
                    N4(
                        "Kasir",
                        "レジ",
                        "Reji"
                    )
                )
                add(
                    N4(
                        "Barang dagangan",
                        "しなもの",
                        "Shinamono"
                    )
                )
            }
            return it
        }
    }
}