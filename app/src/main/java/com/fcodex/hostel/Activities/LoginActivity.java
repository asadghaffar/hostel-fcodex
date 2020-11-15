package com.fcodex.hostel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.fcodex.hostel.R;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    private TextView forgetPassword;
    private MaterialButton signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        id();
        onClick();


    }

    private void id() {
        forgetPassword = findViewById(R.id.forgetPassword);
        signUpButton = findViewById(R.id.signUpButton);
    }

    private void onClick() {
        forgetPassword.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
            startActivity(intent);

        });

        signUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);

        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}