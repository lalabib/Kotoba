package com.example.kotoba

object TransportasiLaluLintas {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Kapal laut",
                        "ふね",
                        "Fune"
                    )
                )
                add(
                    N4(
                        "Bensin",
                        "ガソリン",
                        "Gasorin"
                    )
                )
                add(
                    N4(
                        "Gas",
                        "ガス",
                        "Gasu"
                    )
                )
                add(
                    N4(
                        "Kereta uap, Kereta api",
                        "きしゃ",
                        "Kisha"
                    )
                )
                add(
                    N4(
                        "Transportasi, Lalu-lintas",
                        "こうつう",
                        "Koutsuu"
                    )
                )
                add(
                    N4(
                        "Ekpres, Kilat, Cepat",
                        "きゅうこう",
                        "Kyuukou"
                    )
                )
                add(
                    N4(
                        "Kendaraan",
                        "のりもの",
                        "Norimono"
                    )
                )
                add(
                    N4(
                        "Sepeda motor",
                        "オートバイ",
                        "Ootobai"
                    )
                )
                add(
                    N4(
                        "Super ekpres, Super cepat",
                        "とっきゅう",
                        "Tokkyuu"
                    )
                )
            }
            return it
        }
    }
}