package com.example.myvedioview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.vedioView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.kd_pathak);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri); //set vedio path
    }
}