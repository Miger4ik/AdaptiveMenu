package com.example.adaptivemenu.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adaptivemenu.R;

public class MainActivity extends AppCompatActivity {

    // виносимо сюди всі змінні які стосуються зовнішнього вигляду
    // а також всі змінні які будуть потрібні за межами методу onCreate
    private Button mainMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // робимо логічний ентер над викликом методу та після нього
        findAllViews();

        setOnClickListeners();
    }

    // для зручності можна вивести знаходження всіх візуальних елементів
    // в окермий метод так onCreate не буде забиватись лишнім кодом
    private void findAllViews () {
        mainMenuButton = findViewById(R.id.mainMenuButton);
    }

    // так само для зручності виносимо присвоєння всіх onClickListeners
    // в окремий метод
    private void setOnClickListeners() {
        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}