package com.capstone.project.kotoba.data.n5

object DataKategoriN5 {

    fun kategoriN5(): ArrayList<KategoriN5> {
        val kategori = ArrayList<KategoriN5>()

        kategori.add(KategoriN5( "Angka", ))

        kategori.add(KategoriN5( "Hari", ))

        kategori.add(KategoriN5( "Tanggal & Jumlah hari", ))

        kategori.add(KategoriN5( "Keterangan Waktu", ))

        kategori.add(KategoriN5( "Warna", ))

        kategori.add(KategoriN5( "Satuan", ))

        kategori.add(KategoriN5( "Kata Ganti", ))

        kategori.add(KategoriN5( "Manusia & Bagian Tubuh", ))

        kategori.add(KategoriN5( "Keluarga", ))

        kategori.add(KategoriN5( "Musim", ))

        return kategori
    }
}