package com.shubhamdeshmukh.hackethonproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    private EditText editTextEmailSignIn;
    private EditText editTextPasswordSignIn;
    private Button buttonSignIn;
    private TextView textViewSignUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmailSignIn = findViewById(R.id.editTextEmailSignIn);
        editTextPasswordSignIn = findViewById(R.id.editTextPasswordSignIn);
        buttonSignIn = findViewById(R.id.buttonSignIn);
        textViewSignUpLink = findViewById(R.id.textViewSignUpLink);

        // Set onClickListener for the "Sign Up" link
        textViewSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignUp();
            }
        });

        // You'll add the logic for actual sign-in here later
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sign-in logic
            }
        });
    }

    private void navigateToSignUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}