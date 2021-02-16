package com.example.myzoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewId);
        zoomControls = findViewById(R.id.zoomControl);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              float x =  imageView.getScaleX();
              float y =  imageView.getScaleY();

              imageView.setScaleX(x+1);
              imageView.setScaleY(y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x =  imageView.getScaleX();
                float y =  imageView.getScaleY();

                if(x > 1 && y > 1){
                    imageView.setScaleX(x-1);
                    imageView.setScaleY(y-1);
                }
                else {
                    Toast.makeText(MainActivity.this,"Zoom Can't be negative", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}