package com.example.buttons_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1 , b2 , b3 , b4 , b5 , b6 ,b7 , b8 , b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.button10);
        b2= findViewById(R.id.button11);
        b3= findViewById(R.id.button);
        b4= findViewById(R.id.button2);
        b5= findViewById(R.id.button5);
        b6= findViewById(R.id.button8);
        b7= findViewById(R.id.button6);
        b8= findViewById(R.id.button7);
        b9= findViewById(R.id.button9);

        invisible();
        b1.setVisibility(View.VISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b5.setVisibility(View.VISIBLE);
                b1.setVisibility(View.INVISIBLE);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b7.setVisibility(View.VISIBLE);
                b2.setVisibility(View.INVISIBLE);

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b1.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b8.setVisibility(View.VISIBLE);
                b4.setVisibility(View.INVISIBLE);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.INVISIBLE);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b9.setVisibility(View.VISIBLE);
                b6.setVisibility(View.INVISIBLE);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b3.setVisibility(View.VISIBLE);
                b7.setVisibility(View.INVISIBLE);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b6.setVisibility(View.VISIBLE);
                b8.setVisibility(View.INVISIBLE);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b2.setVisibility(View.VISIBLE);
                b9.setVisibility(View.INVISIBLE);

            }
        });




    }
    public void invisible(){
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);
        b7.setVisibility(View.INVISIBLE);
        b8.setVisibility(View.INVISIBLE);
        b9.setVisibility(View.INVISIBLE);

    }

}
