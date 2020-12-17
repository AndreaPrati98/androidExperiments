package com.example.course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URI
import java.nio.file.Paths

class MainActivity : AppCompatActivity() {

    private lateinit var listId: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initList()
        chVeget.setOnClickListener {
            pickVegetable()
        }

        pickVegetable()

        chActivity.setOnClickListener {

            startActivity(Intent(this, SecondActivity::class.java))

        }
    }

    private fun pickVegetable() {
        imageView2.setImageResource(listId.random())
    }

    private fun initList() {
        listId = listOf(
            R.drawable.icon_artichoke_svg,
            R.drawable.icon_asparagus_svg,
            R.drawable.icon_beans_svg,
            R.drawable.icon_beep_svg,
            R.drawable.icon_bell_pepper_svg,
            R.drawable.icon_broccoli_svg,
            R.drawable.icon_cabbage_svg,
            R.drawable.icon_carrot_svg,
            R.drawable.icon_cauliflower_svg,
            R.drawable.icon_chili_pepper_svg,
            R.drawable.icon_date_fruit_svg,
            R.drawable.icon_cucumber_svg,
            R.drawable.icon_eggplant_svg,
            R.drawable.icon_garlic_svg,
            R.drawable.icon_peas_svg,
            R.drawable.icon_pepper_svg,
            R.drawable.icon_potato_svg,
            R.drawable.icon_pumpkin_svg,
            R.drawable.icon_radish_svg,
            R.drawable.icon_red_onion_svg,
            R.drawable.icon_salad_svg,
            R.drawable.icon_spinach_svg,
            R.drawable.icon_turnip_svg
        )
    }

}