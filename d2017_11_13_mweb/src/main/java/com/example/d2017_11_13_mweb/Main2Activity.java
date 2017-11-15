package com.example.d2017_11_13_mweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private WebView wb1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button) findViewById(R.id.b1);
        wb1 = (WebView) findViewById(R.id.wb1);

        Bundle bundle = getIntent().getExtras();
        wb1.setWebViewClient(new WebViewClient());
        wb1.loadUrl("http://"+bundle.getString("direccion"));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalizar(null);
            }
        });


    }
    public void finalizar(View view) {
        finish();
    }
}
