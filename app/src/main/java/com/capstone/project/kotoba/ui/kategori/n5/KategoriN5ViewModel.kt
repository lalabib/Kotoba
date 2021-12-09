package com.capstone.project.kotoba.ui.kategori.n5

import androidx.lifecycle.ViewModel
import com.capstone.project.kotoba.data.n5.DataKategoriN5
import com.capstone.project.kotoba.data.n5.KategoriN5

class KategoriN5ViewModel : ViewModel()  {

    fun getKategori(): List<KategoriN5> = DataKategoriN5.kategoriN5()
}