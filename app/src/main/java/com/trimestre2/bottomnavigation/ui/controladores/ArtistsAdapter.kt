package com.trimestre2.bottomnavigation.ui.controladores

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.modelos.Artists
import com.trimestre2.bottomnavigation.ui.modelos.Subgenres
import com.trimestre2.bottomnavigation.ui.vistas.ArtistsRecycler
import com.trimestre2.bottomnavigation.ui.vistas.MusicRecycler
import com.trimestre2.bottomnavigation.ui.vistas.SubgenresRecycler
import kotlinx.android.synthetic.main.item_artistas.view.*
import kotlinx.android.synthetic.main.item_subgeneros.view.*

class ArtistsAdapter(val artist:List<Artists>):RecyclerView.Adapter<ArtistsAdapter.ArtistHolder>() {



    class ArtistHolder(val view: View):RecyclerView.ViewHolder(view){

        fun render(artist: Artists) {

            view.ArtistName.text = artist.nombre

            view.ArtistId.text = artist.id

            Picasso.get().load(artist.foto).into(view.ivArtist)

            view.setOnClickListener {

                var intent = Intent(view.context, MusicRecycler::class.java)
                intent.putExtra("artista",artist.nombre)
                view.context.startActivity(intent)

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ArtistHolder(layoutInflater.inflate(R.layout.item_artistas,parent,false))
    }

    override fun onBindViewHolder(holder: ArtistHolder, position: Int) {
        holder.render(artist[position])
    }

    override fun getItemCount(): Int {
        return artist.size
    }

}