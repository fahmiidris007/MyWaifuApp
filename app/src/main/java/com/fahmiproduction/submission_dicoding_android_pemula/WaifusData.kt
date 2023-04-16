package com.fahmiproduction.submission_dicoding_android_pemula

object WaifusData {
    private val waifuNames = arrayOf(
        "Asuna",
        "Artoria Pendragon",
        "Mikasa Ackerman",
        "Miku Nakano",
        "Mai Sakurajima",
        "Shinobu Kocho",
        "Kaguya Shinomiya",
        "Yor Forger",
        "Makima",
        "Rem"
    )
    private val waifuDetails = arrayOf(
        "Asuna tentu saja adalah waifu sejuta umat dari anime Sword Art Online. Asuna awalnya tidak peduli mati dalam game sebelum bertemu Kirito. Pertemuan itu secara drastis mengubah kepribadian dan pandangan hidup Asuna. Asuna adalah gadis yang baik hati dan penolong, mirip dengan Kirito, tak bisa meninggalkan orang lain dalam kesulitan. Dia menganggap permainan itu sangat serius dan bertekad untuk menyelesaikannya bersama Kirito.",
        "Artoria Pendragon adalah servant kelas Saber, dan sering dipanggil dengan sebutan itu. Dia adalah petarung pemberani dan tidak takut mengotori tangannya dalam pertempuran. Dia dapat dipercaya, dan dia selalu menyelesaikan pekerjaan. Saber telah membuktikan dalam banyak kesempatan bahwa dia lebih kuat dari yang lain. Dia memiliki kompas moral yang kuat yang tidak akan pernah menyimpang dan selalu berusaha menyelesaikan konflik dengan cara yang adil bagi semua pihak yang terlibat. Dia dengan mudah menjadi karakter paling populer di Fate series, dan waifu sejuta umat yang difavoritkan.",
        "Mikasa Ackerman adalah teman masa kecil Eren Yeager, meski kejadian baru-baru ini membuat mereka berpisah. Kata-kata kasar Eren terhadap Mikasa benar-benar kejam, dan tidak diragukan lagi setiap penggemar Attack on Titan ada di pihak Mikasa daripada di pihak Eren. Sementara itu, atas kemampuannya sendiri, Mikasa adalah waifu sejuta umat yang luar biasa. Dia adalah orang yang setia, perhatian, dan protektif yang juga cukup menarik dan petarung yang sangat terampil di atas semua itu. Dia juga agak sentimental di dunia di mana sentimentalitas tampaknya sudah mati. Dalam caranya yang tenang, Mikasa adalah sinar matahari di alam kegelapan.",
        "Ada sesuatu yang disukai dari kelima saudari Nakano, dari Yotsuba yang konyol hingga Nino yang tsundere, tetapi anak tengah, Miku, telah menjadi waifu favorit fandom The Quintessential Quintuplets. Miku adalah karakter dandere klasik, gadis yang baik hati dan penyayang yang juga sangat pemalu dan lemah lembut.Miku bersuara lembut, sangat kontras dengan Itsuki dan Nino. Tapi dia akan mencoba yang terbaik untuk membuat tutornya Futaro terkesan dan mengungkapkan keinginannya yang sebenarnya. Dia bahkan akan mencoba membuat kue manis untuknya, meski sayangnya dia bukan koki ahli.",
        "Mai Sakurajima dari Rascal Does Not Dream Of Bunny Girl Senpai adalah seorang tsundere yang menyenangkan yang ingin tetap rendah hati meskipun statusnya sebagai model dan aktris. Ibunya memaksanya masuk ke industri hiburan pada usia yang sangat muda, jadi Mai merasa kecewa karena kebanyakan orang hanya melihatnya untuk karakter yang dia mainkan daripada siapa dia sebenarnya. Sindrom Remaja Mai memberinya anonimitas yang selalu dia inginkan, tetapi itu juga secara bertahap menghapusnya dari keberadaan. Namun, Sakuta mencintainya apa adanya dan membantu menghentikan sindrom itu agar tidak bertambah buruk. Mai mungkin memiliki penampilan luar yang dingin, tapi dia setia dan melindungi orang-orang yang dia sayangi. Pastinya bakal masuk dalam daftar waifu sejuta umat.",
        "Shinobu Kocho dari Demon Slayer: Kimetsu no Yaiba adalah Hashira Serangga. Dia mencuri perhatian selama debutnya di arc Gunung Natagumo. Dia memiliki sikap yang sangat ceria dan ramah terhadap semua orang. Meskipun hal ini membuatnya cukup menarik bagi sebagian besar orang, melihatnya mengalahkan iblis yang haus darah dengan senyum tenang sangatlah menakutkan. Shinobu menunjukkan belas kasihan kepada Tanjiro dan Nezuko setelah mendengar tentang apa yang telah mereka lalui. Dia mengalami banyak trauma, tetapi mengagumkan bahwa dia tidak pernah kehilangan kepribadiannya yang ceria dan terus maju.",
        "Kaguya Shinomiya berasal dari keluarga yang sangat kaya dan berkuasa, tetapi dia tidak ingin status keluarganya menentukan dirinya. Sebaliknya, Kaguya ingin mengejar kepentingannya sendiri dan mendapatkan apa yang diinginkannya dengan kekuatannya sendiri. Pelayan dan kepala pelayannya hanya bisa melakukan banyak hal untuknya. Kaguya Shinomiya dulunya memiliki persona ratu es, tapi itu sudah berakhir. Sekarang dia adalah gadis yang berhati hangat dan perhatian yang dengan cepat mendukung semua temannya, dari Chika dan Yu hingga Nagisa, dan dia memiliki pikiran yang tajam dan jenaka yang memungkinkan dia untuk mengakali Miyuki Shirogane berkali-kali. Waifu sejuta umat dari Kaguya-sama: Love is War ini agak naif tapi sungguh-sungguh, membuat kombinasi yang menawan.",
        "Yor Forger dari Spy X Family hidup dalam dua dunia, sebagai pegawai balai kota yang sederhana di siang hari dan pembunuh bayaran di malam hari. Terlepas dari reputasinya sebagai Thorn Princess, kepribadian Yor yang sebenarnya tidak mengintimidasi sama sekali. Dia mudah bingung dan bahkan tampak naif dalam banyak situasi. Namun, keterampilan seni bela diri Yor dipadukan dengan keahlian senjata membuatnya menjadi pembunuh yang benar-benar mematikan. Dia dapat langsung memotong orang tanpa berpikir dua kali dan keluar tanpa cedera.",
        "Makima dari Chainsaw Man dengan cepat menjadi salah satu karakter wanita paling populer di anime dan manga, terlepas dari statusnya sebagai penjahat utama serial tersebut. Banyak karakter wanita Chainsaw Man, seperti Power, Himeno, Kobeni, bahkan Quanxi patut dipuji. Namun, Makima mendapat pujian paling banyak dari para penggemar. Tidak jelas mengapa penggemar begitu tertarik pada Makima, terutama setelah menyaksikan semua tindakan manipulatifnya yang mengerikan di Chainsaw Man. Tetap saja, dia mengumpulkan pasukan pengikut setia di fandom Chainsaw Man yang menyembah tanah tempat dia berjalan. Tidak dapat disangkal bahwa Makima adalah antagonis yang ditulis dengan baik yang berhasil dalam perannya sebagai dalang manipulatif dari Chainsaw Man. Makima juga memiliki desain karakter yang memukau.",
        "Rem adalah pelayan yang setia dan pekerja keras. Juga teman Subaru Natsuki yang berakhir di dunia lain dalam serial Re:Zero. Ketika dia pertama kali muncul, Rem dan saudara perempuannya yang berambut merah muda, Ram, adalah pelayan yang bekerja di perkebunan Mathers, tetapi pekerjaan rumah tangga bukan hanya yang mereka mampu lakukan. Fans menyukai Rem karena kombinasi kepribadiannya yang menawan, rasa kesetiaan dan tanggung jawabnya yang kuat, keterampilan bertarungnya, dan tentu saja penampilannya yang menawan dan sifatnya yang santai."
    )
    private val waifuAnimes = arrayOf(
        "Sword Art Online",
        "Fate/Stay Night",
        "Attack On Titan",
        "The Quintessential Quintuplets",
        "Rascal Does Not Dream Of Bunny Girl Senpai",
        "Demon Slayer",
        "Kaguya-Sama: Love Is War",
        "Spy x Family",
        "Chainsaw Man",
        "Re:Zero"
    )
    private val waifuGenres = arrayOf(
        "Action, Adventure, Game, Fantasy, Romance",
        "Action, Romance, Supernatural, Thriller.",
        "Action, Dark Fantasy, Post-Apocalyptic, Tragedi, Horror, Thriller",
        "Harem, Romance, Drama, Comedy",
        "Psychological, Romance, Supernatural",
        "Adventure, Dark Fantasy, Martial arts",
        "Comedy, Romance",
        "Action, Comedy, Drama",
        "Action, Dark Fantasy, Supernatural",
        "Action, Adventure, Fantasy"
    )
    private val waifuCharacters = arrayOf(
        "Baik hati, penolong, setia",
        "Pemberani, adil, serius",
        "Setia, perhatian, protektif, sentimental, dingin",
        "Tsundere, baik hati, penyayang, pemalu, lemah lembut",
        "Tsundere, menyenangkan, dingin, setia",
        "Ceria, ramah",
        "Ceria, tsundere, naif",
        "Pemberani, naif, dingin, tsundere",
        "Manipulatif, sadis, dingin",
        "Setia, pekerja keras, penyayang, lemah lembut"
    )
    private val waifuSeiyyus = arrayOf(
        "Haruka Tomatsu",
        "Ayako Kawatsumi",
        "Yui Ishikawa",
        "Miku Ito",
        "Asami Seto",
        "Saori Hayami",
        "Aoi Koga",
        "Saori Hayami",
        "Tomori Kusunoki",
        "Iori Minase",
    )
    private val waifuCouples= arrayOf(
        "Kirito",
        "-",
        "Eren Yeager",
        "Futaro",
        "Sakuta",
        "-",
        "Shirogane Miyuki",
        "Loid Forger ",
        "-",
        "Subaru Natsuki"
    )
    private val waifuImages = intArrayOf(
        R.drawable.asuna,
        R.drawable.artoria_pendragon,
        R.drawable.mikasa_ackerman,
        R.drawable.miku_nakano,
        R.drawable.mai_sakurajima,
        R.drawable.shinobu_kocho,
        R.drawable.kaguya_shinomiya,
        R.drawable.yor_forger,
        R.drawable.makima,
        R.drawable.rem
    )
    val listData: ArrayList<Waifu>
        get() {
            val list = arrayListOf<Waifu>()
            for (position in waifuNames.indices) {
                val waifu = Waifu()
                waifu.name = waifuNames[position]
                waifu.detail = waifuDetails[position]
                waifu.anime = waifuAnimes[position]
                waifu.genre = waifuGenres[position]
                waifu.character = waifuCharacters[position]
                waifu.seiyuu = waifuSeiyyus[position]
                waifu.couple = waifuCouples[position]
                waifu.photo = waifuImages[position]
                list.add(waifu)
            }
            return list
        }
}