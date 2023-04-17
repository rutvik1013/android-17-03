package com.example.myloginapp


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var img:ImageView
    lateinit var text:TextView


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        img = findViewById(R.id.img)
        text = findViewById(R.id.txt1)

        btn1.setOnClickListener {

            Toast.makeText(applicationContext,"Success",Toast.LENGTH_LONG).show()

        }
        btn2.setOnClickListener {

            var i = Intent(applicationContext,MainActivity::class.java)
            startActivity(i)

        }

        btn3.setOnClickListener {

            var url="https://www.tops-int.com"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)

        }





    }
}
