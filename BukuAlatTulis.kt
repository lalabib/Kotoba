package com.example.kotoba

object BukuAlatTulis {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Kamus",
                        "じてん",
                        "Jiten"
                    )
                )
                add(
                    N4(
                        "Penghapus",
                        "けしごむ",
                        "Keshigomu"
                    )
                )
                add(
                    N4(
                        "Buku harian",
                        "にっき",
                        "Nikki"
                    )
                )
                add(
                    N4(
                        "Buku petunjuk",
                        "せつめいしょ",
                        "Setsumeisho"
                    )
                )
                add(
                    N4(
                        "Buku pelajaran",
                        "テキスト",
                        "Tekisuto"
                    )
                )
            }
            return it
        }
    }
}