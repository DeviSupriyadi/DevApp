package com.devisupriyadi.devapp

data class Gallery(
    val images: Int
) {
    companion object{
        fun setDataGall(): ArrayList<Gallery>{
            val list = ArrayList<Gallery>()
            list.add(
                Gallery(R.drawable.ospek))
            list.add(Gallery(R.drawable.micin))
            list.add(Gallery(R.drawable.micin2))
            list.add(Gallery(R.drawable.kls))
            list.add(Gallery(R.drawable.ipas))
            list.add(Gallery(R.drawable.caleuy))
            list.add(Gallery(R.drawable.kls2))
            return list
        }
    }
}