package com.example.kotoba

object KataSambung {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Karena itu, Sehingga, Maka",
                        "だから",
                        "Dakara"
                    )
                )
                add(
                    N4(
                        "Tetapi, Meskipun",
                        "けれど, けれども",
                        "Keredo, Keredomo"
                    )
                )
                add(
                    N4(
                        "Atau",
                        "または",
                        "Matawa"
                    )
                )
                add(
                    N4(
                        "Lalu",
                        "それで",
                        "Sorede"
                    )
                )
                add(
                    N4(
                        "Lagipula, Selain itu",
                        "それに",
                        "Soreni"
                    )
                )
                add(
                    N4(
                        "Setelah itu, Lantas",
                        "すると",
                        "Soruto"
                    )
                )
            }
            return it
        }
    }
}