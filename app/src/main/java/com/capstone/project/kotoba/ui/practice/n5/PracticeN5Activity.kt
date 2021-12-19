package com.capstone.project.kotoba.ui.practice.n5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.lifecycle.ViewModelProvider
import com.capstone.project.kotoba.data.n5.N5
import com.capstone.project.kotoba.databinding.ActivityPracticeN5Binding
import com.capstone.project.kotoba.ui.practice.n4.PracticeN4ViewModel

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
                cards = viewModel.getAngka()
            }
            2 -> {
                cards = viewModel.getArah()
            }
            3 -> {
                cards = viewModel.getBangunan()
            }
            4 -> {
                cards = viewModel.getBenda()
            }
            5 -> {
                cards = viewModel.getBinatang()
            }
            6 -> {
                cards = viewModel.getBumbu()
            }
            7 -> {
                cards = viewModel.getHari()
            }
            8 -> {
                cards = viewModel.getHobi()
            }
            9 -> {
                cards = viewModel.getJabatan()
            }
            10 -> {
                cards = viewModel.getGanti()
            }
            11 -> {
                cards = viewModel.getKerjaI()
            }
            12 -> {
                cards = viewModel.getKerjaII()
            }
            13 -> {
                cards = viewModel.getKerjaIII()
            }
            14 -> {
                cards = viewModel.getKerjaIV()
            }
            15 -> {
                cards = viewModel.getKerjaV()
            }
            16 -> {
                cards = viewModel.getKerjaVI()
            }
            17 -> {
                cards = viewModel.getKeterangan()
            }
            18 -> {
                cards = viewModel.getPenunjuk()
            }
            19 -> {
                cards = viewModel.getSambung()
            }
            20 -> {
                cards = viewModel.getSifatNon()
            }
            21 -> {
                cards = viewModel.getSifatI()
            }
            22 -> {
                cards = viewModel.getSifatII()
            }
            23 -> {
                cards = viewModel.getSTanya()
            }
            24 -> {
                cards = viewModel.getKeluarga()
            }
            25 -> {
                cards = viewModel.getKetWaktu()
            }
            26 -> {
                cards = viewModel.getKota()
            }
            27 -> {
                cards = viewModel.getMakanMinum()
            }
            28 -> {
                cards = viewModel.getManusia()
            }
            29 -> {
                cards = viewModel.getMusim()
            }
            30 -> {
                cards = viewModel.getPakaian()
            }
            31 -> {
                cards = viewModel.getPeralatanMakan()
            }
            32 -> {
                cards = viewModel.getPeralatanRumah()
            }
            33 -> {
                cards = viewModel.getRumahBagian()
            }
            34 -> {
                cards = viewModel.getSatuan()
            }
            35 -> {
                cards = viewModel.getSekolah()
            }
            36 -> {
                cards = viewModel.getSTanggalHari()
            }
            37 -> {
                cards = viewModel.getTransportasi()
            }
            38 -> {
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