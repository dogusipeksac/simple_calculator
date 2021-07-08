package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1;
    EditText editTextNumber2;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber1=findViewById(R.id.editTextNumber1);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        resultText=findViewById(R.id.resultText);

    }

    public void sumButton(View view) {
    double number1=Double.parseDouble(editTextNumber1.getText().toString());
    double number2=Double.parseDouble(editTextNumber2.getText().toString());
    double result=number1+number2;
    resultText.setText("Result:  "+result);
    }
}