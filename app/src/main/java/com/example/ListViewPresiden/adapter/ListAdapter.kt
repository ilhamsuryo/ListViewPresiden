package com.example.listviewpreside.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewpresiden_.R
import com.example.listviewpresiden_.model.DataPresiden.listPresiden
import com.example.listviewpresiden_.model.Presiden

class ListPresidenAdapter (private val ListPresiden: Context, private val presiden : ArrayList<Presiden>, private val listener: (Presiden) -> Unit)
    : RecyclerView.Adapter<ListPresidenAdapter.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(LayoutInflater.from(ListPresiden).inflate(R.layout.list_presiden, parent, false))
    }

    override fun getItemCount(): Int {
        return listPresiden.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPresiden(presiden[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var Namas: TextView = view.findViewById(R.id.nama)
        var Deskripsis: TextView = view.findViewById(R.id.deskripsi)
        var Fotos: ImageView = view.findViewById(R.id.foto)

        fun bindPresiden(presiden: Presiden, listener: (Presiden) -> Unit){
            Namas.text = presiden.nama1
            Glide.with(itemView.context)
                .load(presiden.foto1)
                .into(Fotos)

            itemView.setOnClickListener{
                listener(presiden)
            }
        }
    }
}

