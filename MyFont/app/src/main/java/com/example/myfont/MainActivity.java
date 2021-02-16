package com.example.myfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {
    private TextView textView1, textView2;
    private Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1Id);
        textView2 = findViewById(R.id.textView2Id);
        typeface = Typeface.createFromAsset(getAssets(), "Questa_Sans_Regular.otf");
        textView1.setTypeface(typeface);

    }
}