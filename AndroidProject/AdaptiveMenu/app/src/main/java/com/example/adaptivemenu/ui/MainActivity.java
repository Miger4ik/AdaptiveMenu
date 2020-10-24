package com.example.adaptivemenu.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.adaptivemenu.R;
import com.example.adaptivemenu.ui.fragments.SingInFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private SingInFragment signInFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentTransaction = fragmentManager.beginTransaction();

        signInFragment = new SingInFragment();

        fragmentTransaction.add(R.id.container, signInFragment);

        fragmentTransaction.commit();
    }

}