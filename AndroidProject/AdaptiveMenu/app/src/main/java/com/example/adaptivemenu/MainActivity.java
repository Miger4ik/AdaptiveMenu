package com.example.adaptivemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adaptivemenu.drinks.Beverage;
import com.example.adaptivemenu.drinks.Size;
import com.example.adaptivemenu.drinks.coffees.DarkRoast;
import com.example.adaptivemenu.drinks.coffees.Espresso;
import com.example.adaptivemenu.drinks.condiments.Chocolate;
import com.example.adaptivemenu.drinks.condiments.Milk;
import com.example.adaptivemenu.drinks.condiments.Soy;
import com.example.adaptivemenu.drinks.condiments.Whip;

public class MainActivity extends AppCompatActivity implements OnSelectedButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new FragmentAuthorizationSelection();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.frame_layout_main, fragment);
        ft.commit();
    }

    @Override
    public void onButtonSelected(int buttonId) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        switch (buttonId) {
            case R.id.button_sign_in:
            case R.id.button_sign_in2:
                Fragment fragment = new FragmentSignIn();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frame_layout_main, fragment);
                ft.commit();
                break;
            case R.id.button_sign_up:
            case R.id.button_sign_up2:
                Fragment fragment2 = new FragmentSignUp();
                FragmentTransaction fT2 = getSupportFragmentManager().beginTransaction();
                fT2.replace(R.id.frame_layout_main, fragment2);
                fT2.commit();
                break;
            default:
                Toast.makeText(this, "activity case default", Toast.LENGTH_SHORT)
                        .show();
        }
    }
}