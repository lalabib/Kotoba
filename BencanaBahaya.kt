package com.example.kotoba

object BencanaBahaya {
    fun getKotoba(): ArrayList<N4> {
        ArrayList<N4>().also {
            it.apply {
                add(
                    N4(
                        "Kecelakaan",
                        "じこ",
                        "Jiko"
                    )
                )
                add(
                    N4(
                        "Gempa",
                        "じしん",
                        "Jishin"
                    )
                )
                add(
                    N4(
                        "Kebakaran",
                        "かじ",
                        "Kaji"
                    )
                )
                add(
                    N4(
                        "Bahaya",
                        "きけん",
                        "Kiken"
                    )
                )
                add(
                    N4(
                        "Peperangan",
                        "せんそう",
                        "Sensou"
                    )
                )
                add(
                    N4(
                        "Angin Topan",
                        "たいふう",
                        "Taifuu"
                    )
                )
            }
            return it
        }
    }
}