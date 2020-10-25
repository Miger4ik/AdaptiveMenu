package com.example.adaptivemenu.ui.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.adaptivemenu.R;
import com.example.adaptivemenu.ui.fragments.SingInFragment;
import com.example.adaptivemenu.ui.fragments.SingUpFragment;
import com.example.adaptivemenu.ui.interfaces.FragmentNavigationListener;

public class MainActivity extends AppCompatActivity implements FragmentNavigationListener {

    private SingInFragment singInFragment;
    private SingUpFragment singUpFragment;

    public static final int FRAGMENT_SING_IN = 0;
    public static final int FRAGMENT_SING_UP = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singInFragment = new SingInFragment();
        singUpFragment = new SingUpFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .add(R.id.container, singInFragment, "singInFragment")
                .commit();
    }

    @Override
    public void onNavigateTo(int fragment) {
        switch (fragment) {
            case FRAGMENT_SING_IN: {
                getSupportFragmentManager()
                        .beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .replace(R.id.container, singInFragment, "singInFragment")
                        .addToBackStack("singInFragment")
                        .commit();
                break;
            }

            case FRAGMENT_SING_UP: {
                getSupportFragmentManager()
                        .beginTransaction()
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .replace(R.id.container, singUpFragment, "singUpFragment")
                        .addToBackStack("singUpFragment")
                        .commit();
                break;
            }
        }
    }
}