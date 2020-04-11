package com.atilsamancioglu.karakterkitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri
        var karakterIsimleri = ArrayList<String>()
        karakterIsimleri.add("Superman")
        karakterIsimleri.add("Batman")
        karakterIsimleri.add("Iron Man")
        karakterIsimleri.add("Wonderwoman")

        /*
        //Verimsiz - Bitmap
        val supermanGorsel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val batmanGorsel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val ironmanGorsel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val wonderwomanGorsel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.wonderwoman)

        var karakterGorselleri = ArrayList<Bitmap>()
        karakterGorselleri.add(supermanGorsel)
        karakterGorselleri.add(batmanGorsel)
        karakterGorselleri.add(ironmanGorsel)
        karakterGorselleri.add(wonderwomanGorsel)

         */

        //Verimli Görsel

        val supermanGorselId = R.drawable.superman
        val batmanGorselId = R.drawable.batman
        val ironmanGorselId = R.drawable.ironman
        val wonderwomanGorselId = R.drawable.wonderwoman

        var karakterGorselIdleri = ArrayList<Int>()
        karakterGorselIdleri.add(supermanGorselId)
        karakterGorselIdleri.add(batmanGorselId)
        karakterGorselIdleri.add(ironmanGorselId)
        karakterGorselIdleri.add(wonderwomanGorselId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val recyclerViewAdapter = RecyclerAdapter(karakterIsimleri,karakterGorselIdleri)
        recyclerView.adapter = recyclerViewAdapter


    }
}