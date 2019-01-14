package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class eight extends AppCompatActivity {
    Button b1,b2;
    RadioButton w1,w2,w3,w4;
    TextView t1;
    static  int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c=0;
        setContentView(R.layout.activity_eight);
        b1 = (Button)findViewById(R.id.button25);
        b2 = (Button)findViewById(R.id.button26);
        t1 = (TextView)findViewById(R.id.textView5);
        w1 = (RadioButton)findViewById(R.id.radioButton);
        w2 = (RadioButton)findViewById(R.id.radioButton2);
        w3 = (RadioButton)findViewById(R.id.radioButton3);
        w4 = (RadioButton)findViewById(R.id.radioButton4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(eight.this,third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent j = new Intent(eight.this,ninth.class);
                startActivity(j);
                finish();*/
                if(w1.isChecked())
                {
                    c++;
                }
                else
                {
                    c--;
                }
                Intent j = new Intent(eight.this,ninth.class);
                startActivity(j);
                finish();
            }
        });
    }
}
