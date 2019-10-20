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

public class GPA_2 extends AppCompatActivity {
    TextView textView;
    double a,b,c,d,e,f,p,q,r;
    Button bt;
    Spinner spin1, spin2, spin3, spin4, spin5, spin6,spinp1,spinp2,spinp3;
    String grade[]  = {"S","A","B","C","D","E","F"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.gpa_2);
        textView = (TextView)findViewById(R.id.text);
        spin1 = (Spinner)findViewById(R.id.s1);
        spin2 = (Spinner)findViewById(R.id.s2);
        spin3 = (Spinner)findViewById(R.id.s3);
        spin4 = (Spinner)findViewById(R.id.s4);
        spin5 = (Spinner)findViewById(R.id.s5);
        spin6 = (Spinner)findViewById(R.id.s6);
        spinp1 = (Spinner)findViewById(R.id.sp1);
        spinp2 = (Spinner)findViewById(R.id.sp2);
        spinp3 = (Spinner)findViewById(R.id.sp3);
        bt = (Button)findViewById(R.id.button);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, simple_list_item_1, grade);
        spin1.setAdapter(arrayAdapter);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        a = 10;
                        break;
                    case 2:
                        a = 9;
                        break;
                    case 3:
                        a = 8;
                        break;
                    case 4:
                        a= 7;
                        break;
                    case 5:
                        a = 6;
                        break;
                    case 6:
                        a = 5;
                        break;
                    case 7:
                        a =0;
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
                        b = 10;
                        break;
                    case 2:
                        b = 9;
                        break;
                    case 3:
                        b = 8;
                        break;
                    case 4:
                        b= 7;
                        break;
                    case 5:
                        b = 6;
                        break;
                    case 6:
                        b = 5;
                        break;
                    case 7:
                        b =0;
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
                        c = 10;
                        break;
                    case 2:
                        c = 9;
                        break;
                    case 3:
                        c = 8;
                        break;
                    case 4:
                        c = 7;
                        break;
                    case 5:
                        c = 6;
                        break;
                    case 6:
                        c = 5;
                        break;
                    case 7:
                        c = 0;
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
                        d = 10;
                        break;
                    case 2:
                        d = 9;
                        break;
                    case 3:
                        d = 8;
                        break;
                    case 4:
                        d = 7;
                        break;
                    case 5:
                        d = 6;
                        break;
                    case 6:
                        d = 5;
                        break;
                    case 7:
                        d = 0;
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
                        e = 10;
                        break;
                    case 2:
                        e = 9;
                        break;
                    case 3:
                        e = 8;
                        break;
                    case 4:
                        e = 7;
                        break;
                    case 5:
                        e = 6;
                        break;
                    case 6:
                        e = 5;
                        break;
                    case 7:
                        e = 0;
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
                        f = 10;
                        break;
                    case 2:
                        f = 9;
                        break;
                    case 3:
                        f = 8;
                        break;
                    case 4:
                        f = 7;
                        break;
                    case 5:
                        f = 6;
                        break;
                    case 6:
                        f = 5;
                        break;
                    case 7:
                        f = 0;
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
                        p = 10;
                        break;
                    case 2:
                        p = 9;
                        break;
                    case 3:
                        p = 8;
                        break;
                    case 4:
                        p = 7;
                        break;
                    case 5:
                        p = 6;
                        break;
                    case 6:
                        p = 5;
                        break;
                    case 7:
                        p = 0;
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
                        q = 10;
                        break;
                    case 2:
                        q = 9;
                        break;
                    case 3:
                        q = 8;
                        break;
                    case 4:
                        q = 7;
                        break;
                    case 5:
                        q = 6;
                        break;
                    case 6:
                        q = 5;
                        break;
                    case 7:
                        q = 0;
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
                        r = 10;
                        break;
                    case 2:
                        r = 9;
                        break;
                    case 3:
                        r = 8;
                        break;
                    case 4:
                        r = 7;
                        break;
                    case 5:
                        r = 6;
                        break;
                    case 6:
                        r = 5;
                        break;
                    case 7:
                        r = 0;
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
                double x = ((a*4)+(b*4)+(c*4)+(d*4)+(e*4)+(f*4)+(p*2)+(q*2)+(r*2))/30 ;
                String s = Double.toString(x);
                textView.setText(s);
                //Toast.makeText(GPA_1.this,"your gpa is "+s,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
