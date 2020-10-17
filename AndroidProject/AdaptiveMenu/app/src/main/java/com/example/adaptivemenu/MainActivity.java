package com.example.adaptivemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Size;
import com.example.adaptivemenu.drinks.coffees.DarkRoast;
import com.example.adaptivemenu.drinks.condiments.Chocolate;
import com.example.adaptivemenu.drinks.condiments.Milk;
import com.example.adaptivemenu.drinks.condiments.Soy;
import com.example.adaptivemenu.drinks.condiments.Whip;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // створюємо напій та вказуємо ціни на різні порції
        Beverage coffee = new DarkRoast(1d, 2d, 3d);
        // задаємо розмір
        coffee.setSize(Size.LARGE);

        // додаємо приправи
        coffee = new Chocolate(coffee, 0.1d, 0.2d, 0.3d);
        coffee = new Milk(coffee, 0.1d, 0.2d, 0.3d);
        coffee = new Soy(coffee, 0.1d, 0.2d, 0.3d);
        coffee = new Whip(coffee, 0.1d, 0.2d, 0.3d);

        // округлюємо ціну до двох знаків після коми
        double cost = Double.parseDouble(String.format("%.2f", coffee.cost()));

        // виводимо результат
        textView.setText(coffee.getDescription() + " price = " + cost);
    }
}