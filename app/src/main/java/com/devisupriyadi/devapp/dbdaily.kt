package com.devisupriyadi.devapp

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