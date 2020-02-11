package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import static android.R.layout.simple_list_item_1;

public class Grade_2 extends AppCompatActivity {
    TextView textView;
    double a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,p1,p2,p3,p4,p5,p6;
    Button bt;
    Spinner spin1, spin2, spin3, spin4, spin5, spin6,spin7, spin8, spin9 , spin10, spin11, spin12,spinp1,spinp2,spinp3,spinp4,spinp5,spinp6;
    String grade[]  = {"S","A","B","C","D","E","F"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.grade_2);
        textView = (TextView)findViewById(R.id.text);
        spin1 = (Spinner)findViewById(R.id.s1);
        spin2 = (Spinner)findViewById(R.id.s2);
        spin3 = (Spinner)findViewById(R.id.s3);
        spin4 = (Spinner)findViewById(R.id.s4);
        spin5 = (Spinner)findViewById(R.id.s5);
        spin6 = (Spinner)findViewById(R.id.s6);
        spin7 = (Spinner)findViewById(R.id.s7);
        spin8 = (Spinner)findViewById(R.id.s8);
        spin9 = (Spinner)findViewById(R.id.s9);
        spin10 = (Spinner)findViewById(R.id.s10);
        spin11 = (Spinner)findViewById(R.id.s11);
        spin12 = (Spinner)findViewById(R.id.s12);
        spinp1 = (Spinner)findViewById(R.id.sp1);
        spinp2 = (Spinner)findViewById(R.id.sp2);
        spinp3 = (Spinner)findViewById(R.id.sp3);
        spinp4 = (Spinner)findViewById(R.id.sp4);
        spinp5 = (Spinner)findViewById(R.id.sp5);
        spinp6 = (Spinner)findViewById(R.id.sp6);
        bt = (Button)findViewById(R.id.button);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, simple_list_item_1, grade);
        spin1.setAdapter(arrayAdapter);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a1 = 10;
                        break;
                    case 1:
                        a1 = 9;
                        break;
                    case 2:
                        a1 = 8;
                        break;
                    case 3:
                        a1 = 7;
                        break;
                    case 4:
                        a1 = 6;
                        break;
                    case 5:
                        a1 = 5;
                        break;
                    case 6:
                        a1 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin2.setAdapter(arrayAdapter);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a2 = 10;
                        break;
                    case 1:
                        a2 = 9;
                        break;
                    case 2:
                        a2 = 8;
                        break;
                    case 3:
                        a2 = 7;
                        break;
                    case 4:
                        a2 = 6;
                        break;
                    case 5:
                        a2 = 5;
                        break;
                    case 6:
                        a2 = 0;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin3.setAdapter(arrayAdapter);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a3 = 10;
                        break;
                    case 1:
                        a3 = 9;
                        break;
                    case 2:
                        a3 = 8;
                        break;
                    case 3:
                        a3 = 7;
                        break;
                    case 4:
                        a3 = 6;
                        break;
                    case 5:
                        a3 = 5;
                        break;
                    case 6:
                        a3 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin4.setAdapter(arrayAdapter);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a4 = 10;
                        break;
                    case 1:
                        a4 = 9;
                        break;
                    case 2:
                        a4 = 8;
                        break;
                    case 3:
                        a4 = 7;
                        break;
                    case 4:
                        a4 = 6;
                        break;
                    case 5:
                        a4 = 5;
                        break;
                    case 6:
                        a4 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin5.setAdapter(arrayAdapter);
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a5 = 10;
                        break;
                    case 1:
                        a5 = 9;
                        break;
                    case 2:
                        a5 = 8;
                        break;
                    case 3:
                        a5 = 7;
                        break;
                    case 4:
                        a5 = 6;
                        break;
                    case 5:
                        a5 = 5;
                        break;
                    case 6:
                        a5 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin6.setAdapter(arrayAdapter);
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a6 = 10;
                        break;
                    case 1:
                        a6 = 9;
                        break;
                    case 2:
                        a6 = 8;
                        break;
                    case 3:
                        a6 = 7;
                        break;
                    case 4:
                        a6 = 6;
                        break;
                    case 5:
                        a6 = 5;
                        break;
                    case 6:
                        a6 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin7.setAdapter(arrayAdapter);
        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a7 = 10;
                        break;
                    case 1:
                        a7 = 9;
                        break;
                    case 2:
                        a7 = 8;
                        break;
                    case 3:
                        a7 = 7;
                        break;
                    case 4:
                        a7 = 6;
                        break;
                    case 5:
                        a7 = 5;
                        break;
                    case 6:
                        a7 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin8.setAdapter(arrayAdapter);
        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a8 = 10;
                        break;
                    case 1:
                        a8 = 9;
                        break;
                    case 2:
                        a8 = 8;
                        break;
                    case 3:
                        a8 = 7;
                        break;
                    case 4:
                        a8 = 6;
                        break;
                    case 5:
                        a8 = 5;
                        break;
                    case 6:
                        a8 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin9.setAdapter(arrayAdapter);
        spin9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a9 = 10;
                        break;
                    case 1:
                        a9 = 9;
                        break;
                    case 2:
                        a9 = 8;
                        break;
                    case 3:
                        a9 = 7;
                        break;
                    case 4:
                        a9 = 6;
                        break;
                    case 5:
                        a9 = 5;
                        break;
                    case 6:
                        a9 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin10.setAdapter(arrayAdapter);
        spin10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a10 = 10;
                        break;
                    case 1:
                        a10 = 9;
                        break;
                    case 2:
                        a10 = 8;
                        break;
                    case 3:
                        a10 = 7;
                        break;
                    case 4:
                        a10 = 6;
                        break;
                    case 5:
                        a10 = 5;
                        break;
                    case 6:
                        a10 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin11.setAdapter(arrayAdapter);
        spin11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a11 = 10;
                        break;
                    case 1:
                        a11 = 9;
                        break;
                    case 2:
                        a11 = 8;
                        break;
                    case 3:
                        a11 = 7;
                        break;
                    case 4:
                        a11 = 6;
                        break;
                    case 5:
                        a11 = 5;
                        break;
                    case 6:
                        a11 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin12.setAdapter(arrayAdapter);
        spin12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a12 = 10;
                        break;
                    case 1:
                        a12 = 9;
                        break;
                    case 2:
                        a12 = 8;
                        break;
                    case 3:
                        a12 = 7;
                        break;
                    case 4:
                        a12 = 6;
                        break;
                    case 5:
                        a12 = 5;
                        break;
                    case 6:
                        a12 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp1.setAdapter(arrayAdapter);
        spinp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p1 = 10;
                        break;
                    case 1:
                        p1 = 9;
                        break;
                    case 2:
                        p1 = 8;
                        break;
                    case 3:
                        p1 = 7;
                        break;
                    case 4:
                        p1 = 6;
                        break;
                    case 5:
                        p1 = 5;
                        break;
                    case 6:
                        p1 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp2.setAdapter(arrayAdapter);
        spinp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p2 = 10;
                        break;
                    case 1:
                        p2 = 9;
                        break;
                    case 2:
                        p2 = 8;
                        break;
                    case 3:
                        p2 = 7;
                        break;
                    case 4:
                        p2 = 6;
                        break;
                    case 5:
                        p2 = 5;
                        break;
                    case 6:
                        p2 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp3.setAdapter(arrayAdapter);
        spinp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p3 = 10;
                        break;
                    case 1:
                        p3 = 9;
                        break;
                    case 2:
                        p3 = 8;
                        break;
                    case 3:
                        p3 = 7;
                        break;
                    case 4:
                        p3 = 6;
                        break;
                    case 5:
                        p3 = 5;
                        break;
                    case 6:
                        p3 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp4.setAdapter(arrayAdapter);
        spinp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p4 = 10;
                        break;
                    case 1:
                        p4 = 9;
                        break;
                    case 2:
                        p4 = 8;
                        break;
                    case 3:
                        p4 = 7;
                        break;
                    case 4:
                        p4 = 6;
                        break;
                    case 5:
                        p4 = 5;
                        break;
                    case 6:
                        p4 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp5.setAdapter(arrayAdapter);
        spinp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p5 = 10;
                        break;
                    case 1:
                        p5 = 9;
                        break;
                    case 2:
                        p5 = 8;
                        break;
                    case 3:
                        p5 = 7;
                        break;
                    case 4:
                        p5 = 6;
                        break;
                    case 5:
                        p5 = 5;
                        break;
                    case 6:
                        p5 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp6.setAdapter(arrayAdapter);
        spinp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p6 = 10;
                        break;
                    case 1:
                        p6 = 9;
                        break;
                    case 2:
                        p6 = 8;
                        break;
                    case 3:
                        p6 = 7;
                        break;
                    case 4:
                        p6 = 6;
                        break;
                    case 5:
                        p6 = 5;
                        break;
                    case 6:
                        p6 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = ((a1*4)+(a2*4)+(a3*4)+(a4*4)+(a5*4)+(a6*4)+(a7*4)+(a8*4)+(a9*4)+(a10*4)+(a11*4)+(a12*4)+(p1*2)+(p2*2)+(p3*2)+(p4*2)+(p5*2)+(p6*2))/60 ;
                String s = Double.toString(x);
                textView.setText(s);
            }
        });
    }
}
