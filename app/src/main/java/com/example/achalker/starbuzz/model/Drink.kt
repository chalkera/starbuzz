package com.example.achalker.starbuzz.model

import com.example.achalker.starbuzz.R

class Drink private constructor(val name: String, val description: String, val imageResourceId: Int) {
    companion object {
        @JvmField
        val drinks = arrayOf(
                Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
                Drink("Cappuccino", "Espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
                Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
        )
    }

}