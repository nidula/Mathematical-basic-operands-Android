package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et3,et4;
    String st1,st2;
    Button bt1,bt2,bt3,bt4;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et3=findViewById(R.id.editTextTextPersonName3);
        et4=findViewById(R.id.editTextTextPersonName5);
        bt1=findViewById(R.id.button3);
        bt2=findViewById(R.id.button4);
        bt3=findViewById(R.id.button5);
        bt4=findViewById(R.id.button6);
        txt=findViewById(R.id.textView7);

        st1=getIntent().getExtras().getString("Value1");
        et3.setText(st1);
        st2=getIntent().getExtras().getString("Value2");
        et4.setText(st2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et3.getText().toString().length()==0){
                    et3.setText("0");
                }
                if(et4.getText().toString().length()==0){
                    et4.setText("0");
                }
                int num1 = Integer.parseInt(et3.getText().toString());
                int num2 = Integer.parseInt(et4.getText().toString());
                int sum = num1+num2;
                txt.setText(String.valueOf(sum));

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et3.getText().toString().length()==0){
                    et3.setText("0");
                }
                if(et4.getText().toString().length()==0){
                    et4.setText("0");
                }
                int num1 = Integer.parseInt(et3.getText().toString());
                int num2 = Integer.parseInt(et4.getText().toString());
                int sum = num1-num2;
                txt.setText(String.valueOf(sum));

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et3.getText().toString().length()==0){
                    et3.setText("0");
                }
                if(et4.getText().toString().length()==0){
                    et4.setText("0");
                }
                int num1 = Integer.parseInt(et3.getText().toString());
                int num2 = Integer.parseInt(et4.getText().toString());
                int sum = num1*num2;
                txt.setText(String.valueOf(sum));

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et3.getText().toString().length()==0){
                    et3.setText("0");
                }
                if(et4.getText().toString().length()==0){
                    et4.setText("0");
                }
                int num1 = Integer.parseInt(et3.getText().toString());
                int num2 = Integer.parseInt(et4.getText().toString());
                int sum = num1/num2;
                txt.setText(String.valueOf(sum));

            }
        });
    }
}