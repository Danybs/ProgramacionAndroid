package com.example.appuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class grantAcess extends AppCompatActivity {
    private TextView tv1;
    private EditText et1;
    private Button b1,b2;
    private WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grant_acess);

        tv1 = (TextView) findViewById(R.id.tv1);
        et1 = (EditText) findViewById(R.id.et1);
        wb1 = (WebView) findViewById(R.id.wb1);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);

        final Bundle bundle = getIntent().getExtras();

        tv1.setText("Bienvenido: "+bundle.getString("usuario"));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wb1.loadUrl("http://"+et1.getText());
                wb1.setWebViewClient(new WebViewClient());

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    void fin(View view){
        finish();
    }
}
