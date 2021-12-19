package com.capstone.project.kotoba.ui.practice.n5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.lifecycle.ViewModelProvider
import com.capstone.project.kotoba.data.n5.N5
import com.capstone.project.kotoba.databinding.ActivityPracticeN5Binding

class PracticeN5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPracticeN5Binding
    private var cards: MutableList<N5> = mutableListOf()
    private var uuid: Int = 0
    private var cardNumber: Int = 0
    private val title = "Menghafal Kosakata N5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPracticeN5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = title

        uuid = intent.getIntExtra("uuid",0)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[PracticeN5ViewModel::class.java]

        when (uuid){
            0 -> {
                cards = viewModel.getAlam()
            }
            1 -> {
                cards = viewModel.getAlatTulis()
            }
            2 -> {
                cards = viewModel.getAngka()
            }
            3 -> {
                cards = viewModel.getArah()
            }
            4 -> {
                cards = viewModel.getBangunan()
            }
            5 -> {
                cards = viewModel.getBenda()
            }
            6 -> {
                cards = viewModel.getBinatang()
            }
            7 -> {
                cards = viewModel.getBumbu()
            }
            8 -> {
                cards = viewModel.getHari()
            }
            9 -> {
                cards = viewModel.getHobi()
            }
            10 -> {
                cards = viewModel.getJabatan()
            }
            11 -> {
                cards = viewModel.getGanti()
            }
            12 -> {
                cards = viewModel.getKerjaI()
            }
            13 -> {
                cards = viewModel.getKerjaII()
            }
            14 -> {
                cards = viewModel.getKerjaIII()
            }
            15 -> {
                cards = viewModel.getKerjaIV()
            }
            16 -> {
                cards = viewModel.getKerjaV()
            }
            17 -> {
                cards = viewModel.getKerjaVI()
            }
            18 -> {
                cards = viewModel.getKeterangan()
            }
            19 -> {
                cards = viewModel.getPenunjuk()
            }
            20 -> {
                cards = viewModel.getSambung()
            }
            21 -> {
                cards = viewModel.getSifatNon()
            }
            22 -> {
                cards = viewModel.getSifatI()
            }
            23 -> {
                cards = viewModel.getSifatII()
            }
            24 -> {
                cards = viewModel.getSTanya()
            }
            25 -> {
                cards = viewModel.getKeluarga()
            }
            26 -> {
                cards = viewModel.getKetWaktu()
            }
            27 -> {
                cards = viewModel.getKota()
            }
            28 -> {
                cards = viewModel.getMakanMinum()
            }
            29 -> {
                cards = viewModel.getManusia()
            }
            30 -> {
                cards = viewModel.getMusim()
            }
            31 -> {
                cards = viewModel.getPakaian()
            }
            32 -> {
                cards = viewModel.getPeralatanMakan()
            }
            33 -> {
                cards = viewModel.getPeralatanRumah()
            }
            34 -> {
                cards = viewModel.getRumahBagian()
            }
            35 -> {
                cards = viewModel.getSatuan()
            }
            36 -> {
                cards = viewModel.getSekolah()
            }
            37 -> {
                cards = viewModel.getSTanggalHari()
            }
            38 -> {
                cards = viewModel.getTransportasi()
            }
            39 -> {
                cards = viewModel.getWarna()
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