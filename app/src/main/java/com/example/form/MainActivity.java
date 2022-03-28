package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    boolean symptoms = false;
    boolean covid = false;

    public void covidHandler(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.yesForCovidPositive:
                if (checked)
                    covid = true;

                    break;
            case R.id.noForCovidPositive:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void otherSymptomsHandler(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.yesForOtherSymptoms:
                if (checked)
                    symptoms = true;
                    break;
            case R.id.noForOtherSymptoms:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void feverHandler(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.yesForFever:
                if (checked)
                    symptoms = true;
                    break;
            case R.id.noForFever:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void soreThroatHandler(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.yesForSoreThroat:
                if (checked)
                    symptoms = true;
                    break;
            case R.id.noForSoreThroat:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void submitButtonHandler(View view) {
        // Is the button now checked?
            startActivity(new Intent(MainActivity.this,SafetyMeasures.class));
        }


}

//class covidCheck extends Application {
//
//    private Boolean covid;
//
//    public Boolean getState(){
//        return covid;
//    }
//    public void setState(Boolean s){
//        covid = s;
//    }
//}