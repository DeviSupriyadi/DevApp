package com.devisupriyadi.devapp
/* Tanggal Pengerjaan : 4-16 Mei 2020
    Nama              : Devi Tiana Octaviani
    NIM               : 10117181
    Kelas             : IF-5
 */
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_gallery.view.*

class GalleryAdapter:RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    private var gal: List<dbgallery> = ArrayList()

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
    fun setGalleryAdapter(dbgallery:  List<dbgallery>){
        gal = dbgallery
    }

    class ViewHolder constructor(
        view: View
    ): RecyclerView.ViewHolder(view){
        val image =view.foto1

        fun bind(dbgallery: dbgallery){
            image.setImageResource(dbgallery.images)
        }
    }
}