package com.example.achalker.starbuzz.model

class Food private constructor(val name: String, val description: String) {
    companion object {
        @JvmField
        val foods = arrayOf(
                Food("Croissant", "Light fluffy pastry"),
                Food("Banana Nut Bread", "Walnut warm slice of bread"),
                Food("Muffin", "Comfort food")
        )
    }
}