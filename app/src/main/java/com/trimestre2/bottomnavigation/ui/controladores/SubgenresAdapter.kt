package com.trimestre2.bottomnavigation.ui.controladores

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.modelos.Subgenres
import com.trimestre2.bottomnavigation.ui.vistas.ArtistsRecycler
import com.trimestre2.bottomnavigation.ui.vistas.MusicRecycler
import com.trimestre2.bottomnavigation.ui.vistas.SubgenresRecycler
import kotlinx.android.synthetic.main.item_subgeneros.view.*

class SubgenresAdapter(val subgenre:List<Subgenres>):RecyclerView.Adapter<SubgenresAdapter.SubgenreHolder>() {



    class SubgenreHolder(val view: View):RecyclerView.ViewHolder(view){

        fun render(subgenre: Subgenres) {

            view.SubgenreName.text = subgenre.nombre

            view.subgenreId.text = subgenre.id

            Picasso.get().load(subgenre.foto).into(view.ivSubgenre)

            view.setOnClickListener {

                if (subgenre.nombre.equals("Chiptune") || subgenre.nombre.equals("Beatbox") || subgenre.nombre.equals("Movie Soundtracks")){

                    var intent = Intent(view.context, MusicRecycler::class.java)
                    intent.putExtra("artista",subgenre.nombre)
                    view.context.startActivity(intent)

                } else {

                    var intent = Intent(view.context, ArtistsRecycler::class.java).apply {

                        putExtra("subgenero", subgenre.nombre)

                    }

                    view.context.startActivity(intent)

                }
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubgenreHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SubgenreHolder(layoutInflater.inflate(R.layout.item_subgeneros,parent,false))
    }

    override fun onBindViewHolder(holder: SubgenreHolder, position: Int) {
        holder.render(subgenre[position])
    }

    override fun getItemCount(): Int {
        return subgenre.size
    }

}