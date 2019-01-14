package com.example.user.androidproject2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.androidproject2k18.R;

public class fourth extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    EditText e1,e2;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1 = (Button)findViewById(R.id.button10);
        b2 = (Button)findViewById(R.id.button11);
        b3 = (Button)findViewById(R.id.button12);
        b4 = (Button)findViewById(R.id.button13);
        b5 = (Button)findViewById(R.id.button14);
        b6 = (Button)findViewById(R.id.button15);
        b7 = (Button)findViewById(R.id.button16);
        e1 = (EditText)findViewById(R.id.editText8);
        e2 = (EditText)findViewById(R.id.editText9);
        t1 = (TextView)findViewById(R.id.textView);
        t2 = (TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(fourth.this,third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(fourth.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 + f2;
                    String s3 = Float.toString(f3);
                    t2.setText(s3);
                    Toast.makeText(fourth.this, "OUTPUT IS " + s3, Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(fourth.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 - f2;
                    String s3 = Float.toString(f3);
                    t2.setText(s3);
                    Toast.makeText(fourth.this, "OUTPUT IS " + s3, Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(fourth.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 * f2;
                    String s3 = Float.toString(f3);
                    t2.setText(s3);
                    Toast.makeText(fourth.this, "OUTPUT IS " + s3, Toast.LENGTH_SHORT).show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(fourth.this, "Fill all", Toast.LENGTH_SHORT).show();
                }
                else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 / f2;
                    String s3 = Float.toString(f3);
                    t2.setText(s3);
                    Toast.makeText(fourth.this, "OUTPUT IS " + s3, Toast.LENGTH_SHORT).show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(fourth.this, "First Fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(fourth.this, "It's written there above", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("");
                e1.setText("");
                e2.setText("");
            }
        });
    }
}
