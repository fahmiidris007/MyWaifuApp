package com.fahmiproduction.submission_dicoding_android_pemula

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridWaifuAdapter(val listWaifu: ArrayList<Waifu>) : RecyclerView.Adapter<GridWaifuAdapter.GridViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Waifu)
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_waifu, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val waifu = listWaifu[position]

        Glide.with(holder.itemView.context)
            .load(waifu.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener {
            // onItemClickCallback.onItemClicked(listNuclear[holder.adapterPosition])

            val intent = Intent(holder.itemView.context, DetailWaifuActivity::class.java).apply {
                putExtra(DetailWaifuActivity.EXTRA_NAME,         waifu.name)
                putExtra(DetailWaifuActivity.EXTRA_DETAIL,       waifu.detail)
                putExtra(DetailWaifuActivity.EXTRA_IMAGE,        waifu.photo)
                putExtra(DetailWaifuActivity.EXTRA_ANIME,        waifu.anime)
                putExtra(DetailWaifuActivity.EXTRA_GENRE,        waifu.genre)
                putExtra(DetailWaifuActivity.EXTRA_CHARACTER,        waifu.character)
                putExtra(DetailWaifuActivity.EXTRA_SEIYUU,        waifu.seiyuu)
                putExtra(DetailWaifuActivity.EXTRA_COUPLE,        waifu.couple)

            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listWaifu.size
    }
}