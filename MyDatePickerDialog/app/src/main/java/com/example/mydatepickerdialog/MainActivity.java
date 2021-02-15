package com.example.mydatepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private TextView textView;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        DatePicker datePicker = new DatePicker(this);
        final int currentYear = datePicker.getYear();
        final int currentMonth = datePicker.getMonth() + 1;
        final int currentDate = datePicker.getDayOfMonth();

        datePickerDialog = new DatePickerDialog(this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        textView.setText(i2 + "/" + i1 + "/" + i); //set to textview
                    }
                },currentYear, currentMonth, currentDate );
        datePickerDialog.show(); // show date picker
    }
}