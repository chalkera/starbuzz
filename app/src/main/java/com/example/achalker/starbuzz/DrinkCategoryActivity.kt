package com.example.achalker.starbuzz

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.achalker.starbuzz.DrinkActivity
import com.example.achalker.starbuzz.model.Drink

class DrinkCategoryActivity : AppCompatActivity() {
    companion object {
        private const val EXTRA_DRINK_NAME = "EXTRA_DRINK_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_category)

        val drinkNames = Drink.drinks.map { it.name }
        val listAdapter = ArrayAdapter(this, R.layout.list_item, drinkNames)

        val listDrinks = findViewById<View>(R.id.list_drinks) as ListView
        listDrinks.adapter = listAdapter

        val itemClickListener = OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this@DrinkCategoryActivity, DrinkActivity::class.java)
            intent.putExtra(EXTRA_DRINK_NAME, Drink.drinks[position].name)
            startActivity(intent)
        }
        listDrinks.onItemClickListener = itemClickListener
    }
}