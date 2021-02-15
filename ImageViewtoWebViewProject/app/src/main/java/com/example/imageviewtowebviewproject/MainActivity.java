package com.example.imageviewtowebviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private CheckBox book, eating, others;
    private TextView display, display2;
    private RadioGroup radioButtonGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book = findViewById(R.id.book);
        eating = findViewById(R.id.eat);
        others = findViewById(R.id.others);
        display = findViewById(R.id.display);
        display2 = findViewById(R.id.display2);
        radioButtonGroup = findViewById(R.id.radioButtonGroup);


        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checkbox value get here
                StringBuilder stringBuilder = new StringBuilder();
                if(book.isChecked()){
                    stringBuilder.append(book.getText().toString() + "\n");
                }
                if(eating.isChecked()){
                    stringBuilder.append(eating.getText().toString() + "\n");
                }
                if(others.isChecked()){
                    stringBuilder.append(others.getText().toString() + "\n");
                }
                    display.setText("Favorite Works: \n\n" + stringBuilder);


                int selectedId = radioButtonGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedId);
                String valueOfRadioBtn = radioButton.getText().toString();
                display2.setText("Your Gender: " + valueOfRadioBtn + "\n");






                LayoutInflater inflater = getLayoutInflater();
                View coustomToastView =  inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.customToast));

                Toast toast = new Toast(MainActivity.this);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(coustomToastView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}