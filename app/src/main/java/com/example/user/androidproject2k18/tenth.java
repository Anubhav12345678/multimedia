package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tenth extends AppCompatActivity {
      TextView t1;
    Button b1;
    RadioButton w1,w2,w3,w4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
     b1 = (Button)findViewById(R.id.button28);
        t1 = (TextView)findViewById(R.id.textView7);
        w1 = (RadioButton)findViewById(R.id.radioButton9);
        w2 = (RadioButton)findViewById(R.id.radioButton10);
        w3 = (RadioButton)findViewById(R.id.radioButton11);
        w4 = (RadioButton)findViewById(R.id.radioButton12);
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
                Intent i = new Intent(tenth.this,eleventh.class);
                startActivity(i);
                finish();
            }
        });



    }
}
