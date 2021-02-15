package com.example.myrattingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.rattingBarId);
        output = findViewById(R.id.output);
        output.setText("Your Give: "+ratingBar.getProgress()+" Stars");

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float value, boolean b) {
                int star = (int) value;
                output.setText("Your Give: "+star+" Stars");
            }
        });
    }
}