package com.example.user.androidproject2k18;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class second extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3,e4,e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button4);
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);
        e3 = (EditText)findViewById(R.id.editText5);
        e4 = (EditText)findViewById(R.id.editText6);
        e5 = (EditText)findViewById(R.id.editText7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(second.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals(""))
                {
                    Toast.makeText(second.this, "All Fields Required", Toast.LENGTH_SHORT).show();
                }
                else {
                    SQLiteDatabase data = openOrCreateDatabase("coke", MODE_PRIVATE, null);
                    data.execSQL("create table if not exists student(name varchar,password varchar,email varchar,city varchar,phone int)");
                    String s6 = "select * from student where name = '" + s1 + "' and password = '" + s2 + "'";
                    Cursor c = data.rawQuery(s6, null);
                    if (c.getCount() > 0) {
                        Toast.makeText(second.this, "Users Exist", Toast.LENGTH_SHORT).show();
                    } else {
                        data.execSQL("insert into student values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')");
                        Toast.makeText(second.this, "NEW ACCOUNT CREATED", Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(second.this, MainActivity.class);
                        startActivity(j);
                        finish();
                    }
                }
            }
        });
    }
}
