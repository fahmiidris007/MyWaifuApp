package com.fahmiproduction.submission_dicoding_android_pemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvWaifu: RecyclerView
    private val list : ArrayList<Waifu> = arrayListOf()
    private var title: String = "Daftar Waifu"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)


        rvWaifu = findViewById(R.id.rv_waifu)
        rvWaifu.setHasFixedSize(true)

        list.addAll(WaifusData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvWaifu.layoutManager = LinearLayoutManager(this)
        val listWaifuAdapter = ListWaifuAdapter(list)
        rvWaifu.adapter = listWaifuAdapter

        listWaifuAdapter.setOnItemClickCallback(object : ListWaifuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Waifu) {
                showSelectedNuclear(data)
            }
        })
    }
    private fun showRecyclerGrid() {
        rvWaifu.layoutManager = GridLayoutManager(this, 2)
        val gridNuclearAdapter = GridWaifuAdapter(list)
        rvWaifu.adapter = gridNuclearAdapter

        gridNuclearAdapter.setOnItemClickCallback(object : GridWaifuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Waifu) {
                showSelectedNuclear(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvWaifu.layoutManager = LinearLayoutManager(this)
        val cardViewNuclearAdapter = CardViewWaifuAdapter(list)
        rvWaifu.adapter = cardViewNuclearAdapter
    }

    private fun showSelectedNuclear(nuclear: Waifu) {
        Toast.makeText(this, nuclear.name, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.list_mode -> {
                title = "Daftar Waifu"
                showRecyclerList()
            }

            R.id.grid_mode -> {
                title = "Daftar Waifu (Gambar)"
                showRecyclerGrid()
            }

            R.id.cardview_mode -> {
                title = "Daftar Waifu (Detail)"
                showRecyclerCardView()
            }

            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, About::class.java)
                startActivity(aboutIntent)
            }
        }
        setActionBarTitle(title)
    }
}