package com.example.yourock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class welcom extends AppCompatActivity {
    TextView t1;
    ImageView im1,im4;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom);
        t1 = (TextView) findViewById(R.id.t1);
        im1 = (ImageView) findViewById(R.id.im1);
        im4 = (ImageView) findViewById(R.id.im4);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
             Intent intent= new Intent(welcom.this,sign_up.class);
             startActivity(intent);
             finish();
            }
        }, 3000);

    }
    }

