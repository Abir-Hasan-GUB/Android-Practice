package com.example.myalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = findViewById(R.id.button);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Alert Title-");//for title
        alertDialogBuilder.setMessage(R.string.alertTitle); //for body message
        alertDialogBuilder.setIcon(R.drawable.question); //set icon

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish(); // exit from app
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast toast = Toast.makeText(MainActivity.this, "Thank Your for stay!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertDialogBuilder.setCancelable(false);

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}