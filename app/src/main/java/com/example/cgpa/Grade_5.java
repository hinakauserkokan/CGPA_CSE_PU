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

public class Grade_5 extends AppCompatActivity {
    TextView textView;
    double a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16;
    Button bt;
    Spinner spin1, spin2, spin3, spin4, spin5, spin6,spin7, spin8, spin9 , spin10, spin11, spin12,spin13,spin14, spin15, spin16 , spin17, spin18,spin19,spin20,spin21,spin22,spin23,spin24,spin25,spin26,spin27,spin28,spin29, spinp1,spinp2,spinp3,spinp4,spinp5,spinp6,spinp7,spinp8,spinp9,spinp10,spinp11,spinp12,spinp13,spinp14,spinp15,spinp16;
    String grade[]  = {"S","A","B","C","D","E","F"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.grade_5);
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
        spin13 = (Spinner)findViewById(R.id.s13);
        spin14 = (Spinner)findViewById(R.id.s14);
        spin15 = (Spinner)findViewById(R.id.s15);
        spin16 = (Spinner)findViewById(R.id.s16);
        spin17 = (Spinner)findViewById(R.id.s17);
        spin18 = (Spinner)findViewById(R.id.s18);
        spin19 = (Spinner)findViewById(R.id.s19);
        spin20 = (Spinner)findViewById(R.id.s20);
        spin21 = (Spinner)findViewById(R.id.s21);
        spin22 = (Spinner)findViewById(R.id.s22);
        spin23 = (Spinner)findViewById(R.id.s23);
        spin24 = (Spinner)findViewById(R.id.s24);
        spin25 = (Spinner)findViewById(R.id.s25);
        spin26 = (Spinner)findViewById(R.id.s26);
        spin27 = (Spinner)findViewById(R.id.s27);
        spin28 = (Spinner)findViewById(R.id.s28);
        spin29 = (Spinner)findViewById(R.id.s29);
        spinp1 = (Spinner)findViewById(R.id.sp1);
        spinp2 = (Spinner)findViewById(R.id.sp2);
        spinp3 = (Spinner)findViewById(R.id.sp3);
        spinp4 = (Spinner)findViewById(R.id.sp4);
        spinp5 = (Spinner)findViewById(R.id.sp5);
        spinp6 = (Spinner)findViewById(R.id.sp6);
        spinp7 = (Spinner)findViewById(R.id.sp7);
        spinp8 = (Spinner)findViewById(R.id.sp8);
        spinp9 = (Spinner)findViewById(R.id.sp9);
        spinp10 = (Spinner)findViewById(R.id.sp10);
        spinp11 = (Spinner)findViewById(R.id.sp11);
        spinp12 = (Spinner)findViewById(R.id.sp12);
        spinp13 = (Spinner)findViewById(R.id.sp13);
        spinp14 = (Spinner)findViewById(R.id.sp14);
        spinp15 = (Spinner)findViewById(R.id.sp15);
        spinp16 = (Spinner)findViewById(R.id.sp16);
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
                    case 2:
                        a1 = 9;
                        break;
                    case 3:
                        a1 = 8;
                        break;
                    case 4:
                        a1 = 7;
                        break;
                    case 5:
                        a1 = 6;
                        break;
                    case 6:
                        a1 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a2 = 9;
                        break;
                    case 3:
                        a2 = 8;
                        break;
                    case 4:
                        a2 = 7;
                        break;
                    case 5:
                        a2 = 6;
                        break;
                    case 6:
                        a2 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a3 = 9;
                        break;
                    case 3:
                        a3 = 8;
                        break;
                    case 4:
                        a3 = 7;
                        break;
                    case 5:
                        a3 = 6;
                        break;
                    case 6:
                        a3 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a4 = 9;
                        break;
                    case 3:
                        a4 = 8;
                        break;
                    case 4:
                        a4 = 7;
                        break;
                    case 5:
                        a4 = 6;
                        break;
                    case 6:
                        a4 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a5 = 9;
                        break;
                    case 3:
                        a5 = 8;
                        break;
                    case 4:
                        a5 = 7;
                        break;
                    case 5:
                        a5 = 6;
                        break;
                    case 6:
                        a5 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a6 = 9;
                        break;
                    case 3:
                        a6 = 8;
                        break;
                    case 4:
                        a6 = 7;
                        break;
                    case 5:
                        a6 = 6;
                        break;
                    case 6:
                        a6 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a7 = 9;
                        break;
                    case 3:
                        a7 = 8;
                        break;
                    case 4:
                        a7 = 7;
                        break;
                    case 5:
                        a7 = 6;
                        break;
                    case 6:
                        a7 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a8 = 9;
                        break;
                    case 3:
                        a8 = 8;
                        break;
                    case 4:
                        a8 = 7;
                        break;
                    case 5:
                        a8 = 6;
                        break;
                    case 6:
                        a8 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a9 = 9;
                        break;
                    case 3:
                        a9 = 8;
                        break;
                    case 4:
                        a9 = 7;
                        break;
                    case 5:
                        a9 = 6;
                        break;
                    case 6:
                        a9 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a10 = 9;
                        break;
                    case 3:
                        a10 = 8;
                        break;
                    case 4:
                        a10 = 7;
                        break;
                    case 5:
                        a10 = 6;
                        break;
                    case 6:
                        a10 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a11 = 9;
                        break;
                    case 3:
                        a11 = 8;
                        break;
                    case 4:
                        a11 = 7;
                        break;
                    case 5:
                        a11 = 6;
                        break;
                    case 6:
                        a11 = 5;
                        break;
                    case 7:
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
                    case 2:
                        a12 = 9;
                        break;
                    case 3:
                        a12 = 8;
                        break;
                    case 4:
                        a12 = 7;
                        break;
                    case 5:
                        a12 = 6;
                        break;
                    case 6:
                        a12 = 5;
                        break;
                    case 7:
                        a12 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin13.setAdapter(arrayAdapter);
        spin13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a13 = 10;
                        break;
                    case 2:
                        a13 = 9;
                        break;
                    case 3:
                        a13 = 8;
                        break;
                    case 4:
                        a13 = 7;
                        break;
                    case 5:
                        a13 = 6;
                        break;
                    case 6:
                        a13 = 5;
                        break;
                    case 7:
                        a13 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin14.setAdapter(arrayAdapter);
        spin14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a14 = 10;
                        break;
                    case 2:
                        a14 = 9;
                        break;
                    case 3:
                        a14 = 8;
                        break;
                    case 4:
                        a14 = 7;
                        break;
                    case 5:
                        a14 = 6;
                        break;
                    case 6:
                        a14 = 5;
                        break;
                    case 7:
                        a14 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin15.setAdapter(arrayAdapter);
        spin15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a15 = 10;
                        break;
                    case 2:
                        a15 = 9;
                        break;
                    case 3:
                        a15 = 8;
                        break;
                    case 4:
                        a15 = 7;
                        break;
                    case 5:
                        a15 = 6;
                        break;
                    case 6:
                        a15 = 5;
                        break;
                    case 7:
                        a15 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin16.setAdapter(arrayAdapter);
        spin16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a16 = 10;
                        break;
                    case 2:
                        a16 = 9;
                        break;
                    case 3:
                        a16 = 8;
                        break;
                    case 4:
                        a16 = 7;
                        break;
                    case 5:
                        a16 = 6;
                        break;
                    case 6:
                        a16 = 5;
                        break;
                    case 7:
                        a16 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin17.setAdapter(arrayAdapter);
        spin17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a17 = 10;
                        break;
                    case 2:
                        a17 = 9;
                        break;
                    case 3:
                        a17 = 8;
                        break;
                    case 4:
                        a17 = 7;
                        break;
                    case 5:
                        a17 = 6;
                        break;
                    case 6:
                        a17 = 5;
                        break;
                    case 7:
                        a17 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin18.setAdapter(arrayAdapter);
        spin18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a18 = 10;
                        break;
                    case 2:
                        a18 = 9;
                        break;
                    case 3:
                        a18 = 8;
                        break;
                    case 4:
                        a18 = 7;
                        break;
                    case 5:
                        a18 = 6;
                        break;
                    case 6:
                        a18 = 5;
                        break;
                    case 7:
                        a18 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin19.setAdapter(arrayAdapter);
        spin19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a19 = 10;
                        break;
                    case 2:
                        a19 = 9;
                        break;
                    case 3:
                        a19 = 8;
                        break;
                    case 4:
                        a19 = 7;
                        break;
                    case 5:
                        a19 = 6;
                        break;
                    case 6:
                        a19 = 5;
                        break;
                    case 7:
                        a19 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin20.setAdapter(arrayAdapter);
        spin20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a20 = 10;
                        break;
                    case 2:
                        a20 = 9;
                        break;
                    case 3:
                        a20 = 8;
                        break;
                    case 4:
                        a20 = 7;
                        break;
                    case 5:
                        a20 = 6;
                        break;
                    case 6:
                        a20 = 5;
                        break;
                    case 7:
                        a20 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin21.setAdapter(arrayAdapter);
        spin21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a21 = 10;
                        break;
                    case 2:
                        a21 = 9;
                        break;
                    case 3:
                        a21 = 8;
                        break;
                    case 4:
                        a21 = 7;
                        break;
                    case 5:
                        a21 = 6;
                        break;
                    case 6:
                        a21 = 5;
                        break;
                    case 7:
                        a21 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin22.setAdapter(arrayAdapter);
        spin22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a22 = 10;
                        break;
                    case 2:
                        a22 = 9;
                        break;
                    case 3:
                        a22 = 8;
                        break;
                    case 4:
                        a22 = 7;
                        break;
                    case 5:
                        a22 = 6;
                        break;
                    case 6:
                        a22 = 5;
                        break;
                    case 7:
                        a22 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin23.setAdapter(arrayAdapter);
        spin23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a23 = 10;
                        break;
                    case 2:
                        a23 = 9;
                        break;
                    case 3:
                        a23 = 8;
                        break;
                    case 4:
                        a23 = 7;
                        break;
                    case 5:
                        a23 = 6;
                        break;
                    case 6:
                        a23 = 5;
                        break;
                    case 7:
                        a23 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin24.setAdapter(arrayAdapter);
        spin24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a24 = 10;
                        break;
                    case 2:
                        a24 = 9;
                        break;
                    case 3:
                        a24 = 8;
                        break;
                    case 4:
                        a24 = 7;
                        break;
                    case 5:
                        a24 = 6;
                        break;
                    case 6:
                        a24 = 5;
                        break;
                    case 7:
                        a24 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin25.setAdapter(arrayAdapter);
        spin25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a25 = 10;
                        break;
                    case 2:
                        a25 = 9;
                        break;
                    case 3:
                        a25 = 8;
                        break;
                    case 4:
                        a25 = 7;
                        break;
                    case 5:
                        a25 = 6;
                        break;
                    case 6:
                        a25 = 5;
                        break;
                    case 7:
                        a25 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin26.setAdapter(arrayAdapter);
        spin26.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a26 = 10;
                        break;
                    case 2:
                        a26 = 9;
                        break;
                    case 3:
                        a26 = 8;
                        break;
                    case 4:
                        a26 = 7;
                        break;
                    case 5:
                        a26 = 6;
                        break;
                    case 6:
                        a26 = 5;
                        break;
                    case 7:
                        a26 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin27.setAdapter(arrayAdapter);
        spin27.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a27 = 10;
                        break;
                    case 2:
                        a27 = 9;
                        break;
                    case 3:
                        a27 = 8;
                        break;
                    case 4:
                        a27 = 7;
                        break;
                    case 5:
                        a27 = 6;
                        break;
                    case 6:
                        a27 = 5;
                        break;
                    case 7:
                        a27 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin28.setAdapter(arrayAdapter);
        spin28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a28 = 10;
                        break;
                    case 2:
                        a28 = 9;
                        break;
                    case 3:
                        a28 = 8;
                        break;
                    case 4:
                        a28 = 7;
                        break;
                    case 5:
                        a28 = 6;
                        break;
                    case 6:
                        a28 = 5;
                        break;
                    case 7:
                        a28 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spin29.setAdapter(arrayAdapter);
        spin29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a29 = 10;
                        break;
                    case 2:
                        a29 = 9;
                        break;
                    case 3:
                        a29 = 8;
                        break;
                    case 4:
                        a29 = 7;
                        break;
                    case 5:
                        a29 = 6;
                        break;
                    case 6:
                        a29 = 5;
                        break;
                    case 7:
                        a29 = 0;
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
                    case 2:
                        p1 = 9;
                        break;
                    case 3:
                        p1 = 8;
                        break;
                    case 4:
                        p1 = 7;
                        break;
                    case 5:
                        p1 = 6;
                        break;
                    case 6:
                        p1 = 5;
                        break;
                    case 7:
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
                    case 2:
                        p2 = 9;
                        break;
                    case 3:
                        p2 = 8;
                        break;
                    case 4:
                        p2 = 7;
                        break;
                    case 5:
                        p2 = 6;
                        break;
                    case 6:
                        p2 = 5;
                        break;
                    case 7:
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
                    case 2:
                        p3 = 9;
                        break;
                    case 3:
                        p3 = 8;
                        break;
                    case 4:
                        p3 = 7;
                        break;
                    case 5:
                        p3 = 6;
                        break;
                    case 6:
                        p3 = 5;
                        break;
                    case 7:
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
                    case 2:
                        p4 = 9;
                        break;
                    case 3:
                        p4 = 8;
                        break;
                    case 4:
                        p4 = 7;
                        break;
                    case 5:
                        p4 = 6;
                        break;
                    case 6:
                        p4 = 5;
                        break;
                    case 7:
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
                    case 2:
                        p5 = 9;
                        break;
                    case 3:
                        p5 = 8;
                        break;
                    case 4:
                        p5 = 7;
                        break;
                    case 5:
                        p5 = 6;
                        break;
                    case 6:
                        p5 = 5;
                        break;
                    case 7:
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
                    case 2:
                        p6 = 9;
                        break;
                    case 3:
                        p6 = 8;
                        break;
                    case 4:
                        p6 = 7;
                        break;
                    case 5:
                        p6 = 6;
                        break;
                    case 6:
                        p6 = 5;
                        break;
                    case 7:
                        p6 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp7.setAdapter(arrayAdapter);
        spinp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p7 = 10;
                        break;
                    case 2:
                        p7 = 9;
                        break;
                    case 3:
                        p7 = 8;
                        break;
                    case 4:
                        p7 = 7;
                        break;
                    case 5:
                        p7 = 6;
                        break;
                    case 6:
                        p7 = 5;
                        break;
                    case 7:
                        p7 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp8.setAdapter(arrayAdapter);
        spinp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p8 = 10;
                        break;
                    case 2:
                        p8 = 9;
                        break;
                    case 3:
                        p8 = 8;
                        break;
                    case 4:
                        p8 = 7;
                        break;
                    case 5:
                        p8 = 6;
                        break;
                    case 6:
                        p8 = 5;
                        break;
                    case 7:
                        p8 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp9.setAdapter(arrayAdapter);
        spinp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p9 = 10;
                        break;
                    case 2:
                        p9 = 9;
                        break;
                    case 3:
                        p9 = 8;
                        break;
                    case 4:
                        p9 = 7;
                        break;
                    case 5:
                        p9 = 6;
                        break;
                    case 6:
                        p9 = 5;
                        break;
                    case 7:
                        p9 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp10.setAdapter(arrayAdapter);
        spinp10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p10 = 10;
                        break;
                    case 2:
                        p10 = 9;
                        break;
                    case 3:
                        p10 = 8;
                        break;
                    case 4:
                        p10 = 7;
                        break;
                    case 5:
                        p10 = 6;
                        break;
                    case 6:
                        p10 = 5;
                        break;
                    case 7:
                        p10 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp11.setAdapter(arrayAdapter);
        spinp11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p11 = 10;
                        break;
                    case 2:
                        p11 = 9;
                        break;
                    case 3:
                        p11 = 8;
                        break;
                    case 4:
                        p11 = 7;
                        break;
                    case 5:
                        p11 = 6;
                        break;
                    case 6:
                        p11 = 5;
                        break;
                    case 7:
                        p11 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp12.setAdapter(arrayAdapter);
        spinp12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p12 = 10;
                        break;
                    case 2:
                        p12 = 9;
                        break;
                    case 3:
                        p12 = 8;
                        break;
                    case 4:
                        p12 = 7;
                        break;
                    case 5:
                        p12 = 6;
                        break;
                    case 6:
                        p12 = 5;
                        break;
                    case 7:
                        p12 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp13.setAdapter(arrayAdapter);
        spinp13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p13 = 10;
                        break;
                    case 2:
                        p13 = 9;
                        break;
                    case 3:
                        p13 = 8;
                        break;
                    case 4:
                        p13 = 7;
                        break;
                    case 5:
                        p13 = 6;
                        break;
                    case 6:
                        p13 = 5;
                        break;
                    case 7:
                        p13 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp14.setAdapter(arrayAdapter);
        spinp14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p14 = 10;
                        break;
                    case 2:
                        p14 = 9;
                        break;
                    case 3:
                        p14 = 8;
                        break;
                    case 4:
                        p14 = 7;
                        break;
                    case 5:
                        p14 = 6;
                        break;
                    case 6:
                        p14 = 5;
                        break;
                    case 7:
                        p14 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp15.setAdapter(arrayAdapter);
        spinp15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p15 = 10;
                        break;
                    case 2:
                        p15 = 9;
                        break;
                    case 3:
                        p15 = 8;
                        break;
                    case 4:
                        p15 = 7;
                        break;
                    case 5:
                        p15 = 6;
                        break;
                    case 6:
                        p15 = 5;
                        break;
                    case 7:
                        p15 = 0;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spinp16.setAdapter(arrayAdapter);
        spinp16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        p16 = 10;
                        break;
                    case 2:
                        p16 = 9;
                        break;
                    case 3:
                        p16 = 8;
                        break;
                    case 4:
                        p16 = 7;
                        break;
                    case 5:
                        p16 = 6;
                        break;
                    case 6:
                        p16 = 5;
                        break;
                    case 7:
                        p16 = 0;
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
                double x = ((a1*4)+(a2*4)+(a3*4)+(a4*4)+(a5*4)+(a6*4)+(a7*4)+(a8*4)+(a9*4)+(a10*4)+(a11*4)+(a12*4)+(a13*4)+(a14*4)+(a15*4)+(a16*4)+(a17*4)+(a18*4)+(a19*4)+(a20*4)+(a21*4)+(a22*4)+(a23*4)+(a24*4)+(a25*4)+(a26*4)+(a27*4)+(a28*4)+(a29*4)+(p1*2)+(p2*2)+(p3*2)+(p4*2)+(p5*2)+(p6*2)+(p7*2)+(p8*2)+(p9*2)+(p10*2)+(p11*2)+(p12*2)+(p13*2)+(p14*2)+(p15*2)+(p16*1))/147 ;
                String s = Double.toString(x);
                textView.setText(s);
            }
        });
    }
}
