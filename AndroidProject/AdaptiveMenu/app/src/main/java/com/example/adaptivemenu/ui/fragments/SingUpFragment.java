package com.example.adaptivemenu.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.adaptivemenu.R;
import com.example.adaptivemenu.ui.activitys.MainActivity;
import com.example.adaptivemenu.ui.activitys.MainMenuActivity;
import com.example.adaptivemenu.ui.interfaces.FragmentNavigationListener;

public class SingUpFragment extends Fragment {

    private View view;

    private EditText editTextUsername;
    private EditText editTextEmailAddress;
    private EditText editTextPassword;
    private EditText editTextRetypePassword;
    private Button buttonCreateAccount;
    private TextView textViewLogin;

    private FragmentNavigationListener fragmentNavigationListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sing_up, container, false);

        findAllViews();

        setOnClickListeners();

        return view;
    }

    private void findAllViews() {
        editTextUsername = view.findViewById(R.id.editTextUsername);
        editTextEmailAddress = view.findViewById(R.id.editTextEmailAddress);
        editTextPassword = view.findViewById(R.id.editTextPassword);
        editTextRetypePassword = view.findViewById(R.id.editTextRetypePassword);
        buttonCreateAccount = view.findViewById(R.id.buttonCreateAccount);
        textViewLogin = view.findViewById(R.id.textViewLogin);
    }

    private void setOnClickListeners() {
        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // просто перехід на коговний екран
                // TODO перед переходом на нове activity потрібно перевірити чи користувач коректно ввів дані та зареєструвався
                // TODO в системі якщо ні то сповістити його про це тостом
                Intent intent = new Intent(view.getContext(), MainMenuActivity.class);
                startActivity(intent);
                // закриваємо актівіті яке відповідає за реєстрацію та вхід
                // TODO перед закриттям activity потрібно зберегти дані входу користувача
                getActivity().finish();
            }
        });

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // переходимо на фрагмент логіну
                fragmentNavigationListener.onNavigateTo(MainActivity.FRAGMENT_SING_IN);
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            fragmentNavigationListener = (FragmentNavigationListener) context;
        } catch (Exception e) {
            Log.d("fragmentNavigationListener", "error");
        }

    }
}