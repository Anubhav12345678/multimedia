package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class ninth extends AppCompatActivity {
     Button b1;
    RadioButton w1,w2,w3,w4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        b1 = (Button)findViewById(R.id.button27);
        w1 = (RadioButton)findViewById(R.id.radioButton5);
        w2 = (RadioButton)findViewById(R.id.radioButton6);
        w3 = (RadioButton)findViewById(R.id.radioButton7);
        w4 = (RadioButton)findViewById(R.id.radioButton8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(w1.isChecked())
                {
                    eight.c++;
                }
                else
                {
                    eight.c--;
                }
                Intent i =new Intent(ninth.this,tenth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
