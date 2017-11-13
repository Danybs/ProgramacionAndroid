package com.example.d2017_11_13_mweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        b1 = (Button) findViewById(R.id.b1);
    }
    public void ejecutar(View view){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

}
