package com.fcodex.hostel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.fcodex.hostel.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class ContactDetails extends AppCompatActivity {

    private MaterialButton submit;
    private TextView hostelName;
    private TextView hostelAddress;
    private TextInputEditText enterName;
    private TextInputEditText enterEmail;
    private TextInputEditText enterNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        id();
        onclick();

    }


    private void id() {
        hostelName = findViewById(R.id.hostelName);
        hostelAddress = findViewById(R.id.hostelAddress);
        enterName = findViewById(R.id.enterName);
        enterEmail = findViewById(R.id.enterEmail);
        enterNumber = findViewById(R.id.enterNumber);
        submit = findViewById(R.id.submit);
    }

    private void onclick() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContactDetails.this, MainActivity.class);
                // Clear the back activity
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringHostelName = hostelName.getText().toString().trim();
                String stringHostelAddress = hostelAddress.getText().toString().trim();
                String stringEnterName = enterName.getText().toString().trim();
                String stringEnterEmail = enterEmail.getText().toString().trim();
                String stringEnterNumber = enterNumber.getText().toString().trim();

                if (stringEnterName.isEmpty()) {
                    enterName.setError("Enter Name");
                } else if (stringEnterEmail.isEmpty()) {
                    enterEmail.setError("Enter Email");
                } else if (stringEnterNumber.isEmpty()) {
                    enterNumber.setError("Enter Number");
                } else {
                }
            }
        });

    }
}