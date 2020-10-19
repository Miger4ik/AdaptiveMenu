package com.example.adaptivemenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSignUp extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        EditText editTextUserName = view.findViewById(R.id.edit_text_user_name);
        EditText editTextEmail = view.findViewById(R.id.edit_text_email2);
        EditText editTextPassword = view.findViewById(R.id.edit_text_create_password);
        EditText editTextPasswordRetype = view.findViewById(R.id.edit_text_retype_password);
        Button button = view.findViewById(R.id.button_fragment_sign_up);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
                listener.onButtonSelected(view.getId());
            }
        });
        Button button2 = view.findViewById(R.id.button_sign_in2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
                listener.onButtonSelected(view.getId());
            }
        });
        return view;
    }
}
