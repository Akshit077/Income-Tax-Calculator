package com.example.incometaxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final int tax=getIntent().getExtras().getInt("abc");
        final TextView E=findViewById(R.id.T14);
        E.setText(String.valueOf(tax));
        final int amt=getIntent().getExtras().getInt("xyz");
        final TextView Q=findViewById(R.id.T12);
        Q.setText(String.valueOf(amt));
    }
}
