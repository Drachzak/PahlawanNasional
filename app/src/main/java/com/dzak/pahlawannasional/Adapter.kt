package com.dzak.pahlawannasional

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class Adapter(val dataPahlawan : ArrayList<PahlawanItem>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nama = view.findViewById<TextView>(R.id.item_nama)
        val gambar = view.findViewById<ImageView>(R.id.img_pahlawan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pahlawan_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataPahlawan[position]

        holder.nama.text = data.nama
        holder.gambar.load(data.img)
    }

    override fun getItemCount() = dataPahlawan.size

}