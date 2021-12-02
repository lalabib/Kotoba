package com.example.kotoba

object AlasanUrusan {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Penyebab",
                        "げん'いん",
                        "Gen'in"
                    )
                )
                add(
                    N4(
                        "Alasan",
                        "りゆう",
                        "Riyuu"
                    )
                )
                add(
                    N4(
                        "Alasan, Pengertian",
                        "わけ",
                        "Wake"
                    )
                )
                add(
                    N4(
                        "Urusan, Keperluan",
                        "よう",
                        "You"
                    )
                )
                add(
                    N4(
                        "Urusan, Keperluan",
                        "ようじ",
                        "Youji"
                    )
                )
            }
            return it
        }
    }
}