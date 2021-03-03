package com.trimestre2.bottomnavigation.ui.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.controladores.MusicAdapter
import com.trimestre2.bottomnavigation.ui.modelos.Music

class MusicRecycler : AppCompatActivity() {

    var music: List<Music> = listOf(

        Music("Wombass", "Future House", "https://m.media-amazon.com/images/I/81HHjyPLF7L._SS500_.jpg", "Oliver Heldens & Tiesto"),
        Music("Homeless", "Future House", "https://spinninrecords.com/uploads/media/releases/0001/15/thumb_2e7150f2211ddaa3_releases_ogimage.jpeg", "Mr.Belt & Wezol"),
        Music("Future", "Future House", "https://sinocantoloquesiento.files.wordpress.com/2017/03/8fb3035fb033b41cda6a149978aff2c44655ef63.jpg", "Don Diablo"),

        Music("Teel Me Why", "Deep House", "https://i1.sndcdn.com/artworks-000312233388-o3iuuk-t500x500.jpg", "Robert Cristian"),
        Music("If I Wouldn't Know", "Deep House", "https://i.ytimg.com/vi/EiaSuC1dDDg/maxresdefault.jpg", "Pascal Junior"),
        Music("City Lights", "Deep House", "https://i1.sndcdn.com/artworks-000306320442-w6ra8j-t500x500.jpg", "Dani Corbalan"),

        Music("LOVE ME", "Trap", "https://i.pinimg.com/564x/3b/e0/3c/3be03c97be171dd6258fe39c03d15178.jpg", "Krysta Youngs"),
        Music("Eu Achei", "Trap", "https://i.ytimg.com/vi/OozDRYZhZBY/maxresdefault.jpg", "Juelz"),
        Music("King Is Back", "Trap", "https://m.media-amazon.com/images/I/91W4A-4bgNL._SS500_.jpg", "Fabian Mazur"),

        Music("Melbourne Bounce", "Melbourne", "https://img.discogs.com/ftYZ5tDzVtVHzvBNSXdV4T-CRKs=/fit-in/500x500/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-8115822-1455442454-5395.jpeg.jpg", "Big Nab"),
        Music("Ah Yeah!", "Melbourne", "https://static.qobuz.com/images/covers/12/61/0887158546112_600.jpg", "Will Sparks"),
        Music("Bleed", "Melbourne", "https://i.ytimg.com/vi/yRHvpYIJQMw/hqdefault.jpg", "Timmy Trumpet"),

        Music("Make It Bun Dem", "Dubstep", "https://img.discogs.com/Sj2vQSWSyisN5QT4HL7dHyKfOS0=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-3579665-1458495749-2378.jpeg.jpg", "Skrillex"),
        Music("Bangarang", "Dubstep", "https://img.discogs.com/gCrdvfz8LTmSOyfLwid2sURgkyQ=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5569247-1396802492-6346.jpeg.jpg", "Skrillex"),
        Music("First Of The Year", "Dubstep", "https://www.comolasgrecas.com/wp-content/uploads/2011/08/Skrillex-Scary-Monsters-and-Nice-Sprites.jpg", "Skrillex"),

        Music("Jurassic", "Dubstep", "https://direct.rhapsody.com/imageserver/images/alb.189060218/600x600.jpg", "Eptic"),
        Music("No Mercy", "Dubstep", "https://i1.sndcdn.com/artworks-000364317288-24zbzs-t500x500.jpg", "Eptic"),
        Music("Stop pretending", "Dubstep", "https://i1.sndcdn.com/artworks-NoAiXpPMp42APGet-2jhAGA-t500x500.jpg", "Eptic"),

        Music("Nasty", "Dubstep", "https://i1.sndcdn.com/artworks-000197455646-voyt6r-t500x500.jpg", "Virtual Riot"),
        Music("Pray For Riddim", "Dubstep", "https://i1.sndcdn.com/artworks-000295322001-convtj-t500x500.jpg", "Virtual Riot"),
        Music("Evil Gameboy", "Dubstep", "https://images.genius.com/d521550729277f5b5beca7ea4a02d7cb.1000x1000x1.jpg", "Virtual Riot"),

        Music("Monolith", "Dubstep", "https://m.media-amazon.com/images/I/71SeyL3qLHL._SS500_.jpg", "Savant"),
        Music("Melody Circus", "Dubstep", "https://i1.sndcdn.com/artworks-000046145764-bsf8ea-t500x500.jpg", "Savant"),
        Music("Pirate Bay", "Dubstep", "https://i1.sndcdn.com/artworks-000056172358-hqk8dt-t500x500.jpg", "Savant"),

        Music("Go Like D&B", "Drum And Bass", "https://m.media-amazon.com/images/I/A1+ETYm6gcL._SS500_.jpg", "Fox Stevenson"),
        Music("Like That", "Drum And Bass", "https://m.media-amazon.com/images/I/91m5UKVSCWL._SS500_.jpg", "Fox Stevenson"),
        Music("Bruises", "Drum And Bass", "https://m.media-amazon.com/images/I/81q4l+-WvDL._SS500_.jpg", "Fox Stevenson"),

        Music("Stronger", "Drum And Bass", "https://i1.sndcdn.com/artworks-000102376418-gujnv6-t500x500.jpg", "Stonebank"),
        Music("Be Alright", "Drum And Bass", "https://s.mxmcdn.net/images-storage/albums4/0/7/5/1/4/4/34441570_800_800.jpg", "Stonebank"),
        Music("The Pressure", "Drum And Bass", "https://i1.sndcdn.com/artworks-000118485011-p516r3-t500x500.jpg", "Stonebank"),

        Music("Witchcraft", "Drum And Bass", "https://images-na.ssl-images-amazon.com/images/I/61CnNdGa06L._SX300_SY300_QL70_ML2_.jpg", "Pendulum"),
        Music("Noting For Free", "Drum And Bass", "https://i1.sndcdn.com/artworks-000666072115-sp3gin-t500x500.jpg", "Pendulum"),
        Music("Watercolour", "Drum And Bass", "https://images-na.ssl-images-amazon.com/images/I/51Q1r7Q91yL._SX466_.jpg", "Pendulum"),

        Music("King Kong", "Techno", "https://spinninrecords.com/media/cache/release_thumbnail/uploads/media/releases/0001/07/thumb_f6e4ef772ea28520_releases_ogimage.jpeg", "Hi-Lo"),
        Music("The G_O_A_T_", "Techno", "https://e-cdns-images.dzcdn.net/images/cover/4e2a9f800c828a3cd99eec91adf2760d/500x500.jpg", "Hi-Lo"),
        Music("Impulse", "Techno", "https://geo-media.beatport.com/image_size/500x500/3c5bbc05-9c32-466f-9bb8-d215548e5201.jpg", "Hi-Lo"),

        Music("Violines", "Techno", "https://i.ytimg.com/vi/xdbvoxBojFg/hqdefault.jpg", "Fatima Hajji"),
        Music("Bowman", "Techno", "https://www.discjockeys.es/wp-content/uploads/2019/01/fatima-hajji.jpg", "Fatima Hajji"),
        Music("Melon Loco", "Techno", "https://m.media-amazon.com/images/I/61paaaJaIOL._SS500_.jpg", "Fatima Hajji"),

        Music("Bliss on Mushrooms", "Techno", "https://img.discogs.com/rpYnf6fxArbqc-HsBE7GktAyb-Q=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-12775339-1541707112-8427.jpeg.jpg", "Infected Mushrooms"),
        Music("Becoming Insane", "Techno", "https://i.ytimg.com/vi/WxhTbxMSvT0/hqdefault.jpg", "Infected Mushrooms"),
        Music("Guitarmass", "Techno", "https://img.discogs.com/AnzA7i-bAI2964e7qUevklFeg3A=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-12916705-1544466119-7701.jpeg.jpg", "Infected Mushrooms"),

        Music("Runaway", "Eurobeat", "https://i.ytimg.com/vi/w7ac4IHt6HY/maxresdefault.jpg", "Leo River"),
        Music("Speedy Runner", "Eurobeat", "https://i.ytimg.com/vi/v0UVm6nT-mc/maxresdefault.jpg", "Leo River"),
        Music("Perfect Hero", "Eurobeat", "https://i.ytimg.com/vi/3SjSwBvLhHk/maxresdefault.jpg", "Leo River"),

        Music("Boom Boom Japan", "Eurobeat", "https://m.media-amazon.com/images/I/51IXd7NrT8L.jpg", "Dave Rodgers"),
        Music("Beat Of The Rising Sun", "Eurobeat", "https://i.ebayimg.com/images/g/p0EAAOSwU-pXqy-Q/s-l300.jpg", "Dave Rodgers"),
        Music("Soul Gasoline", "Eurobeat", "https://www.themeraider.com/wp-content/uploads/2017/02/feat-feb-11-2.jpg", "Dave Rodgers"),

        Music("Crazy Little Love", "Eurobeat", "https://img.discogs.com/loYE9HMYVfRJSsBPaOlkTsm6FFI=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-16030420-1602184713-4753.jpeg.jpg", "Nuage"),
        Music("Help me", "Eurobeat", "https://img.discogs.com/9e3Zxrx49DPw7UydJR7Mo0ySxns=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-14377123-1573305693-9699.jpeg.jpg", "Nuage"),
        Music("I wanna fly", "Eurobeat", "https://img.discogs.com/moRCB4nZLyp1DS_VzPJZ6G2RRCo=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-16030894-1602191401-6670.jpeg.jpg", "Nuage"),

        Music("PONPONPON", "Chiptune", "https://i.ytimg.com/vi/2Eh1lGF8TI0/sddefault.jpg", "CRA"),
        Music("You Are Playing", "Chiptune", "https://m.media-amazon.com/images/I/71hfdo67xRL._SS500_.jpg", "MisfitChris"),
        Music("We Throw Shapes", "Chiptune", "http://images.genius.com/437746ccaa2c3a892967226dc27d115e.700x700x1.jpg", "Superpowerless"),

        Music("Wonderful Tonight", "Blues Rock", "https://img.discogs.com/W8JHr1Vsc0CaHC78MToXwLanJJk=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-5328000-1515882013-4711.jpeg.jpg", "Eric Clapton"),
        Music("Layla", "Blues Rock", "https://img.discogs.com/WAMUjHCYPw1YBWHhx63gEG65hSM=/fit-in/600x530/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5347153-1492682285-9165.jpeg.jpg", "Eric Clapton"),
        Music("Cocaine", "Blues Rock", "https://i.ytimg.com/vi/aFEPIH4Iq58/hqdefault.jpg", "Eric Clapton"),

        Music("Roxanne", "Blues Rock", "https://musicandrock.com/wp-content/uploads/2018/06/portadasinglev2.jpeg", "The Police"),
        Music("Message In A Bottle", "Blues Rock", "https://images.genius.com/3b412dbea9a17f97d95617d44e5e8ae9.1000x1000x1.jpg", "The Police"),
        Music("So Lonely", "Blues Rock", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8b/So_Lonely_-_The_Police_%28NL%29.jpg/220px-So_Lonely_-_The_Police_%28NL%29.jpg", "The Police"),

        Music("Money For Nothing", "Blues Rock", "https://i.ytimg.com/vi/JRDgihVDEko/maxresdefault.jpg", "Dire Straits"),
        Music("Sultans Of Swing", "Blues Rock", "https://images-na.ssl-images-amazon.com/images/I/71iIb0Ay3PL._SL1448_.jpg", "Dire Straits"),
        Music("Brothers In Arms", "Blues Rock", "https://images-na.ssl-images-amazon.com/images/I/71TqBCAbBZL._SL1200_.jpg", "Dire Straits"),

        Music("Boulevard Of Broken Dreams", "Punk Rock", "https://m.media-amazon.com/images/I/915fbq8xMML._SS500_.jpg", "Green Day"),
        Music("Basket Case", "Punk Rock", "https://images-na.ssl-images-amazon.com/images/I/718L4XEJf1L._SX355_.jpg", "Green Day"),
        Music("American Idiot", "Punk Rock", "https://images-na.ssl-images-amazon.com/images/I/6191UqQ-xCL._SL1200_.jpg", "Green Day"),

        Music("Holiday in Cambodia", "Punk Rock", "https://img.discogs.com/3bu8w9JfY5cOrg9s_DBDFpdz5es=/fit-in/600x597/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-997569-1365191065-5034.jpeg.jpg", "Dead Kennedys"),
        Music("California Uber Alles", "Punk Rock", "https://img.discogs.com/vQQd52lFhK_fmeNGzz36qkdp2cM=/fit-in/596x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-426709-1163848771.jpeg.jpg", "Dead Kennedys"),
        Music("Nazi Punks Fuck Off", "Punk Rock", "https://www.antiwarsongs.org/img/upl/DEAD-KENNEDYS-Black-Nazi-Punks-Fuck-Off-T-Shirt-1.jpg", "Dead Kennedys"),

        Music("Neat Neat Neat", "Punk Rock", "https://img.discogs.com/TPrE_-q-d7HYYLAqlMmq9zIH0rk=/fit-in/595x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5775937-1403277976-2160.jpeg.jpg", "The Damned"),
        Music("Alone Again Or", "Punk Rock", "https://m.media-amazon.com/images/I/71TVfFEbGGL._SS500_.jpg", "The Damned"),
        Music("Life Goes On", "Punk Rock", "https://images.genius.com/32e92a304d178c6acd82daea3e612372.300x300x1.jpg", "The Damned"),

        Music("Wish You Were Here", "Progressive Rock", "https://hipertextual.com/files/2017/12/Wish-You-Were-Here-1030x615.jpg", "Pink Floyd"),
        Music("Another Brick In The Wall Pt_1", "Progressive Rock", "https://m.media-amazon.com/images/I/71BaC3FxeBL._SS500_.jpg", "Pink Floyd"),
        Music("Another Brick In The Wall Pt_2", "Progressive Rock", "https://m.media-amazon.com/images/I/71BaC3FxeBL._SS500_.jpg", "Pink Floyd"),

        Music("Aspirations", "Progressive Rock", "http://images.genius.com/ef96c4344a65215f86efc886cc935e97.1000x1000x1.jpg", "Gentle Giant"),
        Music("Proclamation", "Progressive Rock", "http://images.genius.com/ef96c4344a65215f86efc886cc935e97.1000x1000x1.jpg", "Gentle Giant"),
        Music("Giant", "Progressive Rock", "https://m.media-amazon.com/images/I/81YbYOSO3ML._SS500_.jpg", "Gentle Giant"),

        Music("Let It Be", "Progressive Rock", "https://cdn.culturagenial.com/es/imagenes/let-it-be-0-cke.jpg", "The Beatles"),
        Music("Here Comes The Sun", "Progressive Rock", "https://i.ytimg.com/vi/xUNqsfFUwhY/maxresdefault.jpg", "The Beatles"),
        Music("Come Together", "Progressive Rock", "https://i.ytimg.com/vi/45cYwDMibGo/maxresdefault.jpg", "The Beatles"),

        Music("Duality", "Death Metal", "https://townsquare.media/site/366/files/2018/06/Slipknot-2004.jpg", "Slipknot"),
        Music("Unsainted", "Death Metal", "https://i.ytimg.com/vi/VpATBBRajP8/maxresdefault.jpg", "Slipknot"),
        Music("Psychosocial", "Death Metal", "https://images.genius.com/f0c4a5bcdae5dda5af5316d6e1a3a73d.894x894x1.jpg", "Slipknot"),

        Music("Starved", "Death Metal", "https://f4.bcbits.com/img/a1404065325_10.jpg", "Gatecreeper"),
        Music("Emptiness", "Death Metal", "https://f4.bcbits.com/img/a1404065325_10.jpg", "Gatecreeper"),
        Music("Rusted Gold", "Death Metal", "https://f4.bcbits.com/img/a1404065325_10.jpg", "Gatecreeper"),

        Music("Inhumane Harvest", "Death Metal", "https://townsquare.media/site/366/files/2021/02/cannibal_corpse_violence_unimagined_album_art.jpg?w=1080&q=75", "Cannibal Corpse"),
        Music("Hammer Smashed Face", "Death Metal", "https://upload.wikimedia.org/wikipedia/en/7/7c/Hammer_smashed_face_album_coverart.jpg", "Cannibal Corpse"),
        Music("Scourge of Iron", "Death Metal", "https://m.media-amazon.com/images/I/81V6nXGOpeL._SS500_.jpg", "Cannibal Corpse"),

        Music("Master Of Puppets", "Heavy Metal", "https://images-na.ssl-images-amazon.com/images/I/51XyTOdXBnL._SX425_.jpg", "Metallica"),
        Music("Seek & Destroy", "Heavy Metal", "https://img.discogs.com/qw_xlOYyXvhuZ2X2tFDSCZcfO_Y=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-10895842-1506116110-2946.jpeg.jpg", "Metallica"),
        Music("Whiskey In The Jar", "Heavy Metal", "http://3.bp.blogspot.com/-RClHX3OLo0w/UhZK4ZiEGyI/AAAAAAAABt8/zjOICgKx5lo/s640/Garage+Inc+Disc+2+Metallica__Garage_Inc.jpg", "Metallica"),

        Music("Stairway to Heaven", "Heavy Metal", "https://i1.sndcdn.com/artworks-000127380203-93pa4d-t500x500.jpg", "Led Zeppelin"),
        Music("Whole Lotta Love", "Heavy Metal", "https://images-na.ssl-images-amazon.com/images/I/51HqnBBtszL._SY445_.jpg", "Led Zeppelin"),
        Music("Black Dog", "Heavy Metal", "https://www.nacionrock.com/wp-content/uploads/Black-Dog.jpg", "Led Zeppelin"),

        Music("Back In Black", "Heavy Metal", "https://images-na.ssl-images-amazon.com/images/I/41kj36cVMFL._SX466_.jpg", "AC/DC"),
        Music("Thunderstruck", "Heavy Metal", "https://upload.wikimedia.org/wikipedia/en/e/e4/ACDC-Thunderstruck.png", "AC/DC"),
        Music("T_N_T", "Heavy Metal", "https://img.discogs.com/P-PQsPkHHOJzk3vdD4f16AEtBRA=/fit-in/600x589/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-398535-1480029865-9606.jpeg.jpg", "AC/DC"),

        Music("Hail to the King", "Alternative Metal", "http://www.androidsis.com/wp-content/uploads/2013/12/avenged-sevenfold-hail-to-the-king.jpg", "Avenged Sevenfold"),
        Music("Nightmare", "Alternative Metal", "https://images-na.ssl-images-amazon.com/images/I/81D5il1PpPL._SL1425_.jpg", "Avenged Sevenfold"),
        Music("Afterlife", "Alternative Metal", "https://i1.sndcdn.com/artworks-000072131594-wslrnc-t500x500.jpg", "Avenged Sevenfold"),

        Music("A Little Bit Off", "Alternative Metal", "https://d2x4qakry0y44a.cloudfront.net/wp-content/uploads/2020/06/08132038/ffdp-f8.jpg", "Five Finger Death Punch"),
        Music("Bad Company", "Alternative Metal", "https://hereticdhammasangha.files.wordpress.com/2012/01/five-finger-death-punch-war-is-the-answer-front-cover-14945.jpg", "Five Finger Death Punch"),
        Music("Jekyll And Hyde", "Alternative Metal", "https://upload.wikimedia.org/wikipedia/en/1/1b/5fdpJekyll%26Hyde.jpg", "Five Finger Death Punch"),

        Music("Absolute Zero", "Alternative Metal", "https://m.media-amazon.com/images/I/81vGRcrWwhL._SS500_.jpg", "Stone Sour"),
        Music("Wicked Game", "Alternative Metal", "https://i.ytimg.com/vi/cncoJB_C-m0/0.jpg", "Stone Sour"),
        Music("Bother", "Alternative Metal", "https://images-na.ssl-images-amazon.com/images/I/419R1BAYEZL._QL70_ML2_.jpg", "Stone Sour"),

        Music("Campus", "Afropop", "https://images-na.ssl-images-amazon.com/images/I/71xPzD-gGDL._SL1389_.jpg", "Vampire Weekend"),
        Music("This Life", "Afropop", "https://images.genius.com/5f9a6674593806ac72677141c0e66330.1000x1000x1.png", "Vampire Weekend"),
        Music("Step", "Afropop", "https://images-na.ssl-images-amazon.com/images/I/81s5ai4gJUL._SY355_.jpg", "Vampire Weekend"),

        Music("Someday At Christmas", "Afropop", "https://images.genius.com/7a72c4eea8f74ccdd3ff3bd65d2e1626.1000x1000x1.png", "Joy Denalane"),
        Music("I Believe", "Afropop", "https://images.genius.com/4cdba88e6d94fd7b577acda99da7b550.1000x1000x1.png", "Joy Denalane"),
        Music("Keine Religion", "Afropop", "https://m.media-amazon.com/images/I/810uKlFv-uL._SS500_.jpg", "Joy Denalane"),

        Music("Rain, Oh, Rain", "Afropop", "https://images-na.ssl-images-amazon.com/images/I/51sC%2BRHIGrL._SX355_.jpg", "Fool's Gold"),
        Music("Choices", "Afropop", "https://images-na.ssl-images-amazon.com/images/I/51sC%2BRHIGrL._SX355_.jpg", "Fool's Gold"),
        Music("I Will Run", "Afropop", "https://images-na.ssl-images-amazon.com/images/I/51sC%2BRHIGrL._SX355_.jpg", "Fool's Gold"),

        Music("How You Like That", "K-Pop", "https://i.ytimg.com/vi/ioNng23DkIM/maxresdefault.jpg", "Blackpink"),
        Music("Lovesick Girls", "K-Pop", "https://upload.wikimedia.org/wikipedia/en/3/3e/Blackpink_-_Lovesick_Girls.png", "Blackpink"),
        Music("As If It's Your Last", "K-Pop", "https://upload.wikimedia.org/wikipedia/en/6/66/BLACK_PINK_-_As_If_It%27s_Your_Last.jpg", "Blackpink"),

        Music("Love Shot", "K-Pop", "https://assets.puzzlefactory.pl/puzzle/256/756/original.jpg", "EXO"),
        Music("Monster", "K-Pop", "https://i.pinimg.com/originals/db/0e/f4/db0ef482e4898c3984abc6d49b844c9c.png", "EXO"),
        Music("Obsession", "K-Pop", "https://i.pinimg.com/originals/36/f0/22/36f0229bec93472a586490c43a4b7676.jpg", "EXO"),

        Music("Home", "K-Pop", "https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fblogs-images.forbes.com%2Fjeffbenjamin%2Ffiles%2F2019%2F02%2FSeventeen-You-Made-My-Dawn-promo-billboard-1548-1200x794.jpg", "Seventeen"),
        Music("CLAP", "K-Pop", "https://i.pinimg.com/originals/8b/68/17/8b681729dc4a5939609f6dd2ab3bb093.png", "Seventeen"),
        Music("24H", "K-Pop", "https://2.bp.blogspot.com/-kNuJxp2FXRE/XwrikiH7AwI/AAAAAAAAFaA/4XswUBfs_RgxzmwyuhES0f8TsgmlqtzbwCK4BGAYYCw/s640/seventeenjaponcomeback.jpeg", "Seventeen"),

        Music("positions", "Teen Pop", "https://www.mor.bo/wp-content/uploads/2020/10/positions.jpg", "Ariana Grande"),
        Music("7 rings", "Teen Pop", "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2019/01/18/15478068278083.png", "Ariana Grande"),
        Music("pov", "Teen Pop", "https://www.mor.bo/wp-content/uploads/2020/10/positions.jpg", "Ariana Grande"),

        Music("Anyone", "Teen Pop", "https://www.cultture.com/pics/2021/01/mira-el-video-inspirado-en-rocky-para-el-nuevo-single-de-justin-bieber-anyone.jpg", "Justin Bieber"),
        Music("Lonely", "Teen Pop", "https://i.ytimg.com/vi/xQOO2xGQ1Pc/maxresdefault.jpg", "Justin Bieber"),
        Music("Monster", "Teen Pop", "https://www.red17.com/pics/2020/11/shawn-mendes-y-justin-bieber-monster-lyrics-are-all-about-the-price-of-fame.jpg", "Justin Bieber"),

        Music("Story of My Life", "Teen Pop", "https://images-na.ssl-images-amazon.com/images/I/81LZjmtyWzL._SX466_.jpg", "One Direction"),
        Music("Night Changes", "Teen Pop", "https://img.discogs.com/QfmNMyYdpu26Am2UhCaW0vHrjKY=/fit-in/600x507/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-6483509-1594720447-1949.png.jpg", "One Direction"),
        Music("18", "Teen Pop", "https://i.ytimg.com/vi/VRpzJabYlQQ/maxresdefault.jpg", "One Direction"),

        Music("Jurassic World", "Movie Soundtracks", "https://imagenes.20minutos.es/files/image_656_370/uploads/imagenes/2021/01/20/jurassic-world-dominion-logo.jpeg", "Parque Jurásico"),
        Music("Pirates of the Caribbean", "Movie Soundtracks", "https://flxt.tmsimg.com/assets/p164907_p_v10_ak.jpg", "Piratas del Caribe"),
        Music("Harry Potter Main Theme", "Movie Soundtracks", "https://www.altonivel.com.mx/wp-content/uploads/2018/07/harry-potter.jpg", "Harry Potter"),

        Music("Hive Knight", "Game Soundtracks", "https://www.nintenderos.com/wp-content/uploads/2019/11/h-1.jpg", "Hollow Knight"),
        Music("The Grimm Troupe", "Game Soundtracks", "https://www.nintenderos.com/wp-content/uploads/2019/11/h-1.jpg", "Hollow Knight"),
        Music("Dreamers", "Game Soundtracks", "https://www.nintenderos.com/wp-content/uploads/2019/11/h-1.jpg", "Hollow Knight"),

        Music("City Ruins", "Game Soundtracks", "https://onvinylstore.com/environment/cache/images/0_0_productGfx_12831/4988601465403-a.jpg", "NieR Automata"),
        Music("Peaceful Sleep", "Game Soundtracks", "https://onvinylstore.com/environment/cache/images/0_0_productGfx_12831/4988601465403-a.jpg", "NieR Automata"),
        Music("Memories of Dust", "Game Soundtracks", "https://onvinylstore.com/environment/cache/images/0_0_productGfx_12831/4988601465403-a.jpg", "NieR Automata"),

        Music("Prelude", "Game Soundtracks", "https://img.discogs.com/4O6PfMgPgK6lmwQ6QhPpI-qWRk4=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-10040452-1490567967-1151.jpeg.jpg", "Final Fantasy XV"),
        Music("Mako Reactor", "Game Soundtracks", "https://img.discogs.com/4O6PfMgPgK6lmwQ6QhPpI-qWRk4=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-10040452-1490567967-1151.jpeg.jpg", "Final Fantasy XV"),
        Music("Anxious Heart", "Game Soundtracks", "https://img.discogs.com/4O6PfMgPgK6lmwQ6QhPpI-qWRk4=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-10040452-1490567967-1151.jpeg.jpg", "Final Fantasy XV"),

        Music("Amigos", "Rap", "https://ayaxyprok.com/77/prok-rojo-y-negro-cd.jpg", "Prok"),
        Music("No es mona ni na", "Rap", "https://ayaxyprok.com/77/prok-rojo-y-negro-cd.jpg", "Prok"),
        Music("Chicago", "Rap", "https://ayaxyprok.com/77/prok-rojo-y-negro-cd.jpg", "Prok"),

        Music("Rap god", "Rap", "https://i.ytimg.com/vi/XbGs_qK2PQA/maxresdefault.jpg", "Eminem"),
        Music("Without me", "Rap", "https://i.ytimg.com/vi/tqxRidAWER8/maxresdefault.jpg", "Eminem"),
        Music("Lose Yourself", "Rap", "https://img.discogs.com/t5A00M7XhFdFK33ALXjcTJsCzzU=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-246626-1164910429.jpeg.jpg", "Eminem"),

        Music("Hiprofenia", "Rap", "https://mp3.hhgroups.com/albumes/Elane-Son-de-esas-53685_front.jpg", "Elane"),
        Music("Axinita", "Rap", "https://mp3.hhgroups.com/albumes/Elane-Son-de-esas-53685_front.jpg", "Elane"),
        Music("Perfidia", "Rap", "https://mp3.hhgroups.com/albumes/Elane-Son-de-esas-53685_front.jpg", "Elane"),

        Music("Boulevard of Broken Dreams", "Beatbox", "https://coub-anubis-a.akamaized.net/coub_storage/coub/simple/cw_timeline_pic/33b8306dce0/3216cad060aef3b72adf5/1604010838_image.jpg", "Codfish"),
        Music("No Diggity", "Beatbox", "https://i.ytimg.com/vi/Ac23w_M-4As/maxresdefault.jpg", "Codfish"),
        Music("Roll Like This", "Beatbox", "https://static.wikia.nocookie.net/beatbox/images/2/21/NaPoM_Beatbox.jpg/revision/latest?cb=20200619193539", "NaPoM"),

        Music("Bnet vs Valles-T", "Freestyle", "https://i.ytimg.com/vi/28FbILWvMyU/maxresdefault.jpg", "Final Internacional 2019"),
        Music("Trueno vs Aczino", "Freestyle", "https://i.ytimg.com/vi/B_TEq5kh0DU/maxresdefault.jpg", "Final Internacional 2019"),
        Music("Wos vs Aczino", "Freestyle", "https://i.ytimg.com/vi/hpaBG68l-Vk/maxresdefault.jpg", "Final Internacional 2019"),

        Music("ChysteMC vs Meta", "Freestyle", "https://i.ytimg.com/vi/7bpi6AQzluQ/mqdefault.jpg", "Leyendas del Free"),
        Music("Senc vs Plets", "Freestyle", "https://i.ytimg.com/vi/4zjCzJrdi_8/maxresdefault.jpg", "Leyendas del Free"),
        Music("ChysteMC vs Joqerr", "Freestyle", "https://i.ytimg.com/vi/xXnLxIuKkyE/maxresdefault.jpg", "Leyendas del Free"),

        Music("Klan Replik vs Trueno Underdann", "Freestyle", "https://i.ytimg.com/vi/NZ0I2GHgavU/maxresdefault.jpg", "Quinto Escalón"),
        Music("Duki vs Lit Killah", "Freestyle", "https://i.ytimg.com/vi/Pc7MgRYjLxU/maxresdefault.jpg", "Quinto Escalón"),
        Music("Dani vs MKS", "Freestyle", "https://i.ytimg.com/vi/P57GxTjClns/maxresdefault.jpg", "Quinto Escalón"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_recycler)

        var bundle: Bundle = intent.extras!!
        var artista = bundle.getString("artista")!!

        var niceMusic: ArrayList<Music> = seleccionarMusica(artista)

        var recyclerView = findViewById<RecyclerView>(R.id.musicRecycler)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MusicAdapter(niceMusic)
        recyclerView.adapter = adapter
    }

    private fun seleccionarMusica(artista: String): ArrayList<Music> {

        var lista = ArrayList<Music>()

        for (item in music) {

            if (item.grupo.equals(artista)) {

                lista.add(item)
            }

            if (item.genero.equals(artista)) {

                lista.add(item)

            }

        }

        return lista

    }
}