package com.atilsamancioglu.karakterkitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val intent = intent
        val yollanilanIsim = intent.getStringExtra("karakterismi")
        textView.text = yollanilanIsim
        val yollanilanGorselId = intent.getIntExtra("karaktergorseli",0)
        val olusturulanGorsel = BitmapFactory.decodeResource(applicationContext.resources,yollanilanGorselId)
        imageView.setImageBitmap(olusturulanGorsel)

        /*
        val secilen = Singleton.Secilen
        val secilenGorsel = secilen.secilenGorsel
        imageView.setImageBitmap(secilenGorsel)

         */

    }
}