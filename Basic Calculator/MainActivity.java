package com.example.calculator;

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
        TextView textView= (TextView) findViewById(R.id.text_view);
        EditText editText=(EditText) findViewById(R.id.result_view);
        Button btn_0=(Button) findViewById(R.id.zero_but);
        Button btn1=(Button) findViewById(R.id.one_but);
        Button btn2=(Button) findViewById(R.id.two_but);
        Button btn3=(Button) findViewById(R.id.three_but);
        Button btn4=(Button) findViewById(R.id.four_but);
        Button btn5=(Button) findViewById(R.id.five_but);
        Button btn6=(Button) findViewById(R.id.six_but);
        Button btn7=(Button) findViewById(R.id.seven_but);
        Button btn8=(Button) findViewById(R.id.eight_but);
        Button btn9=(Button) findViewById(R.id.nine_but);
        Button btn_plus=(Button) findViewById(R.id.plus_but);
        Button btn_sub=(Button) findViewById(R.id.min_but);
        Button btn_prod=(Button) findViewById(R.id.mul_but);
        Button btn_div=(Button) findViewById(R.id.div_but);
        Button btn_equals=(Button) findViewById(R.id.eq_but);
        Button btn_clear=(Button) findViewById(R.id.c_but);
        class Str {
            String number = (String) editText.getText().toString();
            String oldnumber="";
            String newnumber="";
            String op="";
        }
        Str s=new Str();
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="0";
                editText.setText(s.number);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="1";
                editText.setText(s.number);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="2";
                editText.setText(s.number);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="3";
                editText.setText(s.number);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="4";
                editText.setText(s.number);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="5";
                editText.setText(s.number);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="6";
                editText.setText(s.number);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="7";
                editText.setText(s.number);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="8";
                editText.setText(s.number);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.number+="9";
                editText.setText(s.number);
            }
        });


        //operations
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.oldnumber=editText.getText().toString();
                s.op="+";
                editText.setText("");
                s.number="";
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.oldnumber=editText.getText().toString();
                s.op="-";
                editText.setText("");
                s.number="";

            }});
        btn_prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.oldnumber=editText.getText().toString();
                s.op="*";
                editText.setText("");
                s.number="";

            }});
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.oldnumber=editText.getText().toString();
                s.op="/";
                editText.setText("");
                s.number="";
            }});
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText("");
            }
        });
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.newnumber=editText.getText().toString();
                double result = 0.0;
                switch(s.op){
                    case "+":
                        result=Double.parseDouble(s.oldnumber)+Double.parseDouble(s.newnumber);
                        break;
                    case "-":
                        result=Double.parseDouble(s.oldnumber)-Double.parseDouble(s.newnumber);
                        break;
                    case "*":
                        result=Double.parseDouble(s.oldnumber)*Double.parseDouble(s.newnumber);
                        break;
                    case "/":
                        result=Double.parseDouble(s.oldnumber)/Double.parseDouble(s.newnumber);
                        break;
                }
                editText.setText("");
                textView.setText(result+"");
            }
        });
    }
}
