package com.devisupriyadi.devapp
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
data class dbpren(
    val imgpren: Int,
    val prens : String
){
    companion object{
        fun setDatapren(): ArrayList<dbpren>{
            val list = ArrayList<dbpren>()
            list.add(dbpren(R.drawable.bal,"Iqbal"))
            list.add(dbpren(R.drawable.nisa,"Annisa"))
            list.add(dbpren(R.drawable.caca,"Ananda Salsa"))
            list.add(dbpren(R.drawable.widi,"Widiamega"))
            list.add(dbpren(R.drawable.man,"Salman"))
            list.add(dbpren(R.drawable.icoo,"Andryco"))
            list.add(dbpren(R.drawable.cep,"Cecep"))
            list.add(dbpren(R.drawable.haikal,"Haikal"))
            return list
        }
    }
}