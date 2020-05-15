package com.devisupriyadi.devapp

data class dbmusik(
    val lagu: String
){
    companion object{
        fun setDataMus() : ArrayList<dbmusik>{
            val list = ArrayList<dbmusik>()
            list.add(dbmusik("Si Lemah - RAN ft. Hindia"))
            list.add(dbmusik("Akhirnya Indah - The Changcuters"))
            list.add(dbmusik("Perfect - One Direction"))
            list.add(dbmusik("Teeth - 5 Seconds Of Summer"))
            list.add(dbmusik("Evaluasi - Hindia"))
            return list
        }
    }
}