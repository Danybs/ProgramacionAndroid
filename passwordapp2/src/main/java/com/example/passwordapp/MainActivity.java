package com.example.passwordapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        b1=(Button)findViewById(R.id.b1);
    }
    public void lanzar(View view) {
            String v1 = et1.getText().toString();
            if (v1.equals("")) {
                Toast.makeText(this, "Contraseña vacia", Toast.LENGTH_LONG).show();
            }
            if (v1.equals("password")) {
                Intent i = new Intent(this, GrantAcess.class);
                startActivity(i);
            } else {
                Intent i = new Intent(this, Wrong.class);
                startActivity(i);
            }

        }

}
