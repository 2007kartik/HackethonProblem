package com.shubhamdeshmukh.hackethonproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    private EditText editTextNameSignUp;
    private EditText editTextEmailSignUp;
    private EditText editTextPasswordSignUp;
    private RadioGroup radioGroupUserType;
    private RadioButton radioButtonUser;
    private RadioButton radioButtonVendor;
    private Button buttonSignUp;
    private TextView textViewSignInLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextNameSignUp = findViewById(R.id.editTextNameSignUp);
        editTextEmailSignUp = findViewById(R.id.editTextEmailSignUp);
        editTextPasswordSignUp = findViewById(R.id.editTextPasswordSignUp);
        radioGroupUserType = findViewById(R.id.radioGroupUserType);
        radioButtonUser = findViewById(R.id.radioButtonUser);
        radioButtonVendor = findViewById(R.id.radioButtonVendor);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        textViewSignInLink = findViewById(R.id.textViewSignInLink);

        // Set onClickListener for the "Sign In" link
        textViewSignInLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignIn();
            }
        });

        // You'll add the logic for actual sign-up here later
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sign-up logic
            }
        });
    }

    private void navigateToSignIn() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}