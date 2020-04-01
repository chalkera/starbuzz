package com.example.achalker.starbuzz

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemClickListener = OnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> {
                    val intent = Intent(this@MainActivity, DrinkCategoryActivity::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(this@MainActivity, FoodCategoryActivity::class.java)
                    startActivity(intent)
                }
                2 -> {
                    val intent = Intent(this@MainActivity, StoreCategoryActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        val listView = findViewById<View>(R.id.list_options) as ListView
        listView.onItemClickListener = itemClickListener
    }
}