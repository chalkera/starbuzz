package com.example.achalker.starbuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.example.achalker.starbuzz.model.Drink

class DrinkActivity : AppCompatActivity() {

    companion object {
        private const val EXTRA_DRINK_NAME = "EXTRA_DRINK_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        val drinkName = intent.extras?.getString(EXTRA_DRINK_NAME, "")!!
        val drink = Drink.drinks.find { it.name == drinkName }

        val name = findViewById<TextView>(R.id.name)
        name.text = drink?.name

        val description = findViewById<TextView>(R.id.description)
        description.text = drink?.description

        val image = findViewById<ImageView>(R.id.photo)
        drink?.imageResourceId?.let { image.setImageResource(it) }
        image.contentDescription = drink?.name
    }
}