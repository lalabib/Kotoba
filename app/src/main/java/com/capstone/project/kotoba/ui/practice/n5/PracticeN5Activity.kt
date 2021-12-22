package com.capstone.project.kotoba.ui.practice.n5

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.view.animation.AlphaAnimation
import androidx.lifecycle.ViewModelProvider
import com.capstone.project.kotoba.R
import com.capstone.project.kotoba.data.n5.N5
import com.capstone.project.kotoba.databinding.ActivityPracticeN5Binding
import java.util.*

class PracticeN5Activity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityPracticeN5Binding
    private var cards: MutableList<N5> = mutableListOf()
    private var uuid: Int = 0
    private var cardNumber: Int = 0

    private var title = ""
    private var tts: TextToSpeech? = null
    private val tag = "TTS"

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts!!.setLanguage(Locale.JAPAN)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e(tag, R.string.warning.toString())
            } else {
                binding.speakIcon.isEnabled = true
            }
        } else {
            Log.e(tag, R.string.error.toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPracticeN5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        uuid = intent.getIntExtra("uuid",0)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[PracticeN5ViewModel::class.java]

        when (uuid){
            0 -> {
                cards = viewModel.getAlam()
                title = "Alam"
            }
            1 -> {
                cards = viewModel.getAlatTulis()
                title = "Alat Tulis"
            }
            2 -> {
                cards = viewModel.getAngka()
                title = "Angka"
            }
            3 -> {
                cards = viewModel.getArah()
                title = "Arah"
            }
            4 -> {
                cards = viewModel.getBangunan()
                title = "Bangunan & Bagiannya"
            }
            5 -> {
                cards = viewModel.getBenda()
                title = "Benda"
            }
            6 -> {
                cards = viewModel.getBinatang()
                title = "Binatang"
            }
            7 -> {
                cards = viewModel.getBumbu()
                title = "Bumbu Dapur"
            }
            8 -> {
                cards = viewModel.getHari()
                title = "Hari"
            }
            9 -> {
                cards = viewModel.getHobi()
                title = "Hobi"
            }
            10 -> {
                cards = viewModel.getJabatan()
                title = "Jabatan & Pekerjaan"
            }
            11 -> {
                cards = viewModel.getGanti()
                title = "Kata Ganti Orang"
            }
            12 -> {
                cards = viewModel.getKerjaI()
                title = "Kata Kerja Golongan-1"
            }
            13 -> {
                cards = viewModel.getKerjaII()
                title = "Kata Kerja Golongan-2"
            }
            14 -> {
                cards = viewModel.getKerjaIII()
                title = "Kata Kerja Golongan-3"
            }
            15 -> {
                cards = viewModel.getKerjaIV()
                title = "Kata Kerja Golongan-4"
            }
            16 -> {
                cards = viewModel.getKerjaV()
                title = "Kata Kerja Golongan-5"
            }
            17 -> {
                cards = viewModel.getKerjaVI()
                title = "Kata Kerja Golongan-6"
            }
            18 -> {
                cards = viewModel.getKeterangan()
                title = "Kata Keterangan"
            }
            19 -> {
                cards = viewModel.getPenunjuk()
                title = "Kata Penunjuk"
            }
            20 -> {
                cards = viewModel.getSambung()
                title = "Kata Sambung"
            }
            21 -> {
                cards = viewModel.getSifatNon()
                title = "Kata Sifat Non-1"
            }
            22 -> {
                cards = viewModel.getSifatI()
                title = "Kata Sifat-1"
            }
            23 -> {
                cards = viewModel.getSifatII()
                title = "Kata Sifat-2"
            }
            24 -> {
                cards = viewModel.getSTanya()
                title = "Kata Tanya"
            }
            25 -> {
                cards = viewModel.getKeluarga()
                title = "Keluarga"
            }
            26 -> {
                cards = viewModel.getKetWaktu()
                title = "Keterangan Waktu"
            }
            27 -> {
                cards = viewModel.getKota()
                title = "Kota"
            }
            28 -> {
                cards = viewModel.getMakanMinum()
                title = "Makanan & Minuman"
            }
            29 -> {
                cards = viewModel.getManusia()
                title = "Manusia & Bagian Tubuh"
            }
            30 -> {
                cards = viewModel.getMusim()
                title = "Musim"
            }
            31 -> {
                cards = viewModel.getPakaian()
                title = "Kata Pakaian"
            }
            32 -> {
                cards = viewModel.getPeralatanMakan()
                title = "Peralatan Makan"
            }
            33 -> {
                cards = viewModel.getPeralatanRumah()
                title = "Peralatan Rumah Tangga"
            }
            34 -> {
                cards = viewModel.getRumahBagian()
                title = "Rumah & Bagiannya"
            }
            35 -> {
                cards = viewModel.getSatuan()
                title = "Satuan"
            }
            36 -> {
                cards = viewModel.getSekolah()
                title = "Sekolah & Pelajaran"
            }
            37 -> {
                cards = viewModel.getSTanggalHari()
                title = "Tanggal & Jumlah Hari"
            }
            38 -> {
                cards = viewModel.getTransportasi()
                title = "Transportasi"
            }
            39 -> {
                cards = viewModel.getWarna()
                title = "Warna"
            }
        }

        supportActionBar?.title = title
        showAnswerLittleByLittle()

        binding.meaning.setOnClickListener{
            it.clearAnimation()
            it.alpha = 1f
            binding.romaji.clearAnimation()
            binding.romaji.alpha = 1f
            binding.speakIcon.clearAnimation()
            binding.speakIcon.alpha = 1f
            redrawFadeScrollbar()
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

        binding.speakIcon.isEnabled = false
        tts = TextToSpeech(this, this)

        binding.speakIcon.setOnClickListener { speakOut() }
    }

    private fun speakOut() {
        val message = binding.romaji.text.toString()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
        } else {
            @Suppress("DEPRECATION")
            tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null)
        }
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
        alphaAnimation.startOffset = 5000
        alphaAnimation.duration = 1000
        binding.meaning.startAnimation(alphaAnimation)
        binding.romaji.startAnimation(alphaAnimation)
        binding.speakIcon.startAnimation(alphaAnimation)
    }

    override fun onDestroy() {
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }

        super.onDestroy()
    }
}