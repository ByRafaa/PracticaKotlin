package com.trimestre2.bottomnavigation.ui.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.controladores.GenresAdapter
import com.trimestre2.bottomnavigation.ui.controladores.SubgenresAdapter
import com.trimestre2.bottomnavigation.ui.modelos.Artists
import com.trimestre2.bottomnavigation.ui.modelos.Music
import com.trimestre2.bottomnavigation.ui.modelos.Subgenres

class SubgenresRecycler : AppCompatActivity() {

    var subgenres: List<Subgenres> = listOf(

            Subgenres("House", "https://i.ytimg.com/vi/yzAml2XeMYM/hqdefault.jpg", "Electronic"),
            Subgenres("Dubstep", "https://allmusicspain.com/wp-content/uploads/2018/05/Skrillex-18.jpg", "Electronic"),
            Subgenres("Drum And Bass", "https://www.blacksunempire.com/image/cache/data/Patches/patches-dnb-1300x1300.jpg", "Electronic"),
            Subgenres("Techno", "https://media.resources.festicket.com/image/412x460/smart/filters:quality(70)/www/photos/Techno.png", "Electronic"),
            Subgenres("Eurobeat", "https://i1.sndcdn.com/artworks-000141940270-c7odhc-t500x500.jpg", "Eletronic"),
            Subgenres("Chiptune", "https://hipertextual.com/files/2010/07/chiptunes.jpg?width=1200&enable=upscale", "Electronic"),

            Subgenres("Blues Rock", "https://i.ytimg.com/vi/Qk3wkVw8FME/hqdefault.jpg", "Rock"),
            Subgenres("Punk Rock", "https://image.freepik.com/vector-gratis/craneo-estrella-punk-rock-vintage_225004-193.jpg", "Rock"),
            Subgenres("Progressive Rock", "https://i.pinimg.com/originals/91/fa/d2/91fad2672c93e7e574bcadd1c6047f7c.jpg", "Rock"),

            Subgenres("Death Metal", "https://metal-addiction.cl/wp-content/uploads/2020/07/Sin-t%C3%ADtulo-1-4.jpg", "Metal"),
            Subgenres("Heavy Metal", "https://elordenmundial.com/wp-content/uploads/2019/11/10675861575_e3257f7ace_k-1310x873.jpg", "Metal"),
            Subgenres("Alternative Metal", "https://www.cantaokey.com/wp-content/uploads/2018/07/Metal-Alternativo.jpg", "Metal"),

            Subgenres("Afropop", "https://img.redbull.com/images/c_crop,x_0,y_0,h_2000,w_3000/c_fill,w_1500,h_1000/q_auto,f_auto/redbullcom/2018/09/04/04ab1687-a3ac-4965-aa38-75ffd9003974/afropop-artistas", "Pop"),
            Subgenres("K-Pop", "https://album.mediaset.es/eimg/2020/07/02/fZQG0JBLr6OSsjU4aylaK2.jpg?w=480", "Pop"),
            Subgenres("Teen Pop", "https://static2.elcorreo.com/www/multimedia/202007/23/media/cortadas/one-direction-decimo-aniversario-kECB-U110882386747nVC-1248x770@El%20Correo.jpg", "Pop"),

            Subgenres("Movie Soundtracks", "https://m.media-amazon.com/images/I/81VTd97ynRL._SS500_.jpg", "SoundTracks"),
            Subgenres("Game Soundtracks", "https://www.michigandaily.com/sites/default/files/leg/imagecache/fullnode/video%20game%20illustration.jpeg", "SoundTracks"),

            Subgenres("Rap", "https://lifestyle.americaeconomia.com/sites/lifestyle.americaeconomia.com/files/styles/gallery_image/public/42893834_174188340202496_1126824845868894286_n.jpg?itok=HJJbCYih", "Hip-Hop"),
            Subgenres("Beatbox", "https://yt3.ggpht.com/ytc/AAUvwnigPede5t7nF8soq9jslo-fCjh6zZOXeSKKUgThLg=s900-c-k-c0x00ffffff-no-rj", "Hip-Hop"),
            Subgenres("Freestyle", "https://static.wikia.nocookie.net/rap/images/a/aa/Fmses.png/revision/latest?cb=20201109044303&path-prefix=es", "Hip-Hop")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclers)

        var bundle: Bundle = intent.extras!!
        var genero = bundle.getString("genero")!!

        var niceSubgenres: ArrayList<Subgenres> = seleccionarSubgeneros(genero)

        var recyclerView = findViewById<RecyclerView>(R.id.subRecycler)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = SubgenresAdapter(niceSubgenres)
        recyclerView.adapter = adapter


    }

    private fun seleccionarSubgeneros(genero: String): ArrayList<Subgenres> {



        var lista = ArrayList<Subgenres>()

        for (item in subgenres) {

            if (item.id.equals(genero)) {

                lista.add(item)
            }

        }

        return lista
    }
}