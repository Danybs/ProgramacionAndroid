package com.example.calculadora;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText v1;
    private EditText v2;
    private TextView mostrar;
    private TextView mostrar2;
    private TextView mostrar3;
    private TextView mostrar4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = (EditText) findViewById(R.id.valor1);
        v2 = (EditText) findViewById(R.id.valor2);
        mostrar = (TextView) findViewById(R.id.tv3);
        mostrar2 = (TextView) findViewById(R.id.tv4);
        mostrar3 = (TextView) findViewById(R.id.tv5);
        mostrar4 = (TextView) findViewById(R.id.tv6);
    }
    int decimal1;
    int decimal2;
    public void añadir0(View vista) {
        if (this.getCurrentFocus().getId() == v1.getId()) {
            v1.setText(v1.getText() + "0");
            decimal1 = Integer.parseInt(v1.getText().toString(), 2);
            mostrar3.setText("dec: "+decimal1);
        } else {
            v2.setText(v2.getText() + "0");
            decimal2 = Integer.parseInt(v2.getText().toString(), 2);
            mostrar4.setText("dec: "+decimal2);
        }
    }

    public void añadir1(View vista) {
        if (this.getCurrentFocus().getId() == v1.getId()) {
            v1.setText(v1.getText() + "1");
            decimal1 = Integer.parseInt(v1.getText().toString(), 2);
            mostrar3.setText("dec: "+decimal1);
        } else {
            v2.setText(v2.getText() + "1");
            decimal2 = Integer.parseInt(v2.getText().toString(), 2);
            mostrar4.setText("dec: "+decimal2);
        }
    }

    public void reset(View vista) {
        v1.setText(null);
        v2.setText(null);
        mostrar.setText(null);
        mostrar.setTextColor(Color.parseColor("#AAAAAA"));
        mostrar2.setTextColor(Color.parseColor("#AAAAAA"));
        mostrar2.setText(null);
        mostrar3.setText(null);
        mostrar4.setText(null);
        v1.requestFocus();
    }

    public void sumar(View vista) {
        try {
            int decimal1 = Integer.parseInt(v1.getText().toString(), 2);
            int decimal2 = Integer.parseInt(v2.getText().toString(), 2);
            int res = decimal1 + decimal2;
            String binario = Integer.toBinaryString(res);
        /*Toast.makeText(this, "El resultado de la suma es: " + binario, Toast.LENGTH_SHORT).show();*
            mostrar.setText("bin: " + binario);
            mostrar2.setText("dec: " + res);
        } catch (Exception e) {
            mostrar.setText(e.getMessage());
            mostrar.setTextColor(Color.parseColor("#B71C1C"));
        }
    }

    public void resta(View vista) {
        try {
            if (Integer.parseInt(v1.getText().toString()) >= Integer.parseInt(v2.getText().toString())) {
                int decimal1 = Integer.parseInt(v1.getText().toString(), 2);
                int decimal2 = Integer.parseInt(v2.getText().toString(), 2);
                int res = decimal1 - decimal2;
                String binario = Integer.toBinaryString(res);
                mostrar.setText("bin: " + binario);
                mostrar2.setText("dec: " + res);
            } else {
                mostrar.setText("ERROR");
                mostrar.setTextColor(Color.parseColor("#B71C1C"));
            }
        } catch (Exception e) {
            mostrar.setText(e.getMessage());
            mostrar.setTextColor(Color.parseColor("#B71C1C"));
        }
    }

    public void division(View vista) {
        try {
            if (Integer.parseInt(v2.getText().toString()) != 0) {
                int decimal1 = Integer.parseInt(v1.getText().toString(), 2);
                int decimal2 = Integer.parseInt(v2.getText().toString(), 2);
                int res = decimal1 / decimal2;
                String binario = Integer.toBinaryString(res);
                mostrar.setText("bin: " + binario);
                mostrar2.setText("dec: " + res);
            } else {
                mostrar.setText("ERROR");
                mostrar.setTextColor(Color.parseColor("#B71C1C"));
            }
        } catch (Exception e) {
            mostrar.setText(e.getMessage());
            mostrar.setTextColor(Color.parseColor("#B71C1C"));
        }
    }

    public void multiplicar(View vista) {
        try {
            int decimal1 = Integer.parseInt(v1.getText().toString(), 2);
            int decimal2 = Integer.parseInt(v2.getText().toString(), 2);
            int res = decimal1 * decimal2;
            String binario = Integer.toBinaryString(res);
            mostrar.setText("bin: " + binario);
            mostrar2.setText("dec: " + res);
        } catch (Exception e){
            mostrar.setText(e.getMessage());
            mostrar.setTextColor(Color.parseColor("#B71C1C"));
        }
    }
}//end
