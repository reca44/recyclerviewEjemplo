package com.murallaromana.proyectorecyclesview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallaromana.proyectorecyclesview.R
import com.murallaromana.proyectorecyclesview.model.entities.Personaje
import com.squareup.picasso.Picasso

class ListaPersonajesAdapter(val personajes: List<Personaje>):RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {
    class PersonajesViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val tvNombre=itemView.findViewById<TextView>(R.id.tvNombre)
        val tvApellidos=itemView.findViewById<TextView>(R.id.tvApellidos)
        val tvTitulo=itemView.findViewById<TextView>(R.id.tvTitulo)
        val ivFoto=itemView.findViewById<ImageView>(R.id.ivFoto)
        val tvFamilia=itemView.findViewById<TextView>(R.id.tvFamilia)
        val tvUrl=itemView.findViewById<TextView>(R.id.tvUrl)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val LayoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.item_personaje,parent,false)

        return PersonajesViewHolder(LayoutInflater)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)
        holder.tvNombre.setText(personaje.nombre)
        holder.tvApellidos.setText(personaje.apellidos)
        holder.tvTitulo.setText(personaje.titulo)
        holder.tvFamilia.setText(personaje.familia)
        holder.tvUrl.setText(personaje.url)

        Picasso.get().load("www.crushpixel.com/es/stock-vector/autism-spectrum-disorder-concept-icon-3826333.html").into(holder.ivFoto)
    }

    override fun getItemCount(): Int {
       return personajes.size
    }
}