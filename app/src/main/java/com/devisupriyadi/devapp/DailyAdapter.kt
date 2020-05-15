package com.devisupriyadi.devapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.daily_menus.view.*

class DailyAdapter: RecyclerView.Adapter<DailyAdapter.viewHolder>() {
    private var skuy : List<dbdaily> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyAdapter.viewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.daily_menus,parent, false)
        )
    }

    override fun getItemCount(): Int {
        return skuy.size
    }

    override fun onBindViewHolder(holder: DailyAdapter.viewHolder, position: Int) {
        holder.bindaifren(skuy.get(position))
    }
    fun setDailyAdapter (dbdaily: List<dbdaily>){
        skuy = dbdaily
    }
    class viewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val title = view.tvdaily

        fun bindaifren(dbdaily: dbdaily){
            title.text = dbdaily.activityy
        }
    }
}