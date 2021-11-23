package com.capstone.project.kotoba

object DataKataN5 {

    fun kategoriAngka(): ArrayList<N5> {
        val angka = ArrayList<N5>()

        angka.add(N5("nomor", "ばん'ごう", "ban'gou"))

        angka.add(N5("nol", "れい", "rei"))

        angka.add(N5("nol", "ぜろ", "zero"))

        angka.add(N5("setengah", "はん", "han"))

        angka.add(N5("satu", "いち", "ichi"))

        angka.add(N5("dua", "に", "ni"))

        angka.add(N5("tiga", "さん", "san"))

        angka.add(N5("empat", "し, よん", "shi, yon"))

        angka.add(N5("lima", "ご", "go"))

        angka.add(N5("enam", "ろく", "roku"))

        angka.add(N5("tujuh", "しち, なな", "shichi, nana"))

        angka.add(N5("delapan", "はち", "hachi"))

        angka.add(N5("sembilan", "きゅう, く", "kyuu, ku"))

        angka.add(N5("sepuluh", "じゅう", "juu"))

        angka.add(N5("ratus, seratus", "ひゃく", "hyaku"))

        angka.add(N5("seribu", "せん", "sen"))

        angka.add(N5("sepuluh ribu", "まん", "man"))

        angka.add(N5("1 tahun", "ひとつ", "hitotsu"))

        angka.add(N5("2 tahun", "ふたつ", "futatsu"))

        angka.add(N5("3 tahun", "みっつ", "mittsu"))

        angka.add(N5("4 tahun", "よっつ", "yottsu"))

        angka.add(N5("5 tahun", "いつつ", "itsutsu"))

        angka.add(N5("6 tahun", "むっつ", "muttsu"))

        angka.add(N5("7 tahun", "ななつ", "nanatsu"))

        angka.add(N5("8 tahun", "やっつ", "yattsu"))

        angka.add(N5("9 tahun", "ここのつ", "kokonotsu"))

        angka.add(N5("10 tahun", "とお", "too"))

        angka.add(N5("20 tahun", "はたち", "hatachi"))

        return angka
    }

    fun kategoriHari(): ArrayList<N5> {
        val hari = ArrayList<N5>()

        hari.add(N5("hari", "ようび", "youbi"))

        hari.add(N5("senin", "げつようび", "getsuyoubi"))

        hari.add(N5("selasa", "かようび", "kayoubi"))

        hari.add(N5("rabu", "すいようび", "suiyoubi"))

        hari.add(N5("kamis", "もくようび", "mokuyoubi"))

        hari.add(N5("jumat", "きんようび", "kin'youbi"))

        hari.add(N5("sabtu", "どようび", "doyoubi"))

        hari.add(N5("minggu", "にちようび", "nichiyoubi"))

        return hari
    }
    
        fun kategoriTglHari(): ArrayList<N5> {
        val tglHari = ArrayList<N5>()

        tglHari.add(N5("tanggal, hari", "にち", "nichi"))

        tglHari.add(N5("tanggal 1", "ついたち", "tsuitachi"))

        tglHari.add(N5("tanggal 2", "ふつか", "futsuka"))

        tglHari.add(N5("tanggal 3", "みっか", "mikka"))

        tglHari.add(N5("tanggal 4", "よっか", "yokka"))

        tglHari.add(N5("tanggal 5", "いつか", "itsuka"))

        tglHari.add(N5("tanggal 6", "むいか", "muika"))

        tglHari.add(N5("tanggal 7", "なのか", "nanoka"))

        tglHari.add(N5("tanggal 8", "ようか", "youka"))

        tglHari.add(N5("tanggal 9", "ここのか", "kokonoka"))

        tglHari.add(N5("tanggal 10", "とおか", "tooka"))

        tglHari.add(N5("tanggal 20", "はつか", "hatsuka"))

        tglHari.add(N5("1 hari", "いちにち", "ichinichi"))

        tglHari.add(N5("(selama)2 hari", "ふつか(かん)", "futsuka(kan)"))

        tglHari.add(N5("(selama)3 hari", "みっか(かん)", "mikka(kan)"))

        tglHari.add(N5("(selama)4 hari", "よっか(かん)", "yokka(kan)"))

        tglHari.add(N5("(selama)5 hari", "いつか(かん)", "itsuka(kan)"))

        tglHari.add(N5("(selama)6 hari", "むいか(かん)", "muika(kan)"))

        tglHari.add(N5("(selama)7 hari", "なのか(かん)", "nanoka(kan)"))

        tglHari.add(N5("(selama)8 hari", "ようか(かん)", "youka(kan)"))

        tglHari.add(N5("(selama)9 hari", "ここのか(かん)", "kokonoka(kan)"))

        tglHari.add(N5("(selama)10 hari", "とおか(かん)", "tooka(kan)"))

        tglHari.add(N5("1 minggu", "いっしゅうかん", "isshuukan"))

        tglHari.add(N5("(selama)1 bulan", "いっかげつ(かん)", "ikkagetsu(kan)"))

        tglHari.add(N5("(selama)1 tahun", "いちねん(かん)", "ichinen(kan)"))

        return tglHari
    }
}
