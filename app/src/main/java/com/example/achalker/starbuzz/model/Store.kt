package com.example.achalker.starbuzz.model

class Store private constructor(val name: String, val location: String) {
    companion object {
        @JvmField
        val stores = arrayOf(
                Store("Home", "Right in your backdoor"),
                Store("Near your work", "Still convenient"),
                Store("Clearly out of the way", "You must be bored to drive this far")
        )
    }
}