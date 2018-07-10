package com.example.achalker.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.foods);
        ListView listFoods = (ListView) findViewById(R.id.list_foods);
        listFoods.setAdapter(listAdapter);
    }
}
