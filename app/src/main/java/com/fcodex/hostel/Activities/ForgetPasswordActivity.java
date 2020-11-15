package com.fcodex.hostel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.fcodex.hostel.R;
import com.google.android.material.button.MaterialButton;

public class ForgetPasswordActivity extends AppCompatActivity {

    private ImageView backImage;
    private MaterialButton resetPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        getSupportActionBar().hide();

        id();
        onClick();

    }

    private void id() {
        backImage = findViewById(R.id.backImage);
        resetPasswordButton = findViewById(R.id.resetPasswordButton);
    }

    private void onClick() {
        backImage.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });

        resetPasswordButton.setOnClickListener(v -> {
            Intent intent = new Intent(ForgetPasswordActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}