package com.fcodex.hostel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.fcodex.hostel.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    private ImageView backImage;

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
    }

    private void onClick() {
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });
    }
}