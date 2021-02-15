package com.example.mycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox milk, sugar, water;
    private TextView result;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milk = findViewById(R.id.milk);
        water = findViewById(R.id.water);
        sugar = findViewById(R.id.suger);
        showButton = findViewById(R.id.showButton);
        result = findViewById(R.id.result);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(!milk.isChecked() && !milk.isChecked() && !milk.isChecked()){
                    stringBuilder.append("Please Select first !");
                }
                if(milk.isChecked()){
                    String value = milk.getText().toString();
                    stringBuilder.append(value + " is Ordered ! \n");
                }
                if(sugar.isChecked()){
                    String value = sugar.getText().toString();
                    stringBuilder.append(value + " is Ordered ! \n");
                }
                if(water.isChecked()){
                    String value = water.getText().toString();
                    stringBuilder.append(value + " is Ordered ! \n");
                }

                result.setText(stringBuilder);
                result.setTextColor(Color.rgb(255,255,0));
            }
        });
    }
}