package com.fahmiproduction.submission_dicoding_android_pemula

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailWaifuActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME         = "extra_name"
        const val EXTRA_DETAIL       = "extra_detail"
        const val EXTRA_ANIME      = "extra_anime"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_CHARACTER = "extra_character"
        const val EXTRA_SEIYUU     = "extra_seiyuu"
        const val EXTRA_COUPLE         = "extra_couple"
        const val EXTRA_IMAGE        = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_waifu)

        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val tvDetailReceived: TextView = findViewById(R.id.tv_detail_received)
        val tvAnimeReceived: TextView = findViewById(R.id.tv_anime_received)
        val tvGenreReceived: TextView = findViewById(R.id.tv_genre_received)
        val tvCharacterReceived: TextView = findViewById(R.id.tv_character_received)
        val tvSeiyuuReceived: TextView = findViewById(R.id.tv_seiyuu_received)
        val tvCoupleReceived: TextView = findViewById(R.id.tv_couple_received)
        val imgDetailReceived: ImageView = findViewById(R.id.img_item_photo)

        val name         = intent.getStringExtra(EXTRA_NAME)
        val detail       = intent.getStringExtra(EXTRA_DETAIL)
        val anime = intent.getStringExtra(EXTRA_ANIME)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val character = intent.getStringExtra(EXTRA_CHARACTER)
        val seiyuu     = intent.getStringExtra(EXTRA_SEIYUU)
        val couple         = intent.getStringExtra(EXTRA_COUPLE)
        val image        = intent.getIntExtra(EXTRA_IMAGE, 0)

        tvDetailReceived.text       = detail
        tvAnimeReceived.text       = anime
        tvGenreReceived.text       = genre
        tvCharacterReceived.text       = character
        tvSeiyuuReceived.text       = seiyuu
        tvCoupleReceived.text       = couple
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgDetailReceived)

        actionBar.title = name
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
