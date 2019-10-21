package com.example.listviewpresiden_.model

import com.example.listviewpresiden_.R

object DataPresiden {
    private val namapresiden = arrayOf(
        "Ir.Soekarno",
        "Soeharto",
        "BJ.Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarno Putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val data = arrayOf(
        "Ir.Soekarno adalah presiden pertama Indonesia, beliau dikenal sebagai bapak proklamator ",
        "Soeharto adalah presiden kedua Indonesia, bergelar jenderal besar",
        "BJ.Habibie adalah presiden ketiga Indonesia, dikenal sebagai bapak teknologi",
        "Abdurrahman Wahid adalah presiden keempat Indonesia, beliau adalah seorang kyai",
        "Megawati Soekarno Putri adalah presiden kelima Indonesia, merupakan anak dari presiden pertama Indoneisa",
        "Susilo Bambang Yudhoyono adalah presiden Indonesia keenam, menjabat selama 2 periode",
        "Joko Widodo adalah presiden Indonesia ketujuh, menjabat selama 2 periode"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habiebie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in namapresiden.indices){
            val presiden = Presiden()
            presiden.nama1 = namapresiden[position]
            presiden.deskripsi1 = data[position]
            presiden.foto1 = presidenPoster[position]
            list.add(presiden)
        }
        return list
    }
}