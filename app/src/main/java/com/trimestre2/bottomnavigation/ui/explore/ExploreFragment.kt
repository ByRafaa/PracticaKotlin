package com.trimestre2.bottomnavigation.ui.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trimestre2.bottomnavigation.MainActivity
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.controladores.GenresAdapter
import com.trimestre2.bottomnavigation.ui.modelos.Artists
import com.trimestre2.bottomnavigation.ui.modelos.Genres
import com.trimestre2.bottomnavigation.ui.modelos.Music
import com.trimestre2.bottomnavigation.ui.modelos.Subgenres
import kotlinx.android.synthetic.main.fragment_explore.*

class ExploreFragment : Fragment() {

    var genres : List<Genres> = listOf(

        Genres("Electronic","https://i.ytimg.com/vi/pBixRXM6nV4/maxresdefault.jpg"),
        Genres("Rock","https://elmontonero.pe/upload/uploads_images/editorial_cultura_80.jpg"),
        Genres("Metal","https://i.ytimg.com/vi/R5-8JpdRQdk/maxresdefault.jpg"),
        Genres("Pop","https://www.thetimes.co.uk/imageserver/image/%2Fmethode%2Ftimes%2Fprod%2Fweb%2Fbin%2Fd12b3eb0-10ec-11e8-aa39-e7299ff3a5e8.jpg?crop=3000%2C1687%2C0%2C156&resize=1180"),
        Genres("SoundTracks","https://image.shutterstock.com/image-vector/online-cinema-art-movie-watching-260nw-586719869.jpg"),
        Genres("Hip-Hop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyed1XxGz7VWU_ECB-bW0SYFbSnE2Wefzhqw&usqp=CAU")
    )

    private lateinit var exploreViewModel: ExploreViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        exploreViewModel =
                ViewModelProvider(this).get(ExploreViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_explore, container, false)

        var recyclerView = root.findViewById<RecyclerView>(R.id.rvGenres)

        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = GenresAdapter(genres)
        recyclerView.adapter = adapter


        return root
    }

}