package com.nitap.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.ttv.face.*;
import com.ttv.facerecog.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static Context context;
    public void display(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int i = FaceEngine.getInstance(context).setActivation("");
                display(Objects.toString(i));
              //
                //  Toast.makeText(this, Objects.toString(i), Toast.LENGTH_SHORT).show();
            }
        },3000);


    }
}