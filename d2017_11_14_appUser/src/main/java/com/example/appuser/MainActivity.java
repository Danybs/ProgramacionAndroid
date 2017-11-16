package com.example.appuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private Button b1;
    private String user1 = "dani", user2 = "victor";
    private String pass1 = "dani", pass2 = "victor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(null);
            }
        });
    }
    void check(View view){
        Intent i = new Intent(this, grantAcess.class);

        String user = et1.getText().toString();
        String pw = et2.getText().toString();
    //no compara numeros
        if((user.equalsIgnoreCase(user1) && pw.equalsIgnoreCase(pass1)) || (user.equalsIgnoreCase(user2) && pw.equalsIgnoreCase(pass2))) {
            i.putExtra("usuario", user);
            startActivity(i);
        }
        else {
            Toast.makeText(this , "Usuario incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}

