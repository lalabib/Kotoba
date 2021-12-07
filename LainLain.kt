package com.example.kotoba

object LainLain {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Pendapat",
                        "いけん",
                        "Iken"
                    )
                )
                add(
                    N4(
                        "Sampah",
                        "ごみ",
                        "Gomi"
                    )
                )
                add(
                    N4(
                        "Penuh",
                        "まんせき",
                        "Manseki"
                    )
                )
                add(
                    N4(
                        "Bohong",
                        "うそ",
                        "Uso"
                    )
                )
                add(
                    N4(
                        "Barang yang ketinggalan/kelupaan",
                        "わすれもの",
                        "Wasuremono"
                    )
                )
            }
            return it
        }
    }
}