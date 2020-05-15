package com.devisupriyadi.devapp

data class Gallery(
    val id: Int,
    val images : String
) {
    companion object{
        fun setDataGall(): ArrayList<Gallery>{
            val list = ArrayList<Gallery>()
            list.add(
                Gallery(1,R.drawable.ospek))
            list.add(Gallery(2,R.drawable.depi))
            list.add(Gallery(3,R.drawable.deviii))
            return list
        }
    }
}