package com.example.heroapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPahlawan(private val listPahlawan: List<Pahlawan>):
        RecyclerView.Adapter<AdapterPahlawan.ViewHolderPahlawan>(){

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): AdapterPahlawan.ViewHolderPahlawan {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pahlawan,parent,false)
        return ViewHolderPahlawan(itemView) }

    override fun onBindViewHolder(holder: ViewHolderPahlawan, position: Int) {
        val currentItem = listPahlawan[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.textView.text = currentItem.name
        holder.birth.text = currentItem.dateOfBirth
        holder.death.text = currentItem.dateOfDeath
    }

    override fun getItemCount(): Int {
        return listPahlawan.size
    }

    class ViewHolderPahlawan(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textViewName)
        val birth: TextView = itemView.findViewById(R.id.textViewDateOfBirth)
        val death: TextView = itemView.findViewById(R.id.textViewDateOfDeath)
    }
        }