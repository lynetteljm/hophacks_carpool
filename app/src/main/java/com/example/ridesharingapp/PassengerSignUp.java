package com.example.ridesharingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PassengerSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_sign_up);

    }

    public void LaunchChooseRoutes(View view) {
        Intent intent = new Intent(this, ChooseRoutes.class);
        startActivity(intent);
    }
}
