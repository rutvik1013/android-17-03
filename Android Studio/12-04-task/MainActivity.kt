package com.example.iplteam

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity :AppCompatActivity()
{
    lateinit var csk:ImageView
    lateinit var mi:ImageView
    lateinit var rcb:ImageView
    lateinit var gt:ImageView
    lateinit var dc:ImageView

    lateinit var c_csk:TextView
    lateinit var m_mi:TextView
    lateinit var r_rcb:TextView
    lateinit var g_gt:TextView
    lateinit var d_dc:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Chennai Super kings

        csk=findViewById(R.id.csk)
        csk.setOnClickListener {
            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)

        }
        c_csk=findViewById(R.id.cskteam)
        c_csk.setOnClickListener {
            var csk_url="https://www.chennaisuperkings.com/"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(csk_url))
        }
        // Mumbai indians
        mi=findViewById(R.id.csk)
        mi.setOnClickListener {
            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)

        }
        m_mi=findViewById(R.id.miteam)
        m_mi.setOnClickListener {
            var mi_url="https://www.mumbaiindians.com/"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(mi_url))
        }
        //RCB
        rcb=findViewById(R.id.csk)
        rcb.setOnClickListener {
            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)

        }
        r_rcb=findViewById(R.id.miteam)
        r_rcb.setOnClickListener {
            var rcb_url="https://www.royalchallengers.com/"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(rcb_url))
        }
        // Gujarat Titans
        gt=findViewById(R.id.csk)
        gt.setOnClickListener {
            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)

        }
        g_gt=findViewById(R.id.miteam)
        g_gt.setOnClickListener {
            var gt_url="https://www.gujarattitansipl.com/"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(gt_url))
        }
        // Delhi capitals
        dc=findViewById(R.id.csk)
        dc.setOnClickListener {
            var i=Intent(applicationContext,MainActivity2::class.java)
            startActivity(i)

        }
        d_dc=findViewById(R.id.miteam)
        d_dc.setOnClickListener {
            var dc_url="https://www.delhicapitals.in/"
            var i=Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(dc_url))

        }


    }

}