package com.example.calculadorav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1,et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et2=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        String []opciones={"SUMAR","RESTAR","MULTIPLICAR","DIVIDIR"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }
    //Este método se ejecutará cuando se presione el boton

    public void operar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        String resu;
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        String selec=spinner1.getSelectedItem().toString();
        if(selec.equals("SUMAR")) {
            int suma=n1+n2;
            resu=String.valueOf(suma);
            tv3.setText(resu);
        }
        if(selec.equals("RESTAR")) {
            int resta=n1-n2;
            resu=String.valueOf(resta);
            tv3.setText(resu);
        }
        if(selec.equals("MULTIPLICAR")) {
            int multiplicar=n1*n2;
            resu=String.valueOf(multiplicar);
            tv3.setText(resu);
        }
        if(selec.equals("DIVIDIR")) {
            if(n2!=0) {
                int dividir = n1 / 2;
                resu = String.valueOf(dividir);
                tv3.setText(resu);
            }
            else if(n2==0) {
                tv3.setText("NO /0");
            }
        }
    }
}

