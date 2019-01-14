package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class seventh extends AppCompatActivity {
        Button b1,b2,b3;
    ImageView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        b1 = (Button)findViewById(R.id.button22);
        b2 = (Button)findViewById(R.id.button23);
        b3 = (Button)findViewById(R.id.button24);
        w1 = (ImageView)findViewById(R.id.imageView4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seventh.this,third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(seventh.this,eight.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(seventh.this,thirteenth.class);
                startActivity(k);
                finish();
            }
        });

    }
}
