package com.example.appuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private Button b1;
    private String user1 = "Dani", user2 = "Victor";
    private String pass1 = "dani123", pass2 = "victor123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(null);
            }
        });
    }
    void check(View view){
        Intent i = new Intent(this, grantAcess.class);
        if((et1.getText().toString().equals(user1) && et2.getText().toString().equals(pass1))
                ||
                et2.getText().toString().equals(user2) && et2.getText().toString().equals(pass2)) {
            i.putExtra("usuario", et1.getText().toString());
            startActivity(i);
        }
        else {
            Toast.makeText(this , "Usuario incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}

