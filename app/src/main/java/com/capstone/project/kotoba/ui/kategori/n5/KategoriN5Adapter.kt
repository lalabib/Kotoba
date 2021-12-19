package com.capstone.project.kotoba.ui.kategori.n5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.capstone.project.kotoba.data.n5.KategoriN5
import com.capstone.project.kotoba.databinding.ListKategoriBinding

class KategoriN5Adapter : RecyclerView.Adapter<KategoriN5Adapter.KategoriN5ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    private val listKategori = ArrayList<KategoriN5>()

    fun setKategori(kategori: List<KategoriN5>?) {
        if (kategori == null)  return
        this.listKategori.clear()
        this.listKategori.addAll(kategori)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriN5ViewHolder {
        return KategoriN5ViewHolder(ListKategoriBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: KategoriN5ViewHolder, position: Int) {
        val kategori = listKategori[position]
        holder.bind(kategori)
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(kategori)
        }
    }

    override fun getItemCount(): Int = listKategori.size

    class KategoriN5ViewHolder(private val binding: ListKategoriBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(kategori: KategoriN5) {
            binding.tvKategori.text = kategori.kategori
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: KategoriN5)
    }
}