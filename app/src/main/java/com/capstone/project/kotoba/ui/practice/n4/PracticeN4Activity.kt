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
    private val title = "Menghafal Kosakata N4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeN4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title

        uuid = intent.getIntExtra("uuid",0)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[PracticeN4ViewModel::class.java]
        when (uuid){
            0 -> {
                cards = viewModel.getAlam()
            }
            1 -> {
                cards = viewModel.getAlasanUrusan()
            }
            2 -> {
                cards = viewModel.getArah()
            }
            3 -> {
                cards = viewModel.getBangunanBagiannya()
            }
            4 -> {
                cards = viewModel.getBatasanBagian()
            }
            5 -> {
                cards = viewModel.getBencanaBahaya()
            }
            6 -> {
                cards = viewModel.getBentukJenis()
            }
            7 -> {
                cards = viewModel.getBinatang()
            }
            8 -> {
                cards = viewModel.getBukuAlatTulis()
            }
            9 -> {
                cards = viewModel.getJumlah()
            }
            10 -> {
                cards = viewModel.getKantorPerusahaan()
            }
            11 -> {
                cards = viewModel.getKataGantiOrang()
            }
            12 -> {
                cards = viewModel.getKataGantiPenunjuk()
            }
            13 -> {
                cards = viewModel.getKataKerjaPart1()
            }
            14 -> {
                cards = viewModel.getKataKerjaPart2()
            }
            15 -> {
                cards = viewModel.getKataKerjaPart3()
            }
            16 -> {
                cards = viewModel.getKataKeterangan()
            }
            17 -> {
                cards = viewModel.getKataPanggilan()
            }
            18 -> {
                cards = viewModel.getKataSambung()
            }
            19 -> {
                cards = viewModel.getKataSifatI()
            }
            20 -> {
                cards = viewModel.getKataSifatNonI()
            }
            21 -> {
                cards = viewModel.getKebudayaanSejarahAgama()
            }
            22 -> {
                cards = viewModel.getKeluarga()
            }
            23 -> {
                cards = viewModel.getKesempatanMasaDepan()
            }
            24 -> {
                cards = viewModel.getKeteranganWaktu()
            }
            25 -> {
                cards = viewModel.getKeuanganEkonomiPerdagangan()
            }
            26 -> {
                cards = viewModel.getKomputer()
            }
            27 -> {
                cards = viewModel.getKomunitasMasyarakat()
            }
            28 -> {
                cards = viewModel.getLainLain()
            }
            29 -> {
                cards = viewModel.getMakananMinuman()
            }
            30 -> {
                cards = viewModel.getManusiaBagianTubuh()
            }
            31 -> {
                cards = viewModel.getPakaianBahanPakaianPerhiasaan()
            }
            32 -> {
                cards = viewModel.getPendidikan()
            }
            33 -> {
                cards = viewModel.getPenyakit()
            }
            34 -> {
                cards = viewModel.getPerasaanPergaulan()
            }
            35 -> {
                cards = viewModel.getPerayaan()
            }
            36 -> {
                cards = viewModel.getPetaLokasi()
            }
            37 -> {
                cards = viewModel.getPolitikHukum()
            }
            38 -> {
                cards = viewModel.getProfesiPekerjaanKedudukan()
            }
            39-> {
                cards = viewModel.getRekreasiOlahragaPertandingan()
            }
            40 -> {
                cards = viewModel.getTempatTinggalPeralatan()
            }
            41 -> {
                cards = viewModel.getTransportasiLaluLintas()
            }
        }
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