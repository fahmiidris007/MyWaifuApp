package com.fahmiproduction.submission_dicoding_android_pemula

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewWaifuAdapter(private val listNuclear: ArrayList<Waifu>) :
    RecyclerView.Adapter<CardViewWaifuAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_waifu, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val waifu = listNuclear[position]

        Glide.with(holder.itemView.context)
            .load(waifu.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = waifu.name
        holder.tvDetail.text = waifu.detail

        holder.btnFavorite.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Favorite " + listNuclear[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }

        holder.btnShare.setOnClickListener {
            // Toast.makeText(holder.itemView.context, "Share " + listNuclear[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, waifu.name + "\n\n" + waifu.detail)
            intent.putExtra(Intent.EXTRA_SUBJECT, waifu.name)
            intent.type = "text/plain"
            holder.itemView.context.startActivity(Intent.createChooser(intent, "Share via"))
        }

        holder.itemView.setOnClickListener {
            // Toast.makeText(holder.itemView.context, listNuclear[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()

            val intent = Intent(holder.itemView.context, DetailWaifuActivity::class.java).apply {
                putExtra(DetailWaifuActivity.EXTRA_NAME, waifu.name)
                putExtra(DetailWaifuActivity.EXTRA_DETAIL, waifu.detail)
                putExtra(DetailWaifuActivity.EXTRA_IMAGE, waifu.photo)
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
        return listNuclear.size
    }
}
