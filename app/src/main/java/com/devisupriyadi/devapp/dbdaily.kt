package com.devisupriyadi.devapp
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
data class dbdaily(
    val id: Int,
    val activityy : String
) {
    companion object{
        fun setData(): ArrayList<dbdaily>{
            val list = ArrayList<dbdaily>()
            list.add(dbdaily(1,"Tidur"))
            list.add(dbdaily(2,"Makan"))
            list.add(dbdaily(3,"Main Solitaire"))
            return list
        }
    }
}