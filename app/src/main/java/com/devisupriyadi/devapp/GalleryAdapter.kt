package com.devisupriyadi.devapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_gallery.view.*

class GalleryAdapter:RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    private var gal: List<Gallery> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_gallery,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return gal.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(gal.get(position))
    }
    fun setGalleryAdapter(galleryEntitiy: List<Gallery>){
        gal = galleryEntitiy
    }

    class ViewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val image =view.foto1

        fun bind(gallery: Gallery){
            image.setImageResource(gallery.images)
        }
    }
}