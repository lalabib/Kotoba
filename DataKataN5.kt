package com.capstone.project.kotoba.data

import com.capstone.project.kotoba.N5

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

    //75
    fun kategoriKataGanti(): ArrayList<N5> {
        val kataGanti = ArrayList<N5>()

        kataGanti.add(N5("saya", "わたし, わたくし", "watashi, watakushi"))

        kataGanti.add(N5("kamu, anda", "あなた", "anata"))

        kataGanti.add(N5("dia(laki-laki)", "かれ", "kare"))

        kataGanti.add(N5("dia(perempuan)", "かのじょ", "kanojo"))

        kataGanti.add(N5("kami, kita", "わたし/わたくし たち", "watashi/watakushi tachi"))

        kataGanti.add(N5("kalian, anda sekalian", "あなた たち", "anata tachi"))

        kataGanti.add(N5("mereka(laki-laki)", "かれ たち, かれら", "kare tachi, karera"))

        kataGanti.add(N5("mereka(perempuan)", "かのじょ たち, かのじょら", "kanojo tachi, kanojora"))

        kataGanti.add(N5("diri sendiri", "じぶん", "jibun"))

        return kataGanti
    }

    //75-76
    fun kategoriManusiaTubuh(): ArrayList<N5> {
        val manusiaTubuh = ArrayList<N5>()

        manusiaTubuh.add(N5("orang", "ひと", "hito"))

        manusiaTubuh.add(N5("orang(bentuk hormat)", "かた", "kata"))

        manusiaTubuh.add(N5("(orang)dewasa", "おとな", "otona"))

        manusiaTubuh.add(N5("laki-laki, pria", "おとこ", "otoko"))

        manusiaTubuh.add(N5("perempuan, wanita", "おんな", "onna"))

        manusiaTubuh.add(N5("anak-anak", "こども, こ", "kodomo, ko"))

        manusiaTubuh.add(N5("kepala", "あたま", "atama"))

        manusiaTubuh.add(N5("mata", "め", "me"))

        manusiaTubuh.add(N5("hidung", "はな", "hana"))

        manusiaTubuh.add(N5("mulut", "くち", "kuchi"))

        manusiaTubuh.add(N5("gigi", "は", "ha"))

        manusiaTubuh.add(N5("telinga, kuping", "みみ", "mimi"))

        manusiaTubuh.add(N5("leher", "くび", "kubi"))

        manusiaTubuh.add(N5("tubuh, badan", "からだ", "karada"))

        manusiaTubuh.add(N5("tangan", "て", "te"))

        manusiaTubuh.add(N5("dada", "むね", "mune"))

        manusiaTubuh.add(N5("punggung", "せ, せい", "se, sei"))

        manusiaTubuh.add(N5("perut", "おなか", "onaka"))

        manusiaTubuh.add(N5("kaki", "あし", "ashi"))

        return manusiaTubuh
    }

    //76
    fun kategoriKeluarga(): ArrayList<N5> {
        val keluarga = ArrayList<N5>()

        keluarga.add(N5("keluarga", "かぞく", "kazoku"))

        keluarga.add(N5("rumah tangga", "かてい", "katei"))

        keluarga.add(N5("kakek", "おじいさん", "ojiisan"))

        keluarga.add(N5("nenek", "おばあさん", "obaasan"))

        keluarga.add(N5("bapak", "おとうさん, ちち", "otousan, chichi"))

        keluarga.add(N5("ibu", "おかあさん, はは", "okaasan, haha"))

        keluarga.add(N5("orang tua", "りょうしん", "ryoushin"))

        keluarga.add(N5("paman", "おじさん", "ojisan"))

        keluarga.add(N5("tante", "おばさん", "obasan"))

        keluarga.add(N5("saudara", "きょうだい", "kyoudai"))

        keluarga.add(N5("kakak laki-laki", "おにいさん, あに", "oniisan, ani"))

        keluarga.add(N5("kakak perempuan", "おねえさん, あね", "oneesan, ane"))

        keluarga.add(N5("adik laki-laki", "おとうとさん, おとうと", "otoutosan, otouto"))

        keluarga.add(N5("adik perempuan", "いもうとさん, いもうと", "imoutosan, imouto"))

        return keluarga
    }

    //77
    fun kategoriAlam(): ArrayList<N5> {
        val alam = ArrayList<N5>()

        alam.add(N5("cuaca, udara", "てんき", "tenki"))

        alam.add(N5("langit", "そら", "sora"))

        alam.add(N5("berawan, mendung", "くもり", "kumori"))

        alam.add(N5("udara cerah", "はれ", "hare"))

        alam.add(N5("angin", "かぜ", "kaze"))

        alam.add(N5("hujan", "あめ", "ame"))

        alam.add(N5("salju", "ゆき", "yuki"))

        alam.add(N5("air", "みず", "mizu"))

        alam.add(N5("laut", "うみ", "umi"))

        alam.add(N5("sungai", "かわ", "kawa"))

        alam.add(N5("kolam", "いけ", "ike"))

        alam.add(N5("gunung", "やま", "yama"))

        alam.add(N5("pohon, kayu", "き", "ki"))

        alam.add(N5("bunga", "はな", "hana"))

        return alam
    }

    //77
    fun kategoriMusim(): ArrayList<N5> {
        val musim = ArrayList<N5>()

        musim.add(N5("musim semi", "はる", "haru"))

        musim.add(N5("musim panas", "なつ", "natsu"))

        musim.add(N5("musim gugur", "あき", "aki"))

        musim.add(N5("musim dingin", "ふゆ", "fuyu"))

        return musim
    }

    //77-78
    fun kategoriBinatang(): ArrayList<N5> {
        val binatang = ArrayList<N5>()

        binatang.add(N5("binatang", "どうぶつ", "doubutsu"))

        binatang.add(N5("binatang peliharaan", "ぺっと", "petto"))

        binatang.add(N5("anjing", "いぬ", "inu"))

        binatang.add(N5("kucing", "ねこ", "neko"))

        binatang.add(N5("burung", "とり", "tori"))

        binatang.add(N5("ayam", "にわとり", "niwatori"))

        binatang.add(N5("ikan", "さかな", "sakana"))

        binatang.add(N5("udang", "えび", "ebi"))

        return binatang
    }

    //78-79
    fun kategoriBenda(): ArrayList<N5> {
        val benda = ArrayList<N5>()

        benda.add(N5("barang", "もの", "mono"))

        benda.add(N5("topi", "ぼうし", "boushi"))

        benda.add(N5("payung", "かさ", "kasa"))

        benda.add(N5("kacamata", "めがね", "megane"))

        benda.add(N5("sapu-tangan", "はんかち", "hankachi"))

        benda.add(N5("handuk", "たおる", "taoru"))

        benda.add(N5("sabun", "せっけん", "sekken"))

        benda.add(N5("shampo", "しゃんぷう", "shanpuu"))

        benda.add(N5("dompet", "さいふ", "saifu"))

        benda.add(N5("uang", "おかね", "okane"))

        benda.add(N5("sandal", "すりっぱ", "surippa"))

        benda.add(N5("kaos kaki", "くつした", "kutsushita"))

        benda.add(N5("sepatu", "くつぃ", "kutsi"))

        benda.add(N5("barang bawaan", "にもつ", "nimotsu"))

        benda.add(N5("tas", "かばん", "kaban"))

        benda.add(N5("rokok","たばこ", "tabako"))

        benda.add(N5("korek api", "まっち", "macchi"))

        benda.add(N5("obat", "くすり", "kusuri"))

        benda.add(N5("kunci", "かぎ", "kagi"))

        benda.add(N5("koran", "しんぶん", "shinbun"))

        benda.add(N5("majalah", "ざっし", "zasshi"))

        return benda
    }

    //79
    fun kategoriPakaian(): ArrayList<N5> {
        val pakaian = ArrayList<N5>()

        pakaian.add(N5("pakaian", "ようふく, ふく", "youfuku, fuku"))

        pakaian.add(N5("mantel", "こおと", "kooto"))

        pakaian.add(N5("baju hangat, sweter", "せえたあ", "seetaa"))

        pakaian.add(N5("jas", "せびろ", "sebiro"))

        pakaian.add(N5("jaket", "じゃけっと", "jaketto"))

        pakaian.add(N5("kemeja", "わいしゃつ, しゃつ", "waishatsu, shatsu"))

        pakaian.add(N5("dasi", "ねくたい", "nekutai"))

        pakaian.add(N5("rok", "すかあと", "sukaato"))

        pakaian.add(N5("celana panjang", "ずぼん", "zubon"))

        pakaian.add(N5("saku", "ぽけっと", "poketto"))

        pakaian.add(N5("kancing baju", "ぼたん", "botan"))

        return pakaian
    }

    //79-80
    fun kategoriMakananMinuman(): ArrayList<N5> {
        val makanMinum = ArrayList<N5>()

        makanMinum.add(N5("makanan", "たべもの", "tabemono"))

        makanMinum.add(N5("minuman", "のみもの", "nomimono"))

        makanMinum.add(N5("nasi", "ごはん", "gohan"))

        makanMinum.add(N5("makan pagi", "あさ ごはん", "asa gohan"))

        makanMinum.add(N5("makan siang", "ひる ごはん", "hiru gohan"))

        makanMinum.add(N5("makan malam", "ばん'ごはん, ゆうはん ", "ban'gohan, yuuhan"))

        makanMinum.add(N5("makanan bekal", "おべんとう", "obentou"))

        makanMinum.add(N5("masakan", "りょうり", "ryouri"))

        makanMinum.add(N5("daging", "にく", "niku"))

        makanMinum.add(N5("daging sapi", "ぎゅうにく", "gyuuniku"))

        makanMinum.add(N5("daging babi", "ぶたにく", "butaniku"))

        makanMinum.add(N5("daging ayam", "とりぬく, ちきん", "toriniku, chikin"))

        makanMinum.add(N5("sayur", "やさい", "yasai"))

        makanMinum.add(N5("salad", "さらだ", "sarada"))

        makanMinum.add(N5("tomat", "とまと", "tomato"))

        makanMinum.add(N5("buah-buahan", "くだもの", "kudamono"))

        makanMinum.add(N5("apel", "りん'ご", "rin'go"))

        makanMinum.add(N5("jeruk", "みかん", "mikan"))

        makanMinum.add(N5("pisang", "ばなな", "banana"))

        makanMinum.add(N5("roti", "ぱん", "pan"))

        makanMinum.add(N5("mentega", "ばたあ", "bataa"))

        makanMinum.add(N5("telur", "たまご", "tamago"))

        makanMinum.add(N5("susu", "ぎゅんにゅう, みるく", "gyuunyuu, miruku"))

        makanMinum.add(N5("teh hijau", "おちゃ", "ocha"))

        makanMinum.add(N5("teh", "こうちゃ", "koucha"))

        makanMinum.add(N5("kopi", "こおひい", "koohii"))

        makanMinum.add(N5("camilan", "おかし", "okashi"))

        makanMinum.add(N5("permen", "あめ", "ame"))

        makanMinum.add(N5("sake", "おさけ", "osake"))

        return makanMinum
    }

    //80-81
    fun kategoriHobi(): ArrayList<N5> {
        val hobi = ArrayList<N5>()

        hobi.add(N5("musik", "おんがく", "ongaku"))

        hobi.add(N5("lagu", "うた", "uta"))

        hobi.add(N5("gitar", "ぎたあ", "gitaa"))

        hobi.add(N5("piringan hitam", "れこおど", "rekoodo"))

        hobi.add(N5("film", "えいが", "eiga"))

        hobi.add(N5("darmawisata", "りょこう", "ryokou"))

        hobi.add(N5("foto", "しゃしん", "shashin"))

        hobi.add(N5("kamera", "かめら", "kamera"))

        hobi.add(N5("olahraga", "すぽおつ", "supootsu"))

        hobi.add(N5("pesta", "ぱあてぃ", "paati"))

        return hobi
    }

    //81
    fun kategoriKota(): ArrayList<N5> {
        val kota = ArrayList<N5>()

        kota.add(N5("desa", "むら", "mura"))

        kota.add(N5("kota", "まち", "machi"))

        kota.add(N5("jalan", "みち", "michi"))

        kota.add(N5("tikungan, belokan", "かど", "kado"))

        kota.add(N5("persimpangan jalan", "こうさてん", "kousaten"))

        kota.add(N5("jembatan", "ばし", "bashi"))

        kota.add(N5("taman", "こうえん", "kouen"))

        kota.add(N5("kolam renang", "ぷうる", "puuru"))

        kota.add(N5("lapangan tenis", "てにす こおと", "tenisu kooto"))

        kota.add(N5("peta", "ちず", "chizu"))

        return kota
    }

    //81-82
    fun kategoriTransportasi(): ArrayList<N5> {
        val transportasi = ArrayList<N5>()

        transportasi.add(N5("mobil, kendaraan", "くるま", "kuruma"))

        transportasi.add(N5("mobil", "じどうしゃ", "jidousha"))

        transportasi.add(N5("sepeda", "じてんしゃ", "jitensha"))

        transportasi.add(N5("motor", "おとばいく", "otobaiku"))

        transportasi.add(N5("taksi", "たくしい", "takushii"))

        transportasi.add(N5("bis", "ばす", "basu"))

        transportasi.add(N5("kereta listrik", "でんしゃ", "densha"))

        transportasi.add(N5("kereta bawah tanah", "ちかてつ", "chikatetsu"))

        transportasi.add(N5("pesawat terbang", "ひこうき", "hikouki"))

        transportasi.add(N5("karcis, tiket", "きっぷ", "kippu"))

        return transportasi
    }

    //82
    fun kategoriSekolah(): ArrayList<N5> {
        val sekolah = ArrayList<N5>()

        sekolah.add(N5("sekolah", "がっこう", "gakkou"))

        sekolah.add(N5("universitas", "だいがく", "daigaku"))

        sekolah.add(N5("kelas", "きょうしつ", "kyoushitsu"))

        sekolah.add(N5("perpustakaan", "としょかん", "toshokan"))

        sekolah.add(N5("pelajaran", "じゅうぎょう", "juugyou"))

        sekolah.add(N5("kata-kata", "ことば", "kotoba"))

        sekolah.add(N5("bahasa inggris", "えいご", "eigo"))

        sekolah.add(N5("(huruf) kanji", "かんじ", "kanji"))

        sekolah.add(N5("kalimat", "ぶんしょう", "bunshou"))

        sekolah.add(N5("karangan", "さくぶん", "sakubun"))

        sekolah.add(N5("kamus", "じしょ, じびき", "jisho, jibiki"))

        sekolah.add(N5("arti", "いみ", "imi"))

        sekolah.add(N5("pekerjaan rumah,PR", "しゅくだい", "shukudai"))

        sekolah.add(N5("test, ulangan, ujian", "てすと, しけん", "tesuto, shiken"))

        return sekolah
    }

    //82-83
    fun kategoriBangunan(): ArrayList<N5> {
        val bangunan = ArrayList<N5>()

        bangunan.add(N5("bangunan", "たてもの", "tatemono"))

        bangunan.add(N5("apartemen", "あぱと", "apato"))

        bangunan.add(N5("rumah", "ぇ", "le"))

        bangunan.add(N5("hotel", "ほてる", "hoteru"))

        bangunan.add(N5("toko serba-ada", "でぱあと", "depaato"))

        bangunan.add(N5("stasiun", "えき", "eki"))

        bangunan.add(N5("rumah sakit", "びょういん", "byouin"))

        bangunan.add(N5("bioskop", "えいがかん", "eigakan"))

        bangunan.add(N5("bank", "ぎんこう", "ginkou"))

        bangunan.add(N5("kantor pos", "ゆうびんきょく", "yuubinkyoku"))

        bangunan.add(N5("kedutaan", "たいしかん", "taishikan"))

        bangunan.add(N5("pos polisi", "こうばん", "kouban"))

        bangunan.add(N5("kantor", "かいしゃ", "kaisha"))

        bangunan.add(N5("restoran", "れすとらん", "resutoran"))

        bangunan.add(N5("kedai kopi", "きっさてん", "kissaten"))

        bangunan.add(N5("toko", "みせ", "mise"))

        bangunan.add(N5("penjual sayur", "やおや", "yaoya"))

        bangunan.add(N5("lift, elevator", "えれべえたあ", "erebeetaa"))

        bangunan.add(N5("tangga", "かいだん", "kaidan"))

        bangunan.add(N5("tangga berjalan", "えすかれえたあ", "esukareetaa"))

        bangunan.add(N5("pintu masuk", "いりぐち", "iriguchi"))

        bangunan.add(N5("pintu keluar", "でぐち", "deguchi"))

        return bangunan
    }

    //83-84
    fun kategoriRumah(): ArrayList<N5> {
        val rumah = ArrayList<N5>()

        rumah.add(N5("pintu gerbang", "もん", "mon"))

        rumah.add(N5("pekarangan", "にわ", "niwa"))

        rumah.add(N5("pintu depan", "げんかん", "genkan"))

        rumah.add(N5("pintu", "どあ", "doa"))

        rumah.add(N5("jendela", "まど", "mado"))

        rumah.add(N5("ruang tamu", "いま", "ima"))

        rumah.add(N5("dapur", "だいどころ", "daidokoro"))

        rumah.add(N5("ruang makan", "しょくどう", "shokudou"))

        rumah.add(N5("kamar, ruang", "へや", "heya"))

        rumah.add(N5("kamar mandi", "ふろば", "furoba"))

        rumah.add(N5("shower", "しゃわあ", "shawaa"))

        rumah.add(N5("kamar kecil, toilet", "といれ, おてあらい", "toire, otearai"))

        rumah.add(N5("lorong", "ろうか", "rouka"))

        rumah.add(N5("listrik", "でんき", "denki"))

        rumah.add(N5("saluran air, ledeng", "すいどう", "suidou"))

        return rumah
    }

    //84-85
    fun kategoriPeralatanRumah(): ArrayList<N5> {
        val peralRumah = ArrayList<N5>()

        peralRumah.add(N5("sofa", "そふぁ", "sof(u)a"))

        peralRumah.add(N5("kursi", "いす", "isu"))

        peralRumah.add(N5("meja", "つけ, てえぶる", "tsuke, teeburu"))

        peralRumah.add(N5("rak buku", "ほんだな", "hondana"))

        peralRumah.add(N5("ranjang, tempat tidur", "ベット", "beddo"))

        peralRumah.add(N5("tempat tidur ala jepang", "ふとん", "futon"))

        peralRumah.add(N5("AC, pendingin ruangan", "れいぼう", "reibou"))

        peralRumah.add(N5("pemanas ruangan", "だんぼう, すとおぶ", "danbou, sutoobu"))

        peralRumah.add(N5("pengatur suhu udara", "れいだんぼう", "reidanbou"))

        peralRumah.add(N5("kulkas, lemari es", "れいぞうこ", "reizouko"))

        peralRumah.add(N5("televisi", "てれび", "terebi"))

        peralRumah.add(N5("tape recorder", "てえぷれこおだあ", "teepurekoodaa"))

        peralRumah.add(N5("radio", "らじお", "rajio"))

        peralRumah.add(N5("radio kaset", "らじかせ, らじかせっと", "rajikase, rajikasetto"))

        peralRumah.add(N5("telepon", "でんわ", "denwa"))

        peralRumah.add(N5("gambar, lukisan", "え", "e"))

        peralRumah.add(N5("kalender", "かれんだあ", "karendaa"))

        peralRumah.add(N5("jam(dinding)", "とけい", "tokei"))

        peralRumah.add(N5("vas bunga", "かびん", "kabin"))

        peralRumah.add(N5("asbak", "はいざら", "haizara"))

        return peralRumah
    }

    //84-85
    fun kategoriPeralatanMakan(): ArrayList<N5> {
        val peralMakan = ArrayList<N5>()

        peralMakan.add(N5("piring", "さら", "sara"))

        peralMakan.add(N5("sendok", "すぷうん", "supuun"))

        peralMakan.add(N5("garpu", "ふぉおく", "fooku"))

        peralMakan.add(N5("pisau", "ないふ", "naifu"))

        peralMakan.add(N5("mangkok nasi", "ちゃわん", "chawan"))

        peralMakan.add(N5("sumpit", "はし", "hashi"))

        peralMakan.add(N5("gelas", "こっぷ", "koppu"))

        peralMakan.add(N5("cangkir", "かっぷ", "kappu"))

        return peralMakan
    }

    //85
    fun kategoriBumbu(): ArrayList<N5> {
        val bumbu = ArrayList<N5>()

        bumbu.add(N5("gula pasir", "さとう", "satou"))

        bumbu.add(N5("garam", "しお", "shio"))

        bumbu.add(N5("lada, merica", "こしょう", "koshou"))

        bumbu.add(N5("kecap asin", "しょうゆ", "shouyu"))

        bumbu.add(N5("bumbu dapur", "ちょうみりょう", "choumiryou"))

        return bumbu
    }

    //86
    fun kategoriAlatTulis(): ArrayList<N5> {
        val alatTulis = ArrayList<N5>()

        alatTulis.add(N5("kertas", "かみ", "kami"))

        alatTulis.add(N5("pulpen", "ぼおるぺん", "boorupen"))

        alatTulis.add(N5("pen tinta", "まんねんひつ", "mannenhitsu"))

        alatTulis.add(N5("pensil", "えんぴつ", "enpitsu"))

        alatTulis.add(N5("buku", "ほん", "hon"))

        alatTulis.add(N5("buku tulis, notes", "のおと", "nooto"))

        alatTulis.add(N5("kertas surat", "てがみ", "tegami"))

        alatTulis.add(N5("perangko", "きって", "kitte"))

        alatTulis.add(N5("kartu pos", "はがき", "hagaki"))

        alatTulis.add(N5("amplop", "ふうとう", "fuutou"))

        alatTulis.add(N5("pita, selotip", "てえぷ", "teepu"))

        alatTulis.add(N5("kotak, box", "はこ", "hako"))

        return alatTulis
    }

    //86
    fun kategoriJabatanKerja(): ArrayList<N5> {
        val jabatan = ArrayList<N5>()

        jabatan.add(N5("pekerjaan", "しごと", "shigoto"))

        jabatan.add(N5("dokter", "いしゃ", "isha"))

        jabatan.add(N5("polisi", "けいかん", "keikan"))

        jabatan.add(N5("polisi patroli", "おまわりさん", "omawarisan"))

        jabatan.add(N5("guru, pengajar", "せんせい", "sensei"))

        jabatan.add(N5("murid", "せいと", "seito"))

        jabatan.add(N5("pelajar, mahasiswa", "がくせい", "gakusei"))

        jabatan.add(N5("pelajar asing", "りゅうがくせい", "ryuugakusei"))

        return jabatan
    }

    //87
    fun kategoriArah(): ArrayList<N5> {
        val arah = ArrayList<N5>()

        arah.add(N5("atas", "うえ", "ue"))

        arah.add(N5("bawah", "した", "shita"))

        arah.add(N5("depan", "まえ", "mae"))

        arah.add(N5("belakang", "うしろ", "ushiro"))

        arah.add(N5("luar", "そと", "soto"))

        arah.add(N5("dalam", "なか", "naka"))

        arah.add(N5("seberang sana", "むこう", "mukou"))

        arah.add(N5("seberang sini", "てまえ", "temae"))

        arah.add(N5("kanan", "みぎ", "migi"))

        arah.add(N5("kiri", "ひだり", "hidari"))

        arah.add(N5("sebelah tetangga", "となり", "tonari"))

        arah.add(N5("samping", "よこ", "yoko"))

        arah.add(N5("sekitar", "へん", "hen"))

        arah.add(N5("dekat sini", "ちかく", "chikaku"))

        arah.add(N5("timur", "ひがし", "higashi"))

        arah.add(N5("barat", "にし", "nishi"))

        arah.add(N5("utara", "きた", "kita"))

        arah.add(N5("selatan", "みなみ ", "minami"))

        return arah
    }

    //87-88
    fun kategoriPenunjuk(): ArrayList<N5> {
        val penunjuk = ArrayList<N5>()

        penunjuk.add(N5("ini", "これ", "kore"))

        penunjuk.add(N5("itu", "それ", "sore"))

        penunjuk.add(N5("itu(jauh)", "あれ", "are"))

        penunjuk.add(N5("benda ini", "この", "kono"))

        penunjuk.add(N5("benda itu", "その", "sono"))

        penunjuk.add(N5("benda itu(jauh)", "あの", "ano"))

        penunjuk.add(N5("sini", "ここ", "koko"))

        penunjuk.add(N5("situ", "そこ", "soko"))

        penunjuk.add(N5("sana", "あそこ", "asoko"))

        penunjuk.add(N5("arah sini", "こちら, こっち", "kochira, kocchi"))

        penunjuk.add(N5("arah situ", "そちら, そっち", "sochira, socchi"))

        penunjuk.add(N5("arah sana", "あちら, あっち", "achira, acchi"))

        penunjuk.add(N5("begini, demikian ini", "こんな", "konna"))

        penunjuk.add(N5("begitu, demikian itu", "そんな", "sonna"))

        penunjuk.add(N5("begitu, demikian itu", "あんな", "anna"))

        return penunjuk
    }

    //88
    fun kategoriKataTanya(): ArrayList<N5> {
        val tanya = ArrayList<N5>()

        tanya.add(N5("apa", "なに", "nani"))

        tanya.add(N5("siapa", "だれ, どなた", "dare, donata"))

        tanya.add(N5("mengapa", "なんで, どうして", "nande, doushite"))

        tanya.add(N5("dimana", "どこ", "doko"))

        tanya.add(N5("arah mana(pilihan 2 benda)", "どちら, どっち", "dochira, docchi"))

        tanya.add(N5("yang mana", "どの", "dono"))

        tanya.add(N5("yang mana(pilihan 3 benda)", "どれ", "dore"))

        tanya.add(N5("kapan", "いつ", "itsu"))

        tanya.add(N5("berapa harganya", "いくら", "ikura"))

        tanya.add(N5("berapa buah, umur berapa", "いくつ", "ikutsu"))

        tanya.add(N5("bagaimana", "いかが, どう", "ikaga, dou"))

        return tanya
    }

    //88-89
    fun kategoriKataSambung(): ArrayList<N5> {
        val sambung = ArrayList<N5>()

        sambung.add(N5("dan, lalu", "そして", "soshite"))

        sambung.add(N5("tepat, pas", "ちょうど", "choudo"))

        sambung.add(N5("berikut, selanjutnya", "つぎ", "tsugi"))

        sambung.add(N5("kadang-kadang", "ときどき", "tokidoki"))

        sambung.add(N5("selalu", "いつも", "itsumo"))

        sambung.add(N5("sering, dengan baik", "よく", "yoku"))

        sambung.add(N5("kalau begitu", "じゃ, じゃあ", "ja, jaa"))

        sambung.add(N5("nah!", "さあ", "saa"))

        sambung.add(N5("dan lain-lain", "など", "nado"))

        sambung.add(N5("mula-mula, pertama-tama", "はじめ", "hajime"))

        sambung.add(N5("pertama kali", "はじめて", "hajimete"))

        sambung.add(N5("terakhir", "さいご", "saigo"))

        sambung.add(N5("tidak apa-apa", "だいじょうぶ", "daijoubu"))

        sambung.add(N5("panjangnya", "たて", "tate"))

        sambung.add(N5("lebarnya", "よこ", "yoko"))

        sambung.add(N5("yang lain", "ほか", "hoka"))

        sambung.add(N5("sungguh-sungguh, benar-benar", "ほんとう に", "hontou ni"))

        sambung.add(N5("belum, masih", "まだ", "mada"))

        sambung.add(N5("sudah, lagi", "もう", "mou"))

        sambung.add(N5("lebih", "もっと", "motto"))

        sambung.add(N5("perlahan-lahan", "ゆっくり", "yukkuri"))

        sambung.add(N5("cepat-cepat", "はやく", "hayaku"))
        
        return sambung
    }
}
