package com.example.adaptivemenu.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.adaptivemenu.R;

public class SingInFragment extends Fragment {

    private View view;

    private TextView forgotPasswordTextView;
    private TextView signUpTextView;
    private TextView dontHaveAccountTextView;

    private Button loginButton;

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
        dontHaveAccountTextView = view.findViewById(R.id.textDontHaveAccount);
        loginButton = view.findViewById(R.id.button_login);
    }

    private void setOnClickListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        dontHaveAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}