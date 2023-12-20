package com.example.check_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editTextNumber;
    RadioGroup radioGroup2;
    RadioButton radioButton1, radioButton2 , radioButton3 , radioButton4;
    Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber  = findViewById(R.id.editTextNumber);
        radioGroup2 = findViewById(R.id.radioGroup2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup2.getCheckedRadioButtonId();
                radioButton1 = findViewById(id);

                if (radioButton1.getText().toString().equals("Dollars")) {
                    double id1=Integer.parseInt(editTextNumber.getText().toString())*0.012;
                    Toast.makeText(MainActivity.this, id1+" USD", Toast.LENGTH_LONG) .show();
                } else if (radioButton1.getText().toString().equals("China")){
                    double id1=Integer.parseInt(editTextNumber.getText().toString()) *0.0096;
                    Toast.makeText(MainActivity.this, id1+" GBP", Toast.LENGTH_LONG).show();
                } else if (radioButton1.getText().toString().equals("Korean")) {
                    double id1=Integer.parseInt(editTextNumber.getText().toString()) *15.64;
                    Toast.makeText(MainActivity.this, id1+" KRW", Toast.LENGTH_LONG).show();
                }
                else if(radioButton1.getText().toString().equals("Japanese")){
                    double id1=Integer.parseInt(editTextNumber.getText().toString()) * 1.69;
                    Toast.makeText(MainActivity.this, id1+" JPY", Toast.LENGTH_LONG).show();
                }

            }
        });



    }
}
