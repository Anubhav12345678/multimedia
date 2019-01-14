package com.example.user.androidproject2k18;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class sixth extends AppCompatActivity {
   Button b1,b2,b3,b35,b36;
    TextView t1;
    ImageView w1;
    MediaPlayer mp1,mp2,mp3,mp4;
    int cc1,cc2,cc3,cc4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        cc1=cc2=cc3=cc4=0;
        b1 = (Button)findViewById(R.id.button19);
        b2 = (Button)findViewById(R.id.button20);
        b3 = (Button)findViewById(R.id.button21);
        b35 = (Button)findViewById(R.id.button35);
        b36 = (Button)findViewById(R.id.button36);
        w1 = (ImageView)findViewById(R.id.imageView2);
        t1 = (TextView)findViewById(R.id.textView4);
        mp1 = MediaPlayer.create(this,R.raw.a);
        mp2 = MediaPlayer.create(this,R.raw.w);
        mp3 = MediaPlayer.create(this,R.raw.b);
        mp4 = MediaPlayer.create(this,R.raw.u);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.pause();
                mp2.pause();
                mp3.pause();
                mp4.pause();
                Intent i =new Intent(sixth.this,third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc1++;
                if(cc1%2==1)
                {
                    mp1.start();
                    if(cc2%2==1)
                    {
                        mp2.pause();
                        cc2++;
                        b3.setText("PLAY2");
                    }
                    if(cc3%2==1)
                    {
                        mp3.pause();
                        b35.setText("PLAY3");
                        cc3++;
                    }
                    if(cc4%2==1)
                    {
                        cc4++;
                        b36.setText("PLAY4");
                        mp4.pause();
                    }
                    b2.setText("PAUSE1");
                }
                else
                {
                    mp1.pause();
                    b2.setText("PLAY1");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc2++;
                if(cc2%2==1)
                {
                    mp2.start();
                    if(cc1%2==1)
                    {
                        mp1.pause();
                        b2.setText("PLAY1");
                        cc1++;
                    }
                    if(cc3%2==1)
                    {
                        mp3.pause();
                        b35.setText("PLAY3");
                        cc3++;
                    }
                    if(cc4%2==1)
                    {
                        cc4++;
                        mp4.pause();
                        b36.setText("PLAY4");
                    }
                    b3.setText("PAUSE2");
                }
                else
                {
                    mp2.pause();
                    b3.setText("PLAY2");
                }
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc3++;
                if(cc3%2==1)
                {
                    mp3.start();
                    b35.setText("PAUSE3");
                    if(cc1%2==1)
                    {
                        mp1.pause();
                        cc1++;
                        b2.setText("PLAY1");
                    }
                    if(cc2%2==1)
                    {
                        mp2.pause();
                        cc2++;
                        b3.setText("PLAY2");
                    }
                    if(cc4%2==1)
                    {
                        mp4.pause();
                        cc4++;
                        b36.setText("PLAY4");
                    }
                }
                else
                {
                    mp3.pause();
                    b35.setText("PLAY3");
                }
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cc4++;
                if(cc4%2==1)
                {
                    mp4.start();
                    b36.setText("PAUSE3");
                    if(cc1%2==1)
                    {
                        mp1.pause();
                        cc1++;
                        b2.setText("PLAY1");
                    }
                    if(cc2%2==1)
                    {
                        mp2.pause();
                        cc2++;
                        b3.setText("PLAY2");
                    }
                    if(cc4%2==1)
                    {
                        mp3.pause();
                        cc3++;
                        b35.setText("PLAY4");
                    }
                }
                else
                {
                    mp4.pause();
                    b36.setText("PLAY3");
                }
            }
        });
    }
}
