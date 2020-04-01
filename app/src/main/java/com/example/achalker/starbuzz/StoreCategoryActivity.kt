package com.example.achalker.starbuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.achalker.starbuzz.model.Store

class StoreCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_category)
        val listAdapter = ArrayAdapter(this, R.layout.list_item, Store.stores.map { it.name })
        val listStores = findViewById<View>(R.id.list_stores) as ListView
        listStores.adapter = listAdapter
    }
}