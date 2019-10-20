package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sem_1 extends AppCompatActivity {
    EditText e1;
    Button bt;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.sem_1);
        e1 = (EditText)findViewById(R.id.s1);
        bt = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a1 = Float.parseFloat(e1.getText().toString());
                float result = (a1)/1;
                String s=Float.toString(result);
                textView.setText("Your CUMMULATIVE GRADE POINT AVERAGE is "+s);
            }
        });
    }
}
