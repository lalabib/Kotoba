package com.capstone.project.kotoba.ui.kategori.n4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.capstone.project.kotoba.data.n4.KategoriN4
import com.capstone.project.kotoba.databinding.ListKategoriBinding

class KategoriN4Adapter : RecyclerView.Adapter<KategoriN4Adapter.KategoriN4ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    private val listKategori = ArrayList<KategoriN4>()

    fun setKategori(kategori: List<KategoriN4>?) {
        if (kategori == null)  return
        this.listKategori.clear()
        this.listKategori.addAll(kategori)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriN4ViewHolder {
        return KategoriN4ViewHolder(ListKategoriBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: KategoriN4ViewHolder, position: Int) {
        val kategori = listKategori[position]
        holder.bind(kategori)
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(kategori)
        }
    }

    override fun getItemCount(): Int = listKategori.size

    class KategoriN4ViewHolder(private val binding: ListKategoriBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(kategori: KategoriN4) {
            binding.tvKategori.text = kategori.kategori
            Glide.with(itemView.context)
                .load(kategori.gambar)
                .apply(RequestOptions())
                .into(binding.ivKategori)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: KategoriN4)
    }
}