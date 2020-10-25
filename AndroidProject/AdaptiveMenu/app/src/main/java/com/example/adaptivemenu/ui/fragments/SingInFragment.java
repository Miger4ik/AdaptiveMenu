package com.example.adaptivemenu.ui.fragments;

import android.app.Activity;
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
import android.widget.TextView;

import com.example.adaptivemenu.R;
import com.example.adaptivemenu.ui.activitys.MainActivity;
import com.example.adaptivemenu.ui.activitys.MainMenuActivity;
import com.example.adaptivemenu.ui.interfaces.FragmentNavigationListener;

public class SingInFragment extends Fragment {

    private View view;

    private TextView forgotPasswordTextView;
    private TextView signUpTextView;
    private Button loginButton;

    private FragmentNavigationListener fragmentNavigationListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sing_in, container, false);

        findAllViews();

        setOnClickListeners();

        return view;
    }

    private void findAllViews() {
        forgotPasswordTextView = view.findViewById(R.id.textForgotPassword);
        signUpTextView = view.findViewById(R.id.textSignUp);
        loginButton = view.findViewById(R.id.button_login);
    }

    private void setOnClickListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // просто перехід на коговний екран
                // TODO перед переходом на нове activity потрібно перевірити чи користувач коректно ввів дані та зайшов
                // TODO в систему якщо ні то сповістити його про це тостом
                Intent intent = new Intent(view.getContext(), MainMenuActivity.class);
                startActivity(intent);
                // закриваємо актівіті яке відповідає за реєстрацію та вхід
                // TODO перед закриттям activity потрібно зберегти дані входу користувача
                getActivity().finish();
            }
        });

        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO або зробити фрагмент з можливістю відновлення паролю або забрати цю можливість
            }
        });

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // переходимо на фрагмент реєстрації
                fragmentNavigationListener.onNavigateTo(MainActivity.FRAGMENT_SING_UP);
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