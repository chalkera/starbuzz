package com.example.achalker.starbuzz;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKED = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKED);
        Drink drink = Drink.drinks[drinkId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView image = (ImageView)findViewById(R.id.photo);
        image.setImageResource(drink.getImageResourceId());
        image.setContentDescription(drink.getName());
    }
}
