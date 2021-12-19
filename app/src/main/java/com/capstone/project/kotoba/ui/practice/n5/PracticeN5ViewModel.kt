package com.capstone.project.kotoba.ui.practice.n5

import androidx.lifecycle.ViewModel
import com.capstone.project.kotoba.data.n5.DataKataN5
import com.capstone.project.kotoba.data.n5.N5

class PracticeN5ViewModel: ViewModel() {

    fun getAlam(): MutableList<N5> = DataKataN5.kategoriAlam()

    fun getAlatTulis(): MutableList<N5> = DataKataN5.kategoriAlatTulis()

    fun getAngka(): MutableList<N5> = DataKataN5.kategoriAngka()

    fun getArah(): MutableList<N5> = DataKataN5.kategoriArah()

    fun getBangunan(): MutableList<N5> = DataKataN5.kategoriBangunan()

    fun getBenda(): MutableList<N5> = DataKataN5.kategoriBenda()

    fun getBinatang(): MutableList<N5> = DataKataN5.kategoriBinatang()

    fun getBumbu(): MutableList<N5> = DataKataN5.kategoriBumbu()

    fun getHari(): MutableList<N5> = DataKataN5.kategoriHari()

    fun getHobi(): MutableList<N5> = DataKataN5.kategoriHobi()

    fun getJabatan(): MutableList<N5> = DataKataN5.kategoriJabatanKerja()

    fun getGanti(): MutableList<N5> = DataKataN5.kategoriKataGanti()

    fun getKerjaI(): MutableList<N5> = DataKataN5.kategoriKataKerjaGOlI()

    fun getKerjaII(): MutableList<N5> = DataKataN5.kategoriKataKerjaGOlII()

    fun getKerjaIII(): MutableList<N5> = DataKataN5.kategoriKataKerjaGOlIII()

    fun getKerjaIV(): MutableList<N5> = DataKataN5.kategoriKataKerjaGOlIV()

    fun getKerjaV(): MutableList<N5> = DataKataN5.kategoriKataKerjaGOlV()

    fun getKerjaVI(): MutableList<N5> = DataKataN5.kategoriKataKerjaGOlVI()

    fun getKeterangan(): MutableList<N5> = DataKataN5.kategoriKataKeterangan()

    fun getPenunjuk(): MutableList<N5> = DataKataN5.kategoriPenunjuk()

    fun getSambung(): MutableList<N5> = DataKataN5.kategoriKataSambung()

    fun getSifatNon(): MutableList<N5> = DataKataN5.kategoriKataSifatNon()

    fun getSifatI(): MutableList<N5> = DataKataN5.kategoriKataSifatI()

    fun getSifatII(): MutableList<N5> = DataKataN5.kategoriKataSifatII()

    fun getSTanya(): MutableList<N5> = DataKataN5.kategoriKataTanya()

    fun getKeluarga(): MutableList<N5> = DataKataN5.kategoriKeluarga()

    fun getKetWaktu(): MutableList<N5> = DataKataN5.kategoriKetWaktu()

    fun getKota(): MutableList<N5> = DataKataN5.kategoriKota()

    fun getMakanMinum(): MutableList<N5> = DataKataN5.kategoriMakananMinuman()

    fun getManusia(): MutableList<N5> = DataKataN5.kategoriManusiaTubuh()

    fun getMusim(): MutableList<N5> = DataKataN5.kategoriMusim()

    fun getPakaian(): MutableList<N5> = DataKataN5.kategoriPakaian()

    fun getPeralatanMakan(): MutableList<N5> = DataKataN5.kategoriPeralatanMakan()

    fun getPeralatanRumah(): MutableList<N5> = DataKataN5.kategoriPeralatanRumah()

    fun getRumahBagian(): MutableList<N5> = DataKataN5.kategoriRumah()

    fun getSatuan(): MutableList<N5> = DataKataN5.kategoriSatuan()

    fun getSekolah(): MutableList<N5> = DataKataN5.kategoriSekolah()

    fun getSTanggalHari(): MutableList<N5> = DataKataN5.kategoriTglHari()

    fun getTransportasi(): MutableList<N5> = DataKataN5.kategoriTransportasi()

    fun getWarna(): MutableList<N5> = DataKataN5.kategoriWarna()
}