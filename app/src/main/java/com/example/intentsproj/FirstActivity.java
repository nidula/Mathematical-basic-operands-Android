package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    EditText et1,et2;
    String st1,st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        btn=findViewById(R.id.button);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"Sending Message...",Toast.LENGTH_LONG).show();
                Intent i=new Intent(FirstActivity.this,SecondActivity.class);
                st1= et1.getText().toString();
                i.putExtra("Value1",st1);
                st2= et2.getText().toString();
                i.putExtra("Value2",st2);
                startActivity(i);

            }
        });
    }
}