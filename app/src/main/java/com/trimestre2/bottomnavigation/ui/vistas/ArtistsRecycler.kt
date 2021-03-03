package com.trimestre2.bottomnavigation.ui.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.controladores.ArtistsAdapter
import com.trimestre2.bottomnavigation.ui.controladores.SubgenresAdapter
import com.trimestre2.bottomnavigation.ui.modelos.Artists
import com.trimestre2.bottomnavigation.ui.modelos.Subgenres

class ArtistsRecycler : AppCompatActivity() {

    var artists: List<Artists> = listOf(

            Artists("Future House", "https://i1.sndcdn.com/avatars-000457984449-k3nw12-t500x500.jpg", "House"),
            Artists("Deep House", "https://i.ytimg.com/vi/9h9ynLGl8_4/maxresdefault.jpg", "House"),
            Artists("Trap", "https://i.ytimg.com/vi/KOgvA98FifU/maxresdefault.jpg", "House"),
            Artists("Melbourne", "https://yt3.ggpht.com/ytc/AAUvwngqkNpBDq7yuv8Ork_9LoZoiGjYU1-m2ga_AxBiFA=s900-c-k-c0x00ffffff-no-rj", "House"),

            Artists("Skrillex", "https://www.clubbingspain.com/imagenes/Skrillex-2018.jpg", "Dubstep"),
            Artists("Eptic", "https://s3.amazonaws.com/bit-photos/large/8674929.jpeg", "Dubstep"),
            Artists("Virtual Riot", "https://edmli.com/wp-content/uploads/2019/12/Virtual-Riot-Blog-Banner_dc63af5c-66d1-4ad8-8a24-59c810b2b8cf.jpg", "Dubstep"),
            Artists("Savant", "http://www.eargasmweb.com/wp-content/uploads/2015/03/SavantPromo-620x410.jpg", "Dubstep"),

            Artists("Fox Stevenson", "https://pbs.twimg.com/profile_images/1083054888400113667/1E4qcDxB.jpg", "Drum And Bass"),
            Artists("Stonebank", "https://pbs.twimg.com/profile_images/862100973430460417/Mul-gI4Y.jpg", "Drum And Bass"),
            Artists("Pendulum", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Pendulum_simbolo.png/220px-Pendulum_simbolo.png", "Drum And Bass"),

            Artists("Hi-Lo", "https://pbs.twimg.com/profile_images/738696504395849728/0XPMjnhi.jpg", "Techno"),
            Artists("Fatima Hajji", "http://media.tilllate.es/eventpictures_bigpicture/2015/02/28/150228_barcelona_gloobal/00000000/juanito_001.jpg", "Techno"),
            Artists("Infected Mushrooms", "https://agenciaajn.com/new/wp-content/uploads/2019/01/Infected-Mushroom.jpg", "Techno"),

            Artists("Leo River", "https://img.discogs.com/e1jcOIUhZsK5gZsCHkBjekONyKw=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/A-1247926-1482032539-7530.png.jpg", "Eurobeat"),
            Artists("Dave Rodgers", "https://img.discogs.com/48HsYJuv0d6fQBzgff6iIvVnlRs=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/A-161889-1539137759-3033.jpeg.jpg", "Eurobeat"),
            Artists("Nuage", "https://img.discogs.com/87z32OkMcmaIc6iIjIDU4yeHtqY=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/A-220519-1458927659-8213.jpeg.jpg", "Eurobeat"),

            Artists("Eric Clapton", "https://loff.it/wp-content/uploads/2017/03/loffit-eric-clapton-la-mano-lenta-de-dios-05-600x450-1522349975.jpeg", "Blues Rock"),
            Artists("The Police", "https://149353296.v2.pressablecdn.com/wp-content/uploads/2018/08/The-Police-1977-678x381.jpg", "Blues Rock"),
            Artists("Dire Straits", "https://garajedelrock.com/wp-content/uploads/2020/08/Dire-Straits1.jpg", "Blues Rock"),

            Artists("Green Day", "https://www.todorock.com/wp-content/uploads/2019/08/green-day-1200x900.jpg", "Punk Rock"),
            Artists("Dead Kennedys", "https://media.gettyimages.com/photos/dead-kennedys-circa-1983-in-new-york-city-picture-id1046104826?s=612x612", "Punk Rock"),
            Artists("The Damned", "https://www.mondosonoro.com/wp-content/uploads/2016/04/damnedweb.jpg", "Punk Rock"),

            Artists("Pink Floyd", "https://upload.wikimedia.org/wikipedia/commons/4/4d/Pink_Floyd%2C_1971.jpg", "Progressive Rock"),
            Artists("Gentle Giant", "https://img.discogs.com/F-KeRyiOew74Zrv5iNFwB64Q2WQ=/435x622/smart/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/A-240248-1436879805-6635.jpeg.jpg", "Progressive Rock"),
            Artists("The Beatles", "http://1.bp.blogspot.com/-G_3bq3xUexc/VRFL5Pj7xOI/AAAAAAAAADA/WlTnNViEFIM/s1600/the-beatles-0.jpg", "Progressive Rock"),

            Artists("Slipknot", "https://indiehoy.com/wp-content/uploads/2020/09/slipknot.jpg", "Death Metal"),
            Artists("Gatecreeper", "https://www.decibelmagazine.com/wp-content/uploads/2019/09/dBNews_2019-09-24_Gatecreeper.jpg", "Death Metal"),
            Artists("Cannibal Corpse", "https://www.nacionrock.com/wp-content/uploads/cc-social-card.jpg", "Death Metal"),

            Artists("Metallica", "http://www.nolifetilmetal.com/images/metallica_logo_BIG1.jpg", "Heavy Metal"),
            Artists("Led Zeppelin", "https://arc-anglerfish-arc2-prod-copesa.s3.amazonaws.com/public/RSSFYJWTZJCIPOF4ZS3JC77YRQ.jpg", "Heavy Metal"),
            Artists("AC/DC", "https://www.ecestaticos.com/imagestatic/clipping/01a/029/01a029d8f8b9fe8a3988dc6bc1fa6d4b/la-ultima-bala-de-angus-young-lo-nuevo-de-ac-dc-es-un-discazo-que-ya-nadie-esperaba.jpg?mtime=1605267410", "Heavy Metal"),

            Artists("Avenged Sevenfold", "https://upload.wikimedia.org/wikipedia/commons/c/ca/Avenged_Sevenfold_2.jpg", "Alternative Metal"),
            Artists("Five Finger Death Punch", "https://static.billboard.com/files/media/five-finger-death-punch-2019-cr-Stephen-Jensen-billboard-1548-compressed.jpg", "Alternative Metal"),
            Artists("Stone Sour", "https://www.eyescreamproductions.com/allaccess/wp-content/uploads/2019/11/stone-sour.jpg", "Alternative Metal"),

            Artists("Vampire Weekend", "https://media.gq.com/photos/5cd1f370b41d093470cd743d/16:9/w_2560%2Cc_limit/Vampire-Weekend-Column-GQ-2019-050719.jpg", "Afropop"),
            Artists("Joy Denalane", "https://direct.rhapsody.com/imageserver/images/Art.14926058/356x237.jpg", "Afropop"),
            Artists("Fool's Gold", "https://img.discogs.com/NcPfnI0DoRmMI2NrsvCSd3lVuFI=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/A-726041-1274115278.jpeg.jpg", "Afropop"),

            Artists("Blackpink", "https://los40es00.epimg.net/los40/imagenes/2019/07/12/bigbang/1562940119_662762_1562940425_noticia_normal.jpg", "K-Pop"),
            Artists("EXO", "https://upload.wikimedia.org/wikipedia/commons/9/91/Exo_monster_160618_suwon.png", "K-Pop"),
            Artists("Seventeen", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/180716_Seveteen_performing_%22Oh_My%21%22_at_You_Make_My_Day_Showcase.png/1200px-180716_Seveteen_performing_%22Oh_My%21%22_at_You_Make_My_Day_Showcase.png", "K-Pop"),

            Artists("Ariana Grande", "https://as01.epimg.net/mexico/imagenes/2019/02/08/tikitakas/1549582999_815785_1549583637_noticia_normal_recorte1.jpg", "Teen Pop"),
            Artists("Justin Bieber", "https://upload.wikimedia.org/wikipedia/commons/d/da/Justin_Bieber_in_2015.jpg", "Teen Pop"),
            Artists("One Direction", "https://images.chicmagazine.com.mx/gtHtUTkAArhct7_YelvEYz0lWFc=/958x596/uploads/media/2020/07/23/one-direction-foto-cortesia_46_0_866_539.jpg", "Teen Pop"),

            Artists("Hollow Knight", "https://images-na.ssl-images-amazon.com/images/I/71OQ1v5lHzL._SL1500_.jpg", "Game Soundtracks"),
            Artists("NieR Automata", "https://i1.sndcdn.com/artworks-000216388822-f8o8dn-t500x500.jpg", "Game Soundtracks"),
            Artists("Final Fantasy XV", "https://m.media-amazon.com/images/I/815jeOV+qRL._SS500_.jpg", "Game Soundtracks"),

            Artists("Prok", "https://ayaxyprok.com/77-tm_thickbox_default/prok-rojo-y-negro-cd.jpg", "Rap"),
            Artists("Eminem", "https://images-na.ssl-images-amazon.com/images/I/61tQIiY0zSL._SY355_.jpg", "Rap"),
            Artists("Elane", "https://mp3.hhgroups.com/albumes/Elane-Son-de-esas-53685_front.jpg", "Rap"),

            Artists("Final Internacional 2019", "https://los40es00.epimg.net/los40/imagenes/2019/10/02/musica/1570023436_278905_1570025010_noticia_normal.jpg", "Freestyle"),
            Artists("Leyendas del Free", "https://i.ytimg.com/vi/TfBCV146dpo/maxresdefault_live.jpg", "Freestyle"),
            Artists("Quinto Escalón", "https://upload.wikimedia.org/wikipedia/commons/1/1d/LOGO_5to.jpg", "Freestyle")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artists_recycler)

        var bundle: Bundle = intent.extras!!
        var subgenero = bundle.getString("subgenero")!!

        var niceArtists: ArrayList<Artists> = seleccionarArtistas(subgenero)

        var recyclerView = findViewById<RecyclerView>(R.id.artistsRecycler)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ArtistsAdapter(niceArtists)
        recyclerView.adapter = adapter

    }

    private fun seleccionarArtistas(genero: String): ArrayList<Artists> {

        var lista = ArrayList<Artists>()

        for (item in artists) {

            if (item.id.equals(genero)) {

                lista.add(item)
            }

        }

        return lista
    }

    }