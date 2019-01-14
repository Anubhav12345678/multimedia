package com.example.user.androidproject2k18;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class thirteenth extends AppCompatActivity implements SensorEventListener {
     ImageView w1;
    Button b1;
    TextView t1;
    Sensor s;
    SensorManager sm;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);
        b1 = (Button)findViewById(R.id.button34);
        t1 = (TextView)findViewById(R.id.textView10);
        w1 = (ImageView)findViewById(R.id.imageView5);
        sm =(SensorManager)getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        mp = MediaPlayer.create(this,R.raw.b);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(thirteenth.this,seventh.class);
                startActivity(i);
                finish();
                mp.pause();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.values[0]>0)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
