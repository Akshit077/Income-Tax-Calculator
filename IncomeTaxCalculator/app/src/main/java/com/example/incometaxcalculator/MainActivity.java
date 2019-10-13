package com.example.incometaxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText E1 = findViewById(R.id.E1);
        final EditText E2 = findViewById(R.id.E2);
        Button bt1 = findViewById(R.id.B1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tax=0;
                int amt = Integer.parseInt(E1.getText().toString());
                if(amt < 250000)
                {
                    tax=0;
                }
                if(amt>250000&&amt<=500000)
                {
                    tax=(5/100)*amt;
                }
                if(amt>500000&&amt<=1000000)
                {
                    tax=12500+((20*amt)/100);
                }
                if(amt>=1000000)
                {
                    tax=112500+((30*amt)/100);
                }
                Intent in=new Intent(MainActivity.this,Activity2.class);
                in.putExtra("abc",tax);
                in.putExtra("xyz",amt);
                startActivity(in);
            }
        });


    }
}