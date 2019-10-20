package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sem_2 extends AppCompatActivity {
    EditText e1,e2;
    Button bt;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.sem_2);
        e1 = (EditText)findViewById(R.id.s1);
        e2 = (EditText)findViewById(R.id.s2);
        bt = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a1 = Float.parseFloat(e1.getText().toString());
                float a2 = Float.parseFloat(e2.getText().toString());
                float result = (a1 + a2)/2;
                String s=Float.toString(result);
                textView.setText(s);
            }
        });
    }
}
