package com.example.serviceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stopService(View view) {

        //Intent intent = new Intent(getApplicationContext(), BasicServiceClass.class);
        Intent intent = new Intent(getApplicationContext(), DownloadService.class);
        stopService(intent);

    }

    public void startService(View view) {


        // Intent intent = new Intent(getApplicationContext(), BasicServiceClass.class);
        Intent intent = new Intent(getApplicationContext(), DownloadService.class);
        startService(intent);

    }
}