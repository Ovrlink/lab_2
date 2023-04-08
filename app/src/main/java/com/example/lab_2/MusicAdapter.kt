package com.example.lab_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
class MusicAdapter(private val list:List<music>,  private val onclick:(Music: music)->Unit): RecyclerView.Adapter<MusicAdapter.MusicHolder>() {

    class MusicHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(Music: music, onclick: (Music: music) -> Unit)
        {
            var itemImage: ImageView = itemView.findViewById(R.id.card_image)
            var itemTitle: TextView = itemView.findViewById(R.id.item_title)
            var itemDetail: TextView = itemView.findViewById(R.id.item_description)
            itemTitle.text=Music.name
            itemDetail.text=Music.description

            Glide.with(itemView.context)
                .load(Music.imageurl)
                .centerCrop()
                .into(itemImage)
            itemView.setOnClickListener{
                onclick(Music)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MusicHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return MusicHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MusicHolder, position: Int) {

        holder.bind(list[position], onclick)
    }

}