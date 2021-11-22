package com.example.kotoba

object PerasaanPergaulan {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Keadaan, Kondisi",
                        "ぐあい",
                        "Guai"
                    )
                )
                add(
                    N4(
                        "Hubungan",
                        "かんけい",
                        "Kankei"
                    )
                )
                add(
                    N4(
                        "Udara, Semangat, Suasana",
                        "き",
                        "Ki"
                    )
                )
                add(
                    N4(
                        "Perasaan, Suasana, Keadaan Kesehatan",
                        "きぶん",
                        "Kibun"
                    )
                )
                add(
                    N4(
                        "Perasaan, Suasana",
                        "きもち",
                        "Kimochi"
                    )
                )
                add(
                    N4(
                        "Berkat, Karena",
                        "おかげ",
                        "Okage"
                    )
                )
                add(
                    N4(
                        "Kunjungan, Jengukan",
                        "おみまい",
                        "Omimai"
                    )
                )
                add(
                    N4(
                        "Oleh-oleh, Souvenir",
                        "おみやげ",
                        "omiyage"
                    )
                )
                add(
                    N4(
                        "Hormat, Terima Kasih",
                        "おれい",
                        "orei"
                    )
                )
                add(
                    N4(
                        "Keadaan, Urusan",
                        "つごう",
                        "tsugou"
                    )
                )
            }
            return it
        }
    }
}