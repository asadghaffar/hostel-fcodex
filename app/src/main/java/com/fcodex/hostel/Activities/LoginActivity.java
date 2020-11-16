package com.fcodex.hostel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import com.fcodex.hostel.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText enterLoginEmail;
    private TextInputEditText enterLoginPassword;
    private TextView loginForgetPassword;
    private MaterialButton loginButton;
    private MaterialButton loginSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Objects.requireNonNull(getSupportActionBar()).hide();

        id();
        onClick();

    }

    private void id() {
        enterLoginEmail = findViewById(R.id.enterLoginEmail);
        enterLoginPassword = findViewById(R.id.enterLoginPassword);
        loginForgetPassword = findViewById(R.id.loginForgetPassword);
        loginButton = findViewById(R.id.loginButton);
        loginSignUpButton = findViewById(R.id.loginSignUpButton);
    }

    private void onClick() {
        loginForgetPassword.setOnClickListener(v -> {
            Intent intent = new Intent(this, ForgetPasswordActivity.class);
            startActivity(intent);
        });

        loginSignUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });

        loginButton.setOnClickListener(v -> validation());
        
    }

    private void validation() {
        String stringEnterLoginEmail = Objects.requireNonNull(enterLoginEmail.getText()).toString().trim();
        String stringEnterLoginPassword = Objects.requireNonNull(enterLoginPassword.getText()).toString().trim();
        
        if (stringEnterLoginEmail.length() == 0 || stringEnterLoginPassword.length() == 0)
        {
            Toast.makeText(this, "Fill the Required Fields", Toast.LENGTH_SHORT).show();
        } else
        {
            Toast.makeText(this, "Successfully login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        
    }

    

}