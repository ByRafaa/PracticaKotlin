package com.trimestre2.bottomnavigation.ui.controladores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.squareup.picasso.Picasso
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.modelos.Music
import kotlinx.android.synthetic.main.item_generos.view.*
import kotlinx.android.synthetic.main.item_musica.view.*
import java.util.*

class MusicAdapter(val music:List<Music>):RecyclerView.Adapter<MusicAdapter.MusicHolder>() {




    class MusicHolder(val view: View):RecyclerView.ViewHolder(view){

        var currentUser = FirebaseAuth.getInstance().currentUser

        public var database = FirebaseDatabase.getInstance().reference

        fun render(music : Music) {

            view.MusicName.text = music.nombre

            view.MusicGenre.text = music.genero

            view.MusicId.text = music.grupo

            Picasso.get().load(music.foto).into(view.ivMusic)


            view.setOnClickListener {

                database.child("users").child(currentUser!!.uid).child("canciones").child(music.nombre).setValue(music)

                Toast.makeText(view.context,"Canción añadida a favoritas.",Toast.LENGTH_LONG).show()

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MusicHolder(layoutInflater.inflate(R.layout.item_musica,parent,false))
    }

    override fun onBindViewHolder(holder: MusicHolder, position: Int) {
        holder.render(music[position])
    }

    override fun getItemCount(): Int {
        return music.size
    }

}