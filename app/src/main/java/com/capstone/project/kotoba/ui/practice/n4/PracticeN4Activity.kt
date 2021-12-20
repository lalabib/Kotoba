package com.capstone.project.kotoba.ui.practice.n4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.lifecycle.ViewModelProvider
import com.capstone.project.kotoba.data.n4.N4
import com.capstone.project.kotoba.databinding.ActivityPracticeN4Binding

class PracticeN4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPracticeN4Binding
    private var cards: MutableList<N4> = mutableListOf()
    private var uuid: Int = 0
    private var cardNumber: Int = 0
    private var title = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeN4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        uuid = intent.getIntExtra("uuid",0)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[PracticeN4ViewModel::class.java]
        when (uuid){
            0 -> {
                cards = viewModel.getAlam()
                title = "Alam"
            }
            1 -> {
                cards = viewModel.getAlasanUrusan()
                title = "Alasan & Urusan"
            }
            2 -> {
                cards = viewModel.getArah()
                title = "Arah"
            }
            3 -> {
                cards = viewModel.getBangunanBagiannya()
                title = "Bangunan & Bagiannya"
            }
            4 -> {
                cards = viewModel.getBatasanBagian()
                title = "Batasan & Bagian"
            }
            5 -> {
                cards = viewModel.getBencanaBahaya()
                title = "Bencana & Bahaya"
            }
            6 -> {
                cards = viewModel.getBentukJenis()
                title = "Bentuk & Jenis"
            }
            7 -> {
                cards = viewModel.getBinatang()
                title = "Binatang"
            }
            8 -> {
                cards = viewModel.getBukuAlatTulis()
                title = "Buku & Alat TUlis"
            }
            9 -> {
                cards = viewModel.getJumlah()
                title = "Jumlah"
            }
            10 -> {
                cards = viewModel.getKantorPerusahaan()
                title = "Kantor & Perusahaan"
            }
            11 -> {
                cards = viewModel.getKataGantiOrang()
                title = "Kata Ganti Orang"
            }
            12 -> {
                cards = viewModel.getKataGantiPenunjuk()
                title = "Kata Ganti Penunjuk"
            }
            13 -> {
                cards = viewModel.getKataKerjaPart1()
                title = "Kata Kerja Part 1"
            }
            14 -> {
                cards = viewModel.getKataKerjaPart2()
                title = "Kata Kerja Part 2"
            }
            15 -> {
                cards = viewModel.getKataKerjaPart3()
                title = "Kata Kerja Part 3"
            }
            16 -> {
                cards = viewModel.getKataKeterangan()
                title = "Kata Keterangan"
            }
            17 -> {
                cards = viewModel.getKataPanggilan()
                title = "Kata Panggilan"
            }
            18 -> {
                cards = viewModel.getKataSambung()
                title = "Kata Sambung"
            }
            19 -> {
                cards = viewModel.getKataSifatI()
                title = "Kata Sifat I"
            }
            20 -> {
                cards = viewModel.getKataSifatNonI()
                title = "Kata Sifat Non I"
            }
            21 -> {
                cards = viewModel.getKebudayaanSejarahAgama()
                title = "Kebudayaan Sejarah Agama"
            }
            22 -> {
                cards = viewModel.getKeluarga()
                title = "Keluarga"
            }
            23 -> {
                cards = viewModel.getKesempatanMasaDepan()
                title = "Kesempatan & Masa Depan"
            }
            24 -> {
                cards = viewModel.getKeteranganWaktu()
                title = "Keterangan Waktu"
            }
            25 -> {
                cards = viewModel.getKeuanganEkonomiPerdagangan()
                title = "Keuangan, Ekonomi & Perdagangan"
            }
            26 -> {
                cards = viewModel.getKomputer()
                title = "Komputer"
            }
            27 -> {
                cards = viewModel.getKomunitasMasyarakat()
                title = "Komunitas & Masyarakat"
            }
            28 -> {
                cards = viewModel.getLainLain()
                title = "Lain - lain"
            }
            29 -> {
                cards = viewModel.getMakananMinuman()
                title = "Makanan & Minuman"
            }
            30 -> {
                cards = viewModel.getManusiaBagianTubuh()
                title = "Manusia & Bagian Tubuh"
            }
            31 -> {
                cards = viewModel.getPakaianBahanPakaianPerhiasan()
                title = "Pakaian, Bahan Pakaian & Perhiasan"
            }
            32 -> {
                cards = viewModel.getPendidikan()
                title = "Pendidikan"
            }
            33 -> {
                cards = viewModel.getPenyakit()
                title = "Penyakit"
            }
            34 -> {
                cards = viewModel.getPerasaanPergaulan()
                title = "Perasaan & Pergaulan"
            }
            35 -> {
                cards = viewModel.getPerayaan()
                title = "Perayaan"
            }
            36 -> {
                cards = viewModel.getPetaLokasi()
                title = "Peta & Lokasi"
            }
            37 -> {
                cards = viewModel.getPolitikHukum()
                title = "Politik & Hukum"
            }
            38 -> {
                cards = viewModel.getProfesiPekerjaanKedudukan()
                title = "Profesi, Pekerjaan & Kedudukan"
            }
            39-> {
                cards = viewModel.getRekreasiOlahragaPertandingan()
                title = "Rekreasi, Olahraga & Pertandingan"
            }
            40 -> {
                cards = viewModel.getTempatTinggalPeralatan()
                title = "Tempat Tinggal & Peralatan"
            }
            41 -> {
                cards = viewModel.getTransportasiLaluLintas()
                title = "Transportasi & Lalu Lintas"
            }
        }
        supportActionBar?.title = title
        showAnswerLittleByLittle()
        binding.meaning.setOnClickListener{
            it.clearAnimation()
            it.alpha = 1f
            redrawFadeScrollbar()
            binding.romaji.clearAnimation()
            binding.romaji.alpha = 1f
        }


        binding.meaning.movementMethod = ScrollingMovementMethod()
        cards.shuffle()

        binding.counter.text = String.format("%d / %d", cardNumber + 1, cards.size)

        if (cards.isEmpty()) {
            return
        }

        val card = cards[cardNumber]
        binding.word.text = card.indonesia
        binding.meaning.text = card.hiragana
        binding.romaji.text = card.romaji
    }

    @Suppress("UNUSED_PARAMETER")
    fun next(view: View) {
        cardNumber++
        if (cardNumber >= cards.size) {
            finish()
            return
        }
        binding.counter.text = String.format("%d / %d", cardNumber + 1, cards.size)
        showAnswerLittleByLittle()

        val card = cards[cardNumber]
        binding.word.text = card.indonesia
        binding.meaning.text = card.hiragana
        binding.romaji.text = card.romaji

        redrawFadeScrollbar()
        binding.meaning.scrollY = 0
    }

    @Suppress("UNUSED_PARAMETER")
    fun previous(view: View) {
        cardNumber--
        if (cardNumber < 0) {
            finish()
            return
        }
        binding.counter.text = String.format("%d / %d", cardNumber + 1, cards.size)
        showAnswerLittleByLittle()
        val card = cards[cardNumber]
        binding.word.text = card.indonesia
        binding.meaning.text = card.hiragana
        binding.romaji.text = card.romaji

        redrawFadeScrollbar()
        binding.meaning.scrollY = 0
    }

    private fun redrawFadeScrollbar() {
        binding.meaning.scrollBy(0, 1)
        binding.meaning.scrollBy(0, -1)
    }

    private fun showAnswerLittleByLittle() {
        val alphaAnimation = AlphaAnimation(0f, 1f)
        alphaAnimation.startOffset = 1000
        alphaAnimation.duration = 2000
        binding.meaning.startAnimation(alphaAnimation)
        binding.romaji.startAnimation(alphaAnimation)
    }
}