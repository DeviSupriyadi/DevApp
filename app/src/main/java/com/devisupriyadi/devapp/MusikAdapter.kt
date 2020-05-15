package com.devisupriyadi.devapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.musik_menus.view.*

class MusikAdapter: RecyclerView.Adapter<MusikAdapter.viEwHolder>() {
    private var sik : List<dbmusik> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusikAdapter.viEwHolder {
        return viEwHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.musik_menus,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return sik.size
    }

    override fun onBindViewHolder(holder: MusikAdapter.viEwHolder, position: Int) {
        holder.bindsik(sik.get(position))
    }
    fun setMusikAdapter(dbmusik: List<dbmusik>){
        sik=dbmusik
    }
    class viEwHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val judule = view.tvmusik
        fun bindsik(dbmusik: dbmusik){
            judule.text = (dbmusik.lagu)
        }
    }
}