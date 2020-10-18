package com.example.adaptivemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Size;
import com.example.adaptivemenu.drinks.coffees.DarkRoast;
import com.example.adaptivemenu.drinks.coffees.Espresso;
import com.example.adaptivemenu.drinks.condiments.Chocolate;
import com.example.adaptivemenu.drinks.condiments.Milk;
import com.example.adaptivemenu.drinks.condiments.Soy;
import com.example.adaptivemenu.drinks.condiments.Whip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}