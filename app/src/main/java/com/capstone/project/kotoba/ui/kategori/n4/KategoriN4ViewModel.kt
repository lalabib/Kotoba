package com.capstone.project.kotoba.ui.kategori.n4

import androidx.lifecycle.ViewModel
import com.capstone.project.kotoba.data.n4.DataKategoriN4
import com.capstone.project.kotoba.data.n4.KategoriN4

class KategoriN4ViewModel: ViewModel() {
    fun getKategoriN4(): List<KategoriN4> = DataKategoriN4.getKategoriN4()
}