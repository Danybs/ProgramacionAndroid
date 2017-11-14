package com.example.d2017_11_13_mweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
    private WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wb1 = (WebView) findViewById(R.id.wb1);

        Bundle bundle = getIntent().getExtras();
        wb1.loadUrl("http://"+bundle.getString("direccion"));

    }
    public void finalizar(View view) {
        finish();
    }
}
