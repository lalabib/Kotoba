package com.example.kotoba

object Keluarga {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Suami anda, Tuan",
                        "ごしゅじん",
                        "Goshujin"
                    )
                )
                add(
                    N4(
                        "Istri(saya)",
                        "かない",
                        "Kanai"
                    )
                )
                add(
                    N4(
                        "Anak, Anak kecil",
                        "こ",
                        "Ko"
                    )
                )
                add(
                    N4(
                        "Putra, Anak laki - laki",
                        "むすこ",
                        "Musuko"
                    )
                )
                add(
                    N4(
                        "Putri, Anak Perempuan",
                        "むすめ",
                        "Musume"
                    )
                )
                add(
                    N4(
                        "Suami(saya)",
                        "おっと",
                        "Otto"
                    )
                )
                add(
                    N4(
                        "Orang-tua, Ayah-ibu",
                        "おや",
                        "Oya"
                    )
                )
                add(
                    N4(
                        "Nenek (saya)",
                        "そぼ",
                        "Sobo"
                    )
                )
                add(
                    N4(
                        "Kakek (saya)",
                        "そふ",
                        "Sofu"
                    )
                )
                add(
                    N4(
                        "Istri (pada umumnya",
                        "つま",
                        "Tsuma"
                    )
                )
            }
            return it
        }
    }
}