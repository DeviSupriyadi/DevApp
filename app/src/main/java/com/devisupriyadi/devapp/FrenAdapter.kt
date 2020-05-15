package com.devisupriyadi.devapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pren_menus.view.*

class FrenAdapter: RecyclerView.Adapter<FrenAdapter.vIewHolder>() {
    private var prens : List<dbpren> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vIewHolder {
        return vIewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.pren_menus,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return prens.size
    }

    override fun onBindViewHolder(holder: FrenAdapter.vIewHolder, position: Int) {
        holder.bindpren(prens.get(position))
    }
    fun setFriendAdapter (dbpren: List<dbpren>){
        prens = dbpren
    }
    class vIewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val fren = view.tvpren
        val imggpren = view.fotopren

        fun bindpren(dbpren: dbpren){
            fren.text = (dbpren.prens)
            imggpren.setImageResource(dbpren.imgpren)
        }
    }
}