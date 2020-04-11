package com.atilsamancioglu.karakterkitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerAdapter(val karakterListesi: ArrayList<String>, val karakterGorselleri: ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.KarakterKitabiVH>() {


    class KarakterKitabiVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KarakterKitabiVH {
        //LayoutInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return KarakterKitabiVH(itemView)
    }

    override fun getItemCount(): Int {
       return karakterListesi.size
    }

    override fun onBindViewHolder(holder: KarakterKitabiVH, position: Int) {
        holder.itemView.itemRowText.text = karakterListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetayActivity::class.java)
            intent.putExtra("karakterismi",karakterListesi.get(position))
            intent.putExtra("karaktergorseli",karakterGorselleri.get(position))
            /*
            val singleton = Singleton.Secilen
            singleton.secilenGorsel = karakterGorselleri.get(position)

             */
            holder.itemView.context.startActivity(intent)
        }
    }


}