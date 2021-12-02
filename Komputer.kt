package com.example.kotoba

object Komputer {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Komputer",
                        "コンピューター",
                        "Konpyuutaa"
                    )
                )
                add(
                    N4(
                        "PC",
                        "パソコン",
                        "Pasokon"
                    )
                )
                add(
                    N4(
                        "Layar",
                        "スクリーン",
                        "Sukuriin"
                    )
                )
            }
            return it
        }
    }
}