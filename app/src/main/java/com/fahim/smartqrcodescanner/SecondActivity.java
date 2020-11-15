package com.fahim.smartqrcodescanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private ImageView imageView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.bt2);
        imageView = findViewById(R.id.back);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==button){


            intent = new Intent(SecondActivity.this,CameraActivity.class);
            startActivity(intent);


        }
        else if(v==imageView){

            intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}