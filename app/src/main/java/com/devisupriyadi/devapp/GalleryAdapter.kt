package com.devisupriyadi.devapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devisupriyadi.devapp.R
import kotlinx.android.synthetic.main.rv_gallery.view.*
import kotlinx.android.synthetic.main.rv_gallery_item.view.*

class GalleryAdapter:RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    private var items: List<Gallery> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_gallery,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }

    class ViewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val image =view.foto1

        fun bind(gallery: Gallery){
            image.setImageResource(Gallery.images)
        }
    }
}