package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class twelfth extends AppCompatActivity {
     TextView t1;
    Button b1;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth);
        t1 = (TextView)findViewById(R.id.textView9);
        b1 = (Button)findViewById(R.id.button33);
        w1 = (WebView)findViewById(R.id.webView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(twelfth.this,eleventh.class);
                startActivity(i);
                finish();
            }
        });
        if(eleventh.b==1) {
            w1.loadUrl("https://www.facebook.com/");
        }
        if(eleventh.b==2)
        {
            w1.loadUrl("https://twitter.com/");
        }
        if(eleventh.b==3)
        {
            w1.loadUrl("http://www.netcamp.in/");
        }
    }
}
