package com.example.heroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterPahlawan
    private lateinit var pahlawans : ArrayList<Pahlawan>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // buat array list pahlawan
        pahlawans = ArrayList()
        pahlawans.add(Pahlawan("Ahmad Dahlan", R.drawable.ahmad_dahlan,"1 Agustus 1868","23 Februari 1923 "))
        pahlawans.add(Pahlawan("Dr. Soetomo",R.drawable.dr_soetomo,"30 Juli 1888","30 Mei 1938"))
        pahlawans.add(Pahlawan("KH. Abdul Wahid Hasyim",R.drawable.wahid_hasyim,"1 Juni 1914","19 April 1953"))

        // inisiasi recyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // setup adapter
        adapter = AdapterPahlawan(pahlawans)
        recyclerView.adapter = adapter

    }
}