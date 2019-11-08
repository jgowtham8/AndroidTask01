package com.example.androidtask01

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.core.view.drawToBitmap
import classes.BlurBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //text_view_id.text = "fghdddddddddddddddddddddddddj"
//        val obj1 = BlurBuilder()
//        val resultImg = findViewById<RelativeLayout>(R.id.backImg)

        val resultImg = findViewById<RelativeLayout>(R.id.backImg)
        val resultBmp = BlurBuilder.blur(this, BitmapFactory.decodeResource(resources, R.drawable.back4))
        resultImg.setBackgroundDrawable(BitmapDrawable(resources, resultBmp))





    }
}
