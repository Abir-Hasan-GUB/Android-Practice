package com.example.mydatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button datePickerButton;
    private TextView dateText;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePickerButton = findViewById(R.id.pickButton);
        dateText = findViewById(R.id.dateText);
        datePicker = findViewById(R.id.datePicker);

        dateText.setText(setCurrentDate()); // initialize todays date

        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateText.setText(setCurrentDate()); //show selected date
            }
        });
    }



    String setCurrentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current Date: ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/"); //get day of month
        stringBuilder.append(datePicker.getMonth() + 1 + "/"); //get month
        stringBuilder.append(datePicker.getYear()); //get year

        return stringBuilder.toString();
    }
}