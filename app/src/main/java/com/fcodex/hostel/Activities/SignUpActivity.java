package com.fcodex.hostel.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fcodex.hostel.R;
import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class SignUpActivity extends AppCompatActivity {

    private TextInputEditText enterNameSignUp;
    private TextInputEditText enterEmailSignUp;
    private TextInputEditText enterNumberSignUp;
    private TextInputEditText enterPasswordSignUp;
    private TextInputEditText enterConfirmPasswordSignUp;
    private MaterialButton signIn;
    private ImageView backImageSignUp;
    private SpinKitView spinLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Objects.requireNonNull(getSupportActionBar()).hide();
        id();
        onClick();

    }

    private void onClick() {

        backImageSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
        signIn.setOnClickListener(v -> validation());

    }

    private void validation() {
        String stringEnterNameSignUp = Objects.requireNonNull(enterNameSignUp.getText()).toString().trim();
        String stringEnterEmailSignUp = Objects.requireNonNull(enterEmailSignUp.getText()).toString().trim();
        String stringEnterNumberSignUp = Objects.requireNonNull(enterNumberSignUp.getText()).toString().trim();
        String stringEnterPasswordSignUp = Objects.requireNonNull(enterPasswordSignUp.getText()).toString().trim();
        String stringEnterConfirmPasswordSignUp = Objects.requireNonNull(enterConfirmPasswordSignUp.getText()).toString().trim();

        if (stringEnterNameSignUp.length() == 0 || stringEnterEmailSignUp.length() == 0 || stringEnterNumberSignUp.length() == 0 ||
                stringEnterPasswordSignUp.length() == 0 || stringEnterConfirmPasswordSignUp.length() == 0) {
            Toast.makeText(this, "Fill the Required Fields", Toast.LENGTH_SHORT).show();
        } else if (!stringEnterPasswordSignUp.equals(stringEnterConfirmPasswordSignUp)) {
            Toast.makeText(this, "Password Not Matched", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Password matched", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
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