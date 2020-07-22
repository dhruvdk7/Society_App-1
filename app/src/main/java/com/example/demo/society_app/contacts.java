package com.example.demo.society_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class contacts extends AppCompatActivity {
    private ImageView police, ambulance, fire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        police = (ImageView) findViewById(R.id.police);
        ambulance = (ImageView) findViewById(R.id.ambulance);
        fire = (ImageView) findViewById(R.id.fire);

        police.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9717083930"));
                startActivity(callIntent);
            }

        });
        ambulance.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View arg0) {



                int number = 101;
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);
            }

        });
        fire.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+9873010311"));//change the number
                startActivity(callIntent);
            }

        });
    }
}
