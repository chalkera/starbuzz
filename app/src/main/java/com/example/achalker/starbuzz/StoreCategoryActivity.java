package com.example.achalker.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StoreCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_category);

        ArrayAdapter<Store> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Store.stores);
        ListView listStores = (ListView) findViewById(R.id.list_stores);
        listStores.setAdapter(listAdapter);
    }
}
