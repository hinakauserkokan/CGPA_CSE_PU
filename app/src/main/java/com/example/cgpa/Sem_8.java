package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sem_8 extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    Button bt;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.sem_8);
        e1 = (EditText)findViewById(R.id.s1);
        e2 = (EditText)findViewById(R.id.s2);
        e3 = (EditText)findViewById(R.id.s3);
        e4 = (EditText)findViewById(R.id.s4);
        e5 = (EditText)findViewById(R.id.s5);
        e6 = (EditText)findViewById(R.id.s6);
        e7 = (EditText)findViewById(R.id.s7);
        e8 = (EditText)findViewById(R.id.s8);
        bt = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a1 = Float.parseFloat(e1.getText().toString());
                float a2 = Float.parseFloat(e2.getText().toString());
                float a3 = Float.parseFloat(e3.getText().toString());
                float a4 = Float.parseFloat(e4.getText().toString());
                float a5 = Float.parseFloat(e5.getText().toString());
                float a6 = Float.parseFloat(e6.getText().toString());
                float a7 = Float.parseFloat(e7.getText().toString());
                float a8 = Float.parseFloat(e8.getText().toString());
                float result = (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8)/8;
                String s=Float.toString(result);
                textView.setText(s);
            }
        });
    }
}
