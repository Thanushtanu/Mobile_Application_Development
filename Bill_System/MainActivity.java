package com.example.aaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText no_of_aurdino;
    EditText no_of_wifi;
     EditText no_of_bluetooth;
     Button submit;
     Button clear;
     TextView total_amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no_of_aurdino=findViewById(R.id.no_of_aurdino);
        no_of_bluetooth=findViewById(R.id.no_of_bluetooth);
        no_of_wifi=findViewById(R.id.no_of_wifi);
        total_amount=findViewById(R.id.total_amount);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aurdino_uno=500;
                int wifi_module=200;
                int bluetooth_module=200;
                int count_1=Integer.parseInt(no_of_aurdino.getText().toString());
                int count_2=Integer.parseInt(no_of_wifi.getText().toString());
                int count_3=Integer.parseInt(no_of_bluetooth.getText().toString());
                int payable_amount=(count_1*aurdino_uno)+(count_2*wifi_module)+(count_3*bluetooth_module);
                total_amount.setText(payable_amount);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no_of_aurdino.setText("");
                no_of_bluetooth.setText("");
                no_of_wifi.setText("");
                total_amount.setText("");
            }
        });
    }

}
