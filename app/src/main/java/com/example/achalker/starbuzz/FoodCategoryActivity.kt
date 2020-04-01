package com.example.achalker.starbuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.achalker.starbuzz.model.Food

class FoodCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_category)
        val listAdapter = ArrayAdapter(this, R.layout.list_item, Food.foods.map { it.name })
        val listFoods = findViewById<View>(R.id.list_foods) as ListView
        listFoods.adapter = listAdapter
    }
}