package com.example.user.androidproject2k18;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class fifth extends AppCompatActivity {
  Button b1,b2;
    TextView t1;
    ImageView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b1 = (Button)findViewById(R.id.button17);
        b2 = (Button)findViewById(R.id.button18);
        w1 = (ImageView)findViewById(R.id.imageView3);
        t1 = (TextView)findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(fifth.this,third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(j,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b=(Bitmap)data.getExtras().get("data");
        w1.setImageBitmap(b);
    }
}
