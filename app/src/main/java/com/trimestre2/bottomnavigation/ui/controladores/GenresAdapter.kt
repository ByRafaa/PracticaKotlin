package com.trimestre2.bottomnavigation.ui.controladores

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.modelos.Genres
import com.trimestre2.bottomnavigation.ui.vistas.SubgenresRecycler
import kotlinx.android.synthetic.main.item_generos.view.*

class GenresAdapter(val genre:List<Genres>):RecyclerView.Adapter<GenresAdapter.GenreHolder>() {



    class GenreHolder(val view: View):RecyclerView.ViewHolder(view){

        fun render(genre : Genres) {

            view.genreName.text = genre.nombre

            Picasso.get().load(genre.foto).into(view.ivGenre)

            view.setOnClickListener {

                var intent = Intent(view.context, SubgenresRecycler::class.java).apply {

                    putExtra("genero", genre.nombre)

                }

                view.context.startActivity(intent)

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return GenreHolder(layoutInflater.inflate(R.layout.item_generos,parent,false))
    }

    override fun onBindViewHolder(holder: GenreHolder, position: Int) {
        holder.render(genre[position])
    }

    override fun getItemCount(): Int {
        return genre.size
    }

}