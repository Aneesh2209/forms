package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sections extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sections);
    }



    public void submitButtonHandler(View view) {
        // Is the button now checked?
        startActivity(new Intent(Sections.this,MainActivity.class));
    }
}