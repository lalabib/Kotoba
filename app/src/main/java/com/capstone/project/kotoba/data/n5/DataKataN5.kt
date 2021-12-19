package com.capstone.project.kotoba.data.n5

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

        satuan.add(N5("kilo, kilogram(kg)", "キロ, キログラム", "kiro, kiroguramu"))

        satuan.add(N5("gram(gr)", "グラム", "guramu"))

        satuan.add(N5("kilo, kilometer(km)", "キロ, キロメートル", "kiro, kiromeetoru"))

        satuan.add(N5("meter(m)", "メートル", "meetoru"))

        satuan.add(N5("lembar", "まい", "mai"))

        satuan.add(N5("halaman", "ページ", "peeji"))

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

        binatang.add(N5("binatang peliharaan", "ペット", "petto"))

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

        benda.add(N5("sapu-tangan", "ハンカチ", "hankachi"))

        benda.add(N5("handuk", "たおる", "taoru"))

        benda.add(N5("sabun", "せっけん", "sekken"))

        benda.add(N5("shampo", "シャンプー", "shanpuu"))

        benda.add(N5("dompet", "さいふ", "saifu"))

        benda.add(N5("uang", "おかね", "okane"))

        benda.add(N5("sandal", "スリッパ", "surippa"))

        benda.add(N5("kaos kaki", "くつした", "kutsushita"))

        benda.add(N5("sepatu", "くつぃ", "kutsi"))

        benda.add(N5("barang bawaan", "にもつ", "nimotsu"))

        benda.add(N5("tas", "かばん", "kaban"))

        benda.add(N5("rokok","たばこ", "tabako"))

        benda.add(N5("korek api", "マッチ", "macchi"))

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

        pakaian.add(N5("mantel", "コート", "kouto"))

        pakaian.add(N5("baju hangat, sweter", "セーター", "seetaa"))

        pakaian.add(N5("jas", "せびろ", "sebiro"))

        pakaian.add(N5("jaket", "じゃけっと", "jaketto"))

        pakaian.add(N5("kemeja", "ワイシャツ, シャツ", "waishatsu, shatsu"))

        pakaian.add(N5("dasi", "ネクタイ", "nekutai"))

        pakaian.add(N5("rok", "スカート", "sukaato"))

        pakaian.add(N5("celana panjang", "ズボン", "zubon"))

        pakaian.add(N5("saku", "ポケット", "poketto"))

        pakaian.add(N5("kancing baju", "ボタン", "botan"))

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

        makanMinum.add(N5("daging ayam", "とりにく, チキン", "toriniku, chikin"))

        makanMinum.add(N5("sayur", "やさい", "yasai"))

        makanMinum.add(N5("salad", "サラダ", "sarada"))

        makanMinum.add(N5("tomat", "トマト", "tomato"))

        makanMinum.add(N5("buah-buahan", "くだもの", "kudamono"))

        makanMinum.add(N5("apel", "りん'ご", "rin'go"))

        makanMinum.add(N5("jeruk", "みかん", "mikan"))

        makanMinum.add(N5("pisang", "バナナ", "banana"))

        makanMinum.add(N5("roti", "パン", "pan"))

        makanMinum.add(N5("mentega", "バター", "bataa"))

        makanMinum.add(N5("telur", "たまご", "tamago"))

        makanMinum.add(N5("susu", "ミルク", "miruku"))

        makanMinum.add(N5("teh hijau", "おちゃ", "ocha"))

        makanMinum.add(N5("teh", "こうちゃ", "koucha"))

        makanMinum.add(N5("kopi", "コーヒー", "koohii"))

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

        hobi.add(N5("gitar", "ギター", "gitaa"))

        hobi.add(N5("piringan hitam", "レコード", "rekoudo"))

        hobi.add(N5("film", "えいが", "eiga"))

        hobi.add(N5("darmawisata", "りょこう", "ryokou"))

        hobi.add(N5("foto", "しゃしん", "shashin"))

        hobi.add(N5("kamera", "カメラ", "kamera"))

        hobi.add(N5("olahraga", "スポーツ", "supootsu"))

        hobi.add(N5("pesta", "パーティー", "paati"))

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

        kota.add(N5("kolam renang", "プール", "puuru"))

        kota.add(N5("lapangan tenis", "テニスコート", "tenisu kooto"))

        kota.add(N5("peta", "ちず", "chizu"))

        return kota
    }

    //81-82
    fun kategoriTransportasi(): ArrayList<N5> {
        val transportasi = ArrayList<N5>()

        transportasi.add(N5("mobil, kendaraan", "くるま", "kuruma"))

        transportasi.add(N5("mobil", "じどうしゃ", "jidousha"))

        transportasi.add(N5("sepeda", "じてんしゃ", "jitensha"))

        transportasi.add(N5("motor", "オートバイク", "otobaiku"))

        transportasi.add(N5("taksi", "タクシー", "takushii"))

        transportasi.add(N5("bis", "バス", "basu"))

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

        sekolah.add(N5("kelas", "クラス", "kurasu"))

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

        sekolah.add(N5("test, ulangan, ujian", "テスト, しけん", "tesuto, shiken"))

        return sekolah
    }

    //82-83
    fun kategoriBangunan(): ArrayList<N5> {
        val bangunan = ArrayList<N5>()

        bangunan.add(N5("bangunan", "たてもの", "tatemono"))

        bangunan.add(N5("apartemen", "アパート", "apaato"))

        bangunan.add(N5("rumah", "ぇ", "le"))

        bangunan.add(N5("hotel", "ホテル", "hoteru"))

        bangunan.add(N5("toko serba-ada", "デパート", "depaato"))

        bangunan.add(N5("stasiun", "えき", "eki"))

        bangunan.add(N5("rumah sakit", "びょういん", "byouin"))

        bangunan.add(N5("bioskop", "えいがかん", "eigakan"))

        bangunan.add(N5("bank", "ぎんこう", "ginkou"))

        bangunan.add(N5("kantor pos", "ゆうびんきょく", "yuubinkyoku"))

        bangunan.add(N5("kedutaan", "たいしかん", "taishikan"))

        bangunan.add(N5("pos polisi", "こうばん", "kouban"))

        bangunan.add(N5("kantor", "かいしゃ", "kaisha"))

        bangunan.add(N5("restoran", "レストラン", "resutoran"))

        bangunan.add(N5("kedai kopi", "きっさてん", "kissaten"))

        bangunan.add(N5("toko", "みせ", "mise"))

        bangunan.add(N5("penjual sayur", "やおや", "yaoya"))

        bangunan.add(N5("lift, elevator", "エレベーター", "erebeetaa"))

        bangunan.add(N5("tangga", "かいだん", "kaidan"))

        bangunan.add(N5("tangga berjalan", "エスカレーター", "esukareetaa"))

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

        rumah.add(N5("shower", "シャワー", "shawaa"))

        rumah.add(N5("kamar kecil, toilet", "トイレ, おてらい", "toire, otearai"))

        rumah.add(N5("lorong", "ろうか", "rouka"))

        rumah.add(N5("listrik", "でんき", "denki"))

        rumah.add(N5("saluran air, ledeng", "すいどう", "suidou"))

        return rumah
    }

    //84-85
    fun kategoriPeralatanRumah(): ArrayList<N5> {
        val peralRumah = ArrayList<N5>()

        peralRumah.add(N5("sofa", "ソフア", "sof(u)a"))

        peralRumah.add(N5("kursi", "いす", "isu"))

        peralRumah.add(N5("meja", "つくえ, テーブル", "tsuke, teeburu"))

        peralRumah.add(N5("rak buku", "ほんだな", "hondana"))

        peralRumah.add(N5("ranjang, tempat tidur", "ベット", "beddo"))

        peralRumah.add(N5("tempat tidur ala jepang", "ふとん", "futon"))

        peralRumah.add(N5("AC, pendingin ruangan", "れいぼう", "reibou"))

        peralRumah.add(N5("pemanas ruangan", "だんぼう, ストーブ", "danbou, sutoobu"))

        peralRumah.add(N5("pengatur suhu udara", "れいだんぼう", "reidanbou"))

        peralRumah.add(N5("kulkas, lemari es", "れいぞうこ", "reizouko"))

        peralRumah.add(N5("televisi", "テレビ", "terebi"))

        peralRumah.add(N5("tape recorder", "テープレコーダー", "teepurekoodaa"))

        peralRumah.add(N5("radio", "ラジオ", "rajio"))

        peralRumah.add(N5("radio kaset", "ラジカセ, ラジカセット", "rajikase, rajikasetto"))

        peralRumah.add(N5("telepon", "でんわ", "denwa"))

        peralRumah.add(N5("gambar, lukisan", "え", "e"))

        peralRumah.add(N5("kalender", "カレンダー", "karendaa"))

        peralRumah.add(N5("jam(dinding)", "とけい", "tokei"))

        peralRumah.add(N5("vas bunga", "かびん", "kabin"))

        peralRumah.add(N5("asbak", "はいざら", "haizara"))

        return peralRumah
    }

    //84-85
    fun kategoriPeralatanMakan(): ArrayList<N5> {
        val peralMakan = ArrayList<N5>()

        peralMakan.add(N5("piring", "さら", "sara"))

        peralMakan.add(N5("sendok", "スプーン", "supuun"))

        peralMakan.add(N5("garpu", "フォーク", "fouku"))

        peralMakan.add(N5("pisau", "ナイフ", "naifu"))

        peralMakan.add(N5("mangkok nasi", "ちゃわん", "chawan"))

        peralMakan.add(N5("sumpit", "はし", "hashi"))

        peralMakan.add(N5("gelas", "コップ", "koppu"))

        peralMakan.add(N5("cangkir", "カップ", "kappu"))

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

        alatTulis.add(N5("pulpen", "ペン, ボルペン", "pen, boorupen"))

        alatTulis.add(N5("pen tinta", "まんねんひつ", "mannenhitsu"))

        alatTulis.add(N5("pensil", "えんぴつ", "enpitsu"))

        alatTulis.add(N5("buku", "ほん", "hon"))

        alatTulis.add(N5("buku tulis, notes", "ノート", "nouto"))

        alatTulis.add(N5("kertas surat", "てがみ", "tegami"))

        alatTulis.add(N5("perangko", "きって", "kitte"))

        alatTulis.add(N5("kartu pos", "はがき", "hagaki"))

        alatTulis.add(N5("amplop", "ふうとう", "fuutou"))

        alatTulis.add(N5("pita, selotip", "テープ", "teepu"))

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

        sambung.add(N5("kemudian, setelah itu", "それから", "sorekara"))

        sambung.add(N5("kalau begitu", "でわ, それでわ ", "dewa, soredewa"))

        sambung.add(N5("tetapi", "でも ", "demo"))

        sambung.add(N5("agak, tidak begitu..", "あまり", "amari"))

        sambung.add(N5("daripada", "より", "yori"))

        sambung.add(N5("lebih", "ほう が", "hou ga"))

        sambung.add(N5("lagi, lagi pula", "また", "mata"))

        sambung.add(N5("sebelum..", "の まえ に", "no mae ni"))

        sambung.add(N5("sesudah..", "た あと で", "ta ato de"))

        sambung.add(N5("bersama dengan", "と いっしょ に", "to issho ni"))

        return sambung
    }

    //89-90
    fun kategoriKataKeterangan(): ArrayList<N5> {
        val keterangan = ArrayList<N5>()

        keterangan.add(N5("nomor satu, paling", "いちばん", "ichiban"))

        keterangan.add(N5("sama", "おなじ", "onaji"))

        keterangan.add(N5("banyak", "たくさん", "takusan"))

        keterangan.add(N5("banyak(manusia), ramai", "おおぜい", "oozei"))

        keterangan.add(N5("cukup, bagus", "けっこう", "kekkou"))

        keterangan.add(N5("sangat", "とても", "totemo"))

        keterangan.add(N5("sedikit, agak", "すこし", "sukoshi"))

        keterangan.add(N5("kurang", "すくまい", "sukumai"))

        keterangan.add(N5("semua, setiap orang, anda sekalian", "みな, みなさん", "mina, minasan"))

        keterangan.add(N5("seluruh, semua", "ぜんぶ", "zenbu"))

        keterangan.add(N5("separuh, setengah", "はんぶん", "hanbun"))

        keterangan.add(N5("barangkali", "たぶん", "tabun"))

        keterangan.add(N5("lambat laun", "だんだん", "dandan"))

        keterangan.add(N5("agak, sedikit, sebentar", "ちょっと", "chotto"))

        keterangan.add(N5("tepat, pas", "ちょうど", "choudo"))

        keterangan.add(N5("berikut, selanjutnya", "つぎ", "tsugi"))

        keterangan.add(N5("kadang-kadang", "ときどき", "tokidoki"))

        keterangan.add(N5("selalu", "いつも", "itsumo"))

        keterangan.add(N5("sering, dengan baik", "よく", "yoku"))

        keterangan.add(N5("kalau begitu", "じゃ, じゃあ", "ja, jaa"))

        keterangan.add(N5("nah!", "さあ", "saa"))

        keterangan.add(N5("dan lain-lain", "など", "nado"))

        keterangan.add(N5("mula-mula, pertama-tama", "はじめ", "hajime"))

        keterangan.add(N5("pertama kali", "はじめて", "hajimete"))

        keterangan.add(N5("terakhir", "さいご", "saigo"))

        keterangan.add(N5("tidak apa-apa", "だいじょうぶ", "daijoubu"))

        keterangan.add(N5("panjangnya", "たて", "tate"))

        keterangan.add(N5("lebarnya", "よこ", "yoko"))

        keterangan.add(N5("yang lain", "ほか", "hoka"))

        keterangan.add(N5("sungguh-sungguh, benar-benar", "ほんとう に", "hontou ni"))

        keterangan.add(N5("belum, masih", "まだ", "mada"))

        keterangan.add(N5("sudah, lagi", "もう", "mou"))

        keterangan.add(N5("lebih", "もっと", "motto"))

        keterangan.add(N5("perlahan-lahan", "ゆっくり", "yukkuri"))

        keterangan.add(N5("cepat-cepat", "はやく", "hayaku"))

        return keterangan
    }


    //90-91
    fun kategoriKataSifatI(): ArrayList<N5> {
        val sifatI = ArrayList<N5>()

        sifatI.add(N5("biru", "あおい", "aoi"))

        sifatI.add(N5("bahaya", "あぶない", "abunai"))

        sifatI.add(N5("merah", "あかい", "akai"))

        sifatI.add(N5("terang, cerah, ceria", "あかるい", "akarui"))

        sifatI.add(N5("manis", "あまい", "amai"))

        sifatI.add(N5("baru", "あたらしい", "atarashii"))

        sifatI.add(N5("hangat", "あたたかい", "atatakai"))

        sifatI.add(N5("tebal, dalam, ramah", "いつい", "itsui"))

        sifatI.add(N5("panas(cuaca)", "あつい", "atsui"))

        sifatI.add(N5("panas(benda)", "アツイ", "atsui"))

        sifatI.add(N5("kecil", "ちいさい", "chiisai"))

        sifatI.add(N5("dekat", "ちかい", "chikai"))

        sifatI.add(N5("kuno, tua", "ふるい", "furui"))

        sifatI.add(N5("gemuk", "ふとい", "futoi"))

        sifatI.add(N5("cepat(waktu)", "はやい", "hayai"))

        sifatI.add(N5("cepat(laju)", "ハヤイ", "hayai"))

        sifatI.add(N5("rendah", "ひくい", "hikui"))

        sifatI.add(N5("luas, lapang", "ひろい", "hiroi"))

        sifatI.add(N5("ingin", "ほしい", "hoshii"))

        sifatI.add(N5("kurus", "ほそい", "hosoi"))

        sifatI.add(N5("baik, bagus", "いい, よい", "ii, yoi"))

        sifatI.add(N5("sibuk", "いそがしい", "isogashii"))

        sifatI.add(N5("sakit", "いたい", "itai"))

        sifatI.add(N5("pedas, asin","からい", "karai"))

        sifatI.add(N5("ringan","かるい", "karui"))

        sifatI.add(N5("manis, mungil, lucu","かわいい", "kawaii"))

        sifatI.add(N5("kuning","きいろい", "kiiroi"))

        sifatI.add(N5("kotor","きたない", "kitanai"))

        sifatI.add(N5("gelap","くらい", "kurai"))

        sifatI.add(N5("hitam","くろい", "kuroi"))

        sifatI.add(N5("bulat, bundar","まるい", "marui"))

        sifatI.add(N5("tidak enak, tawar","まずい", "mazui"))

        return sifatI
    }

    //92
    fun kategoriKataSifatII(): ArrayList<N5> {
        val sifatII = ArrayList<N5>()

        sifatII.add(N5("pendek","みじかい", "mijikai"))

        sifatII.add(N5("sukar, susah, sulit","むずかしい", "muzukashii"))

        sifatII.add(N5("panjang","ながい", "nagai"))

        sifatII.add(N5("tidak cukup panas/dingin","ぬるい", "nurui"))

        sifatII.add(N5("enak","おいしい", "oishii"))

        sifatII.add(N5("berat","おもい", "omoi"))

        sifatII.add(N5("menarik","おもしろい", "omoshiroi"))

        sifatII.add(N5("banyak","おおい", "ooi"))

        sifatII.add(N5("besar","おおきい", "ookii"))

        sifatII.add(N5("lambat","おそい", "osoi"))

        sifatII.add(N5("dingin(cuaca)","さむい", "samui"))

        sifatII.add(N5("sempit","せまい", "semai"))

        sifatII.add(N5("putih","しろい", "shiroi"))

        sifatII.add(N5("sedikit, kurang","すくない", "sukunai"))

        sifatII.add(N5("sejuk","すずしい", "suzushii"))

        sifatII.add(N5("mahal, tinggi","たかい", "takai"))

        sifatII.add(N5("menyenangkan","たのしい", "tanoshii"))

        sifatII.add(N5("jauh","とおい", "tooi"))

        sifatII.add(N5("membosankan","つまらない", "tsumaranai"))

        sifatII.add(N5("dingin(benda)","つめたい", "tsumetai"))

        sifatII.add(N5("kuat","つよい", "tsuyoi"))

        sifatII.add(N5("berisik, gaduh, bawel","うるさい", "urusai"))

        sifatII.add(N5("tipis","うすい", "usui"))

        sifatII.add(N5("muda","わかい", "wakai"))

        sifatII.add(N5("jelek, buruk","わるい", "warui"))

        sifatII.add(N5("mudah, gampang","やさしい", "yasashii"))

        sifatII.add(N5("murah","やすい", "yasui"))

        sifatII.add(N5("lemah","よわい", "yowai"))

        return sifatII
    }

    //93
    fun kategoriKataSifatNon(): ArrayList<N5> {
        val sifatNon = ArrayList<N5>()

        sifatNon.add(N5("benci, tidak suka","いや", "iya"))

        sifatNon.add(N5("praktis","べんり", "benri"))

        sifatNon.add(N5("kecil","ちいさ", "chiisa"))

        sifatNon.add(N5("sangat suka","だいすき", "daisuki"))

        sifatNon.add(N5("sehat, besemangat","げんき", "genki"))

        sifatNon.add(N5("tidak mahir, bodoh","へた", "heta"))

        sifatNon.add(N5("senggang","ひま", "hima"))

        sifatNon.add(N5("macam-macam","いろいろ", "iroiro"))

        sifatNon.add(N5("kuat, tahan lama","じょうぶ", "joubu"))

        sifatNon.add(N5("mahir","じょうず", "jouzu"))

        sifatNon.add(N5("benci, tidak suka","きらい", "kirai"))

        sifatNon.add(N5("cantik, bersih","きれい", "kirei"))

        sifatNon.add(N5("ramai, bising","にぎやか", "nigiyaka"))

        sifatNon.add(N5("besar","おおき", "ooki"))

        sifatNon.add(N5("megah","りっぱ", "rippa"))

        sifatNon.add(N5("ramah, baik hati","しんせつ", "shinsetsu"))

        sifatNon.add(N5("tenang","しずか", "shizuka"))

        sifatNon.add(N5("suka","すき", "suki"))

        sifatNon.add(N5("menyusahkan","たいへん", "taihen"))

        sifatNon.add(N5("penting","たいせつ", "taisetsu"))

        sifatNon.add(N5("terkenal, ternama","ゆうめい", "yuumei"))

        return sifatNon
    }

    //93-94
    fun kategoriKataKerjaGOlI(): ArrayList<N5> {
        val kerjaGolI = ArrayList<N5>()

        kerjaGolI.add(N5("buka, terbuka","あきます", "akimasu"))

        kerjaGolI.add(N5("berjalan kaki","あるきます", "arukimasu"))

        kerjaGolI.add(N5("bertiup","ふきます", "fukimasu"))

        kerjaGolI.add(N5("mengenakan(celana, rok, kaus kaki)","はきます", "hakimasu"))

        kerjaGolI.add(N5("bekerja","はたらきます", "hatarakimasu"))

        kerjaGolI.add(N5("menarik, terserang","ひきます", "hikimasu"))

        kerjaGolI.add(N5("bermain(gitar, piano)","ヒます", "hikimasu"))

        kerjaGolI.add(N5("pergi","いきます", "ikimasu"))

        kerjaGolI.add(N5("menulis","かきます", "kakimasu"))

        kerjaGolI.add(N5("mendengar, bertanya","ききます", "kikimasu"))

        kerjaGolI.add(N5("menggosok, memoles","みかぎます", "mikagimasu"))

        kerjaGolI.add(N5("bersuara, berbunyi(binatang)","なきます", "nakimasu"))

        kerjaGolI.add(N5("meletakkan","おきます", "okimasu"))

        kerjaGolI.add(N5("berkembang, berbunga","さきます", "sakimasu"))

        kerjaGolI.add(N5("tiba","つきます", "tsukimasu"))

        kerjaGolI.add(N5("menaggalkan","ぬぎます", "nugimasu"))

        kerjaGolI.add(N5("berenang","およぎます", "oyogimasu"))

        kerjaGolI.add(N5("bermain, main-main","あそびます", "asobimasu"))

        kerjaGolI.add(N5("berbaris","ならびます", "narabimasu"))

        kerjaGolI.add(N5("terbang","とびます", "tobimasu"))

        kerjaGolI.add(N5("memanggil","よびます", "yobimasu"))

        kerjaGolI.add(N5("minum","のみます", "nomimasu"))

        kerjaGolI.add(N5("tinggal","すみます", "sumimasu"))

        kerjaGolI.add(N5("meminta, memohon","たのみます", "tanomimasu"))

        kerjaGolI.add(N5("beristirahat","やすみます", "yasumimasu"))

        kerjaGolI.add(N5("membaca","よみます", "yomimasu"))

        kerjaGolI.add(N5("mati, meninggal","しにます", "shinimasu"))

        kerjaGolI.add(N5("bertemu","にます", "nimasu"))

        kerjaGolI.add(N5("mencuci","あらいます", "araimasu"))

        kerjaGolI.add(N5("berbeda, salah","ちがいます", "chigaimasu"))

        kerjaGolI.add(N5("berkata","いいます", "iimasu"))

        kerjaGolI.add(N5("membeli","かいます", "kaimasu"))

        return kerjaGolI
    }

    //95
    fun kategoriKataKerjaGOlII(): ArrayList<N5> {
        val kerjaGolII = ArrayList<N5>()

        kerjaGolII.add(N5("belajar","べんきょうします", "benkyoushimasu"))

        kerjaGolII.add(N5("menghisap","すいます", "suimasu"))

        kerjaGolII.add(N5("memakai, menggunakan","つかいます", "tsukaimasu"))

        kerjaGolII.add(N5("bernyanyi","うたいます", "utaimasu"))

        kerjaGolII.add(N5("menunggu","まちます", "machimasu"))

        kerjaGolII.add(N5("membawa, mempunyai","もちます", "mochimasu"))

        kerjaGolII.add(N5("berdiri","たちます", "tachimasu"))

        kerjaGolII.add(N5("ada, mempunyai(benda mati)","あります", "arimasu"))

        kerjaGolII.add(N5("turun(hujan, salju)","ふります", "furimasu"))

        kerjaGolII.add(N5("masuk, isi","はいります", "hairimasu"))

        kerjaGolII.add(N5("mulai", "はじまります", "hajimarimasu"))

        kerjaGolII.add(N5("menempelkan, melekatkan", "はります", "harimasu"))

        kerjaGolII.add(N5("berlari", "はしります", "hashirimasu"))

        kerjaGolII.add(N5("butuh, perlu", "いります", "irimasu"))

        kerjaGolII.add(N5("pulang", "かえります", "kaerimasu"))

        kerjaGolII.add(N5("memerlukan(waktu, uang)", "かかります", "kakarimasu"))

        kerjaGolII.add(N5("memotong", "きるます", "kirumasu"))

        kerjaGolII.add(N5("menyusahkan", "こまります", "komarimasu"))

        kerjaGolII.add(N5("mendung, berawan", "くもります", "kumorimasu"))

        kerjaGolII.add(N5("membelok, melengkung", "まがります", "magarimasu"))

        kerjaGolII.add(N5("menjadi", "なります", "narimasu"))

        kerjaGolII.add(N5("mendaki", "のぼります", "noborimasu"))

        kerjaGolII.add(N5("naik(kendaraan)", "のります", "norimasu"))

        kerjaGolII.add(N5("selesai, berakhir", "おわります", "owarimasu"))

        kerjaGolII.add(N5("tutup, tertutup", "しまります", "shimarimasu"))

        kerjaGolII.add(N5("mengenal, mengetahui", "しります", "shirimasu"))

        kerjaGolII.add(N5("duduk", "すわります", "suwarimasu"))

        kerjaGolII.add(N5("berhenti", "とまります", "tomarimasu"))

        kerjaGolII.add(N5("mengambil", "とります", "torimasu"))

        kerjaGolII.add(N5("mengambil(foto, film)", "トります", "torimasu"))

        return kerjaGolII
    }

    //96
    fun kategoriKataKerjaGOlIII(): ArrayList<N5> {
        val kerjaGolIII = ArrayList<N5>()

        kerjaGolIII.add(N5("membuat", "つくります", "tsukurimasu"))

        kerjaGolIII.add(N5("menjual", "うります", "urimasu"))

        kerjaGolIII.add(N5("mengerti", "わかります", "wakarimasu"))

        kerjaGolIII.add(N5("menyeberang", "わたります", "watarimasu"))

        kerjaGolIII.add(N5("melakukan", "やります", "yarimasu"))

        kerjaGolIII.add(N5("mengeluarkan", "だします", "dashimasu"))

        kerjaGolIII.add(N5("berbicara", "はなします", "hanashimasu"))

        kerjaGolIII.add(N5("mengembalikan", "かえします", "kaeshimasu"))

        kerjaGolIII.add(N5("meminjamkan", "かします", "kashimasu"))

        kerjaGolIII.add(N5("menghapus, memadamkan", "けします", "keshimasu"))

        kerjaGolIII.add(N5("menghilangkan", "なくします", "nakushimasu"))

        kerjaGolIII.add(N5("mendorong, mencap", "おします", "oshimasu"))

        kerjaGolIII.add(N5("mengulurkan(tangan), memakai(payung)", "さします", "sashimasu"))

        kerjaGolIII.add(N5("meneyerahkan", "わたします", "watashimasu"))

        return kerjaGolIII
    }

    //96
    fun kategoriKataKerjaGOlIV(): ArrayList<N5> {
        val kerjaGolIV = ArrayList<N5>()

        kerjaGolIV.add(N5("mandi, menyiram", "あびます", "abimasu"))

        kerjaGolIV.add(N5("bisa", "できます", "dekimasu"))

        kerjaGolIV.add(N5("ada(manusia, binatang)", "います", "imasu"))

        kerjaGolIV.add(N5("meminjam", "かります", "karimasu"))

        kerjaGolIV.add(N5("mengenakan(pakaian baju)", "きます", "kimasu"))

        kerjaGolIV.add(N5("melihat, menonton", "みます", "mimasu"))

        kerjaGolIV.add(N5("bangun", "おきます", "okimasu"))

        kerjaGolIV.add(N5("turun", "おります", "orimasu"))

        return kerjaGolIV
    }

    //97
    fun kategoriKataKerjaGOlV(): ArrayList<N5> {
        val kerjaGolV = ArrayList<N5>()

        kerjaGolV.add(N5("memberi", "あげます", "agemasu"))

        kerjaGolV.add(N5("membuka", "あけます", "akemasu"))

        kerjaGolV.add(N5("keluar rumah", "でかけます", "dekakaemasu"))

        kerjaGolV.add(N5("keluar, meninggalkan", "でます", "demasu"))

        kerjaGolV.add(N5("cerah", "はれます", "haremasu"))

        kerjaGolV.add(N5("memasukkan", "いれます", "iremasu"))

        kerjaGolV.add(N5("menggantung", "かけます", "kakemasu"))

        kerjaGolV.add(N5("hilang, padam", "きえます", "kiemasu"))

        kerjaGolV.add(N5("menjawab", "こたえます", "kotaemasu"))

        kerjaGolV.add(N5("memperlihatkan", "みせます", "misemasu"))

        kerjaGolV.add(N5("membariskan, menyusun", "ならべます", "narabemasu"))

        kerjaGolV.add(N5("tidur", "ねます", "nemasu"))

        kerjaGolV.add(N5("mengingat", "おぼえます", "oboemasu"))

        kerjaGolV.add(N5("mengajarkan, memberitahu", "おしえます", "oshiemasu"))

        kerjaGolV.add(N5("mengikat", "しめます", "shimemasu"))

        kerjaGolV.add(N5("menutup", "シめます", "shimemasu"))

        kerjaGolV.add(N5("makan", "たべます", "tabemasu"))

        kerjaGolV.add(N5("letih", "つかれます", "tsukaremasu"))

        kerjaGolV.add(N5("menyalakan(api, listrik)", "つけます", "tsukemasu"))

        kerjaGolV.add(N5("berdinas, bertugas", "つとめます", "tsutomemasu"))

        kerjaGolV.add(N5("lahir", "うまれます", "umaremasu"))

        kerjaGolV.add(N5("lupa", "わすれます", "wasuremasu"))

        return kerjaGolV
    }

    //97-98
    fun kategoriKataKerjaGOlVI(): ArrayList<N5> {
        val kerjaGolVI = ArrayList<N5>()

        kerjaGolVI.add(N5("datang", "きます", "kimasu"))

        kerjaGolVI.add(N5("melakukan", "します", "shimasu"))

        kerjaGolVI.add(N5("belajar", "べんきょう します", "benkyou shimasu"))

        kerjaGolVI.add(N5("mengkopi", "こぴい します", "kopii shimasu"))

        kerjaGolVI.add(N5("berlatih", "れんしゅう します", "renshuu shimasu"))

        kerjaGolVI.add(N5("berjalan-jalan", "さんぽ します", "sanpo shimasu"))

        kerjaGolVI.add(N5("membersihkan, melap", "そうじ します", "souji shimasu"))

        return kerjaGolVI
    }
}