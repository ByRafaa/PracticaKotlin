package com.trimestre2.bottomnavigation.ui.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.controladores.FavsAdapter
import com.trimestre2.bottomnavigation.ui.controladores.GenresAdapter
import com.trimestre2.bottomnavigation.ui.controladores.MusicAdapter
import com.trimestre2.bottomnavigation.ui.modelos.Music
import com.trimestre2.bottomnavigation.ui.profile.ProfileFragment

class FavsFragment : Fragment() {

    private lateinit var favsViewModel: FavsViewModel

    public var lista = ArrayList<Music>()

    var view = ProfileFragment()

    var database = FirebaseDatabase.getInstance().reference

    var currentUser = FirebaseAuth.getInstance().currentUser

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favsViewModel =
                ViewModelProvider(this).get(FavsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_favs, container, false)

        var evento = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                lista.clear()

                for(xMusic in snapshot.children) {

                    var cancion = xMusic.getValue(Music::class.java)

                    lista.add(cancion!!)

                    var recyclerView = root.findViewById<RecyclerView>(R.id.favsRecycler)
                    recyclerView.layoutManager = LinearLayoutManager(context)
                    val adapter = FavsAdapter(lista)
                    recyclerView.adapter = adapter

                    view.cantidad(lista.size)

                }

            }

            override fun onCancelled(error: DatabaseError) {

            }
        }

        database.child("users").child(currentUser!!.uid).child("canciones").addValueEventListener(evento)

        return root
    }
}