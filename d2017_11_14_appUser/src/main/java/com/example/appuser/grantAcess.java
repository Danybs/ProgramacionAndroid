package com.example.appuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class grantAcess extends AppCompatActivity {
    private TextView tv1,tv2;
    private Button b1;
    private WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grant_acess);

        Bundle bundle = getIntent().getExtras();
        wb1 = (WebView) findViewById(R.id.wb1);
        tv1.setText("Bienvenido: "+bundle.getString("usuario"));
        wb1.loadUrl("http://"+gettext);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fin(null);
            }
        });
    }

    void fin(View view){
        finish();
    }
}
