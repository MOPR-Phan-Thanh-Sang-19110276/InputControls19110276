package com.android.s19110276;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chBox_chocolate;
    private CheckBox chBox_sprinkles;
    private CheckBox chBox_crushedNuts;
    private CheckBox chBox_cherries;
    private CheckBox chBox_orioCookieCrumbles;

    private Button btn_showToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getControls();
        addEvents();
    }

    private void getControls() {
        chBox_chocolate = (CheckBox) findViewById(R.id.chBox_chocolate);
        chBox_sprinkles = (CheckBox) findViewById(R.id.chBox_sprinkles);
        chBox_crushedNuts = (CheckBox) findViewById(R.id.chBox_crushedNuts);
        chBox_cherries = (CheckBox) findViewById(R.id.chBox_cherries);
        chBox_orioCookieCrumbles = (CheckBox) findViewById(R.id.chBox_orioCookieCrumbles);

        btn_showToast = (Button) findViewById(R.id.btn_showToast);
    }

    private void addEvents() {
        btn_showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResult();
            }
        });
    }

    private void showResult() {
        String message = "";

        if (chBox_chocolate.isChecked())
            message += " " + chBox_chocolate.getText().toString();
        if (chBox_sprinkles.isChecked())
            message += " " + chBox_sprinkles.getText().toString();
        if (chBox_crushedNuts.isChecked())
            message += " " + chBox_crushedNuts.getText().toString();
        if (chBox_cherries.isChecked())
            message += " " + chBox_cherries.getText().toString();
        if (chBox_orioCookieCrumbles.isChecked())
            message += " " + chBox_orioCookieCrumbles.getText().toString();

        if (message != "")
            Toast.makeText(this, "Toppings:" + message, Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Toppings: (nothing)", Toast.LENGTH_SHORT).show();
    }
}