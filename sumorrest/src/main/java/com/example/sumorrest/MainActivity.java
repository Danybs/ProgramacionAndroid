package com.example.sumorrest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private RadioButton r1,r2;
    private Button b;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        r1 = (RadioButton) findViewById(R.id.rb1);
        r2 = (RadioButton) findViewById(R.id.rb2);
        b = (Button) findViewById(R.id.b1);
        t1 = (TextView) findViewById(R.id.tv1);
    }
    void operar(View view){
        int a = Integer.parseInt(e1.getText().toString());
        int b = Integer.parseInt(e2.getText().toString());
        String res;
        if(r1.isChecked()){
            res = String.valueOf(a+b);
            t1.setText(res);
        }
        if(r2.isChecked()){
            res = String.valueOf(a-b);
            t1.setText(res);
        }
    }

}
