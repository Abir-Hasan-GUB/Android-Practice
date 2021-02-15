package com.example.buttonwithlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        textView = findViewById(R.id.output);

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView.setText("Button 1 Clicked !");
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView.setText("Button 2 Clicked !");
//            }
//        });
    }
    public void btnListener(View v){
        if(v.getId() == R.id.button1){
            textView.setText("Clicked Handle by Ex");
        }else{
            textView.setText("Clicked Handle by Exx");
        }
    }


}