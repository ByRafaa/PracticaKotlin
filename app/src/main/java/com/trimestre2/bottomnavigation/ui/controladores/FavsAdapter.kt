package com.trimestre2.bottomnavigation.ui.controladores

import kotlinx.android.synthetic.main.item_favs.view.*
import kotlinx.android.synthetic.main.item_musica.view.MusicGenre
import kotlinx.android.synthetic.main.item_musica.view.MusicName
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.squareup.picasso.Picasso
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.favorites.FavsFragment
import com.trimestre2.bottomnavigation.ui.modelos.Music

class FavsAdapter(val music:List<Music>):RecyclerView.Adapter<FavsAdapter.FavsHolder>() {

    class FavsHolder(val view: View):RecyclerView.ViewHolder(view){

        var database = FirebaseDatabase.getInstance().reference

        var currentUser = FirebaseAuth.getInstance().currentUser

        fun render(music : Music) {

            view.favsName.text = music.nombre

            view.favsGenre.text = music.genero

            view.favsId.text = music.grupo

            Picasso.get().load(music.foto).into(view.ivFavs)

            view.setOnClickListener {

                Toast.makeText(view.context,"Has seleccionado la canción " + music.nombre,Toast.LENGTH_LONG).show()

            }

            view.delete.setOnClickListener {

                var evento = object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {

                        for(xMusic in snapshot.children) {

                            var cancion = xMusic.getValue(Music::class.java)

                            if (cancion!!.nombre.equals(music.nombre)){

                                var vista = FavsFragment()

                                vista.lista.remove(cancion)

                                database.child("users").child(currentUser!!.uid).child("canciones").child(cancion.nombre).removeValue()


                            }



                        }

                    }

                    override fun onCancelled(error: DatabaseError) {

                    }
                }

                database.child("users").child(currentUser!!.uid).child("canciones").addValueEventListener(evento)


                Toast.makeText(view.context,"Se ha eliminado la canción de tu lista de favoritas",Toast.LENGTH_LONG).show()

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FavsHolder(layoutInflater.inflate(R.layout.item_favs,parent,false))
    }

    override fun onBindViewHolder(holder: FavsHolder, position: Int) {
        holder.render(music[position])
    }

    override fun getItemCount(): Int {
        return music.size
    }

}