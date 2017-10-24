package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class buttonTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_test);
    }

    public void llamada(View view) {
        Toast.makeText(this, "Efectuando llamada...", Toast.LENGTH_LONG).show();
    }
    public void rLlamada(View view) {
        Toast.makeText(this, "Colgando la llamada...", Toast.LENGTH_LONG).show();
    }
}
