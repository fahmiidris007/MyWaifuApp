package com.fahmiproduction.submission_dicoding_android_pemula

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvEmail: TextView = findViewById(R.id.tv_url_email)

        tvEmail.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_url_email -> {
                val link = "mailto:fahmiidris@apps.ipb.ac.id"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}