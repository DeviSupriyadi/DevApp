package com.devisupriyadi.devapp
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
data class dbgallery(
    val images: Int
) {
    companion object{
        fun setDataGall(): ArrayList<dbgallery>{
            val list = ArrayList<dbgallery>()
            list.add(
                dbgallery(R.drawable.ospek))
            list.add(dbgallery(R.drawable.micin))
            list.add(dbgallery(R.drawable.micin2))
            list.add(dbgallery(R.drawable.kls))
            list.add(dbgallery(R.drawable.ipas))
            list.add(dbgallery(R.drawable.caleuy))
            list.add(dbgallery(R.drawable.kls2))
            return list
        }
    }
}