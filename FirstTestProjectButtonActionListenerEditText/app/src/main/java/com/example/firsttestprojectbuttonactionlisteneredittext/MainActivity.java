package com.example.firsttestprojectbuttonactionlisteneredittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity  {
    private Button button1, button2, sum, diff;
    private TextView output, result;
    private EditText input1, input2;
    private TextView buttonClickTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        sum = findViewById(R.id.sum);
        diff = findViewById(R.id.diff);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input1);
        result = findViewById(R.id.result);
        buttonClickTest = findViewById(R.id.buttonClickTest);
        output = findViewById(R.id.buttonClickTest);

        Handler handler = new Handler();
        button1.setOnClickListener(handler);
        button2.setOnClickListener(handler);
        sum.setOnClickListener(handler);
        diff.setOnClickListener(handler);
    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View v) {
              double number1 = parseDouble(input1.getText().toString());
              double number2 = parseDouble(input1.getText().toString());
              double sum = number1 + number2;
              double diff = number1 - number2;

              if(v.getId() == R.id.button1){
                  output.setText("Button 1 Clicked!");
              }
              if(v.getId() == R.id.button2){
                  output.setText("Button 2 Clicked!");
              }
//              if(v.getId() == R.id.sum){
//                  result.setText("Result: "+sum);
//              }
//              if(v.getId() == R.id.diff){
//                  result.setText("Result: "+diff);
//              }
        }
    }
}