package com.capstone.project.kotoba

object DataKataN5 {

    //70-71
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

    //71
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

    //71-72
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

    //72-74
    fun kategoriKetWaktu(): ArrayList<N5> {
        val ketWaktu = ArrayList<N5>()

        ketWaktu.add(N5("waktu", "じかん", "jikan"))

        ketWaktu.add(N5("pagi, a.m", "ごぜん", "gozen"))

        ketWaktu.add(N5("sore, p.m", "ごご", "gogo"))

        ketWaktu.add(N5("lebih dulu", "さき", "saki"))

        ketWaktu.add(N5("sekarang", "いま", "ima"))

        ketWaktu.add(N5("pagi", "あさ", "asa"))

        ketWaktu.add(N5("siang", "ひる", "hiru"))

        ketWaktu.add(N5("sore hari, senja", "ゆうがた", "yuugata"))

        ketWaktu.add(N5("malam", "よる, ばん", "yoru, ban"))

        ketWaktu.add(N5("setiap hari", "まいにち", "mainichi"))

        ketWaktu.add(N5("setiap pagi", "まいあさ", "maiasa"))

        ketWaktu.add(N5("setiap malam", "まいばん", "maiban"))

        ketWaktu.add(N5("setiap minggu ", "まいしゅう", "maishuu"))

        ketWaktu.add(N5("setiap bulan", "まいつき/まいげつ", "maitsuki/maigetsu"))

        ketWaktu.add(N5("setiap tahun", "まいとし/まいねん", "maitoshi/mainen"))

        ketWaktu.add(N5("tadi pagi, pagi ini", "けさ", "kesa"))

        ketWaktu.add(N5("malam ini", "こんばん", "konban"))

        ketWaktu.add(N5("minggu ini", "こんしゅう", "konshuu"))

        ketWaktu.add(N5("bulan ini", "こん'げつ", "kon'getsu"))

        ketWaktu.add(N5("tahun ini", "ことし", "kotoshi"))

        ketWaktu.add(N5("kemarin dulu", "おととい", "ototoi"))

        ketWaktu.add(N5("tadi malam, kemarin malam", "ゆうべ,さくや", "yuube, sakuya"))

        ketWaktu.add(N5("kemarin", "きのう", "kinou"))

        ketWaktu.add(N5("hari ini", "きょう", "kyou"))

        ketWaktu.add(N5("besok", "あした", "ashita"))

        ketWaktu.add(N5("lusa", "あさって", "asatte"))

        ketWaktu.add(N5("2 minggu yang lalu", "せんせんしゅう", "sensenshuu"))

        ketWaktu.add(N5("minggu lalu", "せんしゅう", "senshuu"))

        ketWaktu.add(N5("minggu ini", "こんしゅう", "konshuu"))

        ketWaktu.add(N5("minggu depan", "らいしゅう", "raishuu"))

        ketWaktu.add(N5("2 minggu yang akan datang", "さらいしゅう", "saraishuu"))

        ketWaktu.add(N5("2 bulan lalu", "せんせん'げつ", "sensen'getsu"))

        ketWaktu.add(N5("bulan lalu", "せん'げつ", "sen'getsu"))

        ketWaktu.add(N5("bulan ini", "こん'げつ", "kon'getsu"))

        ketWaktu.add(N5("bulan depan", "らいげつ", "raigetsu"))

        ketWaktu.add(N5("2 bulan yang akan datang", "さらいげつ", "saraigetsu"))

        ketWaktu.add(N5("2 tahun yang lalu", "おととし", "ototoshi"))

        ketWaktu.add(N5("tahun lalu", "きょねん", "kyonen"))

        ketWaktu.add(N5("tahun ini", "ことし", "kotoshi"))

        ketWaktu.add(N5("tahun depan", "らいねん", "rainen"))

        ketWaktu.add(N5("2 tahun yang akan datang", "さらいねん", "sarainen"))

        return ketWaktu
    }

    //74
    fun kategoriWarna(): ArrayList<N5> {
        val warna = ArrayList<N5>()

        warna.add(N5("warna", "いろ", "iro"))

        warna.add(N5("biru", "あお,あおい", "ao, aoi"))

        warna.add(N5("merah", "あか,あかい", "aka, akai"))

        warna.add(N5("kuning", "きいろ,きいろい", "kiiro, kiiroi"))

        warna.add(N5("hitam", "くろ,くろい", "kuro, kuroi"))

        warna.add(N5("putih", "しろ,しろい", "shiro, shiroi"))

        warna.add(N5("coklat", "ちゃ'いろ,ちゃいろ", "cha'iro, chairo"))

        warna.add(N5("hijau", "みどり いろ,みどり", "midori iro, midori"))

        return warna
    }

    //74-75
    fun kategoriSatuan(): ArrayList<N5> {
        val satuan = ArrayList<N5>()

        satuan.add(N5("kilo, kilogram(kg)", "きろ,きろぐらむ", "kiro, kiroguramu"))

        satuan.add(N5("gram(gr)", "ぐらむ", "guramu"))

        satuan.add(N5("kilo, kilometer(km)", "きろ,きろめえとる", "kiro, kiromeetoru"))

        satuan.add(N5("meter(m)", "めえとる", "meetoru"))

        satuan.add(N5("lembar", "まい", "mai"))

        satuan.add(N5("halaman", "ぺえじ", "peeji"))

        satuan.add(N5("jilid", "さつ", "satsu"))

        satuan.add(N5("jam", "じかん", "jikan"))

        satuan.add(N5("menit", "ふん,ぷん", "fun, pun"))

        satuan.add(N5("detik", "びょう", "byou"))

        satuan.add(N5("nomor", "ばん", "ban"))

        satuan.add(N5("(nomor urut)ke ...", "ばんめ", "banme"))

        satuan.add(N5("orang", "にん", "nin"))

        satuan.add(N5("batang(pensil, botol, pohon)", "ほん,ぽん,ぼん", "hon, pon, bon"))

        satuan.add(N5("ekor", "ひき,ぴき,びき", "hiki, piki, biki"))

        return satuan
    }
}
