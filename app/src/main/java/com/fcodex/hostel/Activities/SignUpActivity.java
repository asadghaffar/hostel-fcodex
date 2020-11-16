package com.fcodex.hostel.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fcodex.hostel.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class SignUpActivity extends AppCompatActivity {

    private TextInputEditText enterNameSignUp;
    private TextInputEditText enterEmailSignUp;
    private TextInputEditText enterNumberSignUp;
    private TextInputEditText enterPasswordSignUp;
    private TextInputEditText enterConfirmPasswordSignUp;
    private MaterialButton signIn;
    private ImageView backImageSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();
        id();
        onClick();

    }

    private void onClick() {

        backImageSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
        signIn.setOnClickListener(v -> {

            String stringEnterNameSignUp = enterNameSignUp.getText().toString().trim();
            String stringEnterEmailSignUp = enterEmailSignUp.getText().toString().trim();
            String stringEnterNumberSignUp = enterNumberSignUp.getText().toString().trim();
            String stringEnterPasswordSignUp = enterPasswordSignUp.getText().toString().trim();
            String stringEnterConfirmPasswordSignUp = enterConfirmPasswordSignUp.getText().toString().trim();

            if (stringEnterPasswordSignUp.equals(stringEnterConfirmPasswordSignUp)) {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
            } else Toast.makeText(this, "Password is not matched", Toast.LENGTH_SHORT).show();
                if (stringEnterNameSignUp.length() == 0 && stringEnterEmailSignUp.length() == 0 && stringEnterNumberSignUp.length() == 0
                            && stringEnterPasswordSignUp.length() == 0 && stringEnterConfirmPasswordSignUp.length() == 0) {
                enterNameSignUp.setError("Enter Name");
                enterEmailSignUp.setError("Enter Email");
                enterNumberSignUp.setError("Enter Number");
                enterPasswordSignUp.setError("Enter Password");
                enterConfirmPasswordSignUp.setError("Enter Confirm Password");
            }
        });


    }

    private void id() {
        enterNameSignUp = findViewById(R.id.enterNameSignUp);
        enterEmailSignUp = findViewById(R.id.enterEmailSignUp);
        enterNumberSignUp = findViewById(R.id.enterNumberSignUp);
        enterPasswordSignUp = findViewById(R.id.enterPasswordSignUp);
        enterConfirmPasswordSignUp = findViewById(R.id.enterConfirmPasswordSignUp);
        signIn = findViewById(R.id.signIn);
        backImageSignUp = findViewById(R.id.backImageSignUp);
    }
}