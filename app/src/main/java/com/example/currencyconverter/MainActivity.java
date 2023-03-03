package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.input);
        Button dollar_btn = findViewById(R.id.dollar);
        Button euro_btn = findViewById(R.id.euro);
        Button pound_btn = findViewById(R.id.pound);

        TextView result = findViewById(R.id.result);
        String value = input.getText().toString();
        int input_value = Integer.parseInt(value);

        dollar_btn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              int val = input_value * 126;
                                              result.setText(val);
                                          }
                                      });
//        if(input != null) {
//            String value = input.getText().toString();
//            int input_value = Integer.parseInt(value);

//
//        dollar_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int val = input_value * 126;
//                result.setText( val);
//            }
//        });
//        euro_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int val = input_value * 140;
//                result.setText( val);
//            }
//        });
//        pound_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int val = input_value * 140;
//                result.setText( val);
//            }
//        });
//
    }

}