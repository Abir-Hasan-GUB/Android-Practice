package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button showButton;
    private TextView output;
    private RadioButton genderButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.showButton);
        output = findViewById(R.id.output);
        radioGroup = findViewById(R.id.radioGroup);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int selectedId =  radioGroup.getCheckedRadioButtonId(); // find checked button ID
              genderButton = findViewById(selectedId); // find checked button
              String value =  genderButton.getText().toString();
              output.setText("You have selected: "+ value);
            }
        });
    }
}