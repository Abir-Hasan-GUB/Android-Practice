package com.example.mycoustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
               View coustomView = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.customToast));

               Toast toast = new Toast(MainActivity.this);
               toast.setGravity(Gravity.CENTER, 0, 0);
               toast.setDuration(Toast.LENGTH_SHORT);
               toast.setView(coustomView);
               toast.show();
            }
        });
    }
}