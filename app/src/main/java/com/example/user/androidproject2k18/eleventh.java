package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eleventh extends AppCompatActivity {
    Button b29,b30,b31,b32;
    TextView t1;
    static  int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        t1 = (TextView)findViewById(R.id.textView8);
        b29 = (Button)findViewById(R.id.button29);
        b30 = (Button)findViewById(R.id.button30);
        b31 = (Button)findViewById(R.id.button31);
        b32 = (Button)findViewById(R.id.button32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(eleventh.this,third.class);
                startActivity(i);
                finish();
            }
        });
        String s1 = Integer.toString(eight.c);
        t1.setText(s1);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=1;
                Intent j = new Intent(eleventh.this,twelfth.class);
                startActivity(j);
                finish();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=2;
                Intent k = new Intent(eleventh.this,twelfth.class);
                startActivity(k);
                finish();
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=3;
                Intent u = new Intent(eleventh.this,twelfth.class);
                startActivity(u);
                finish();
            }
        });
    }
}
