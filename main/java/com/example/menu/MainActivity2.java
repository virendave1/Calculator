package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b1 = getIntent().getExtras();
            String Value1 = b1.getString("Value1");
            String Value2 = b1.getString("Value2");
        String Value3 = b1.getString("Value3");
        String Value4 = b1.getString("Value4");
        textView = findViewById(R.id.textView);
            textView.setText(" History:\n"+ " " + Value1 + " "+Value4+" "+ Value2+" = "+Value3);
        }
    }
