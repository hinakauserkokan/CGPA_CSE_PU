package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class GPA_Home extends AppCompatActivity {
    Spinner sp;
    Button bt;
    int flag;
    String sem[] ={"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth"};
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_gpa__home);
        sp = (Spinner)findViewById(R.id.spinner);
        bt =(Button)findViewById(R.id.button);
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sem);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        flag=1;
                        break;
                    case 1:
                        flag=2;
                        break;
                    case 2:
                        flag=3;
                        break;
                    case 3:
                        flag=4;
                        break;
                    case 4:
                        flag=5;
                        break;
                    case 5:
                        flag=6;
                        break;
                    case 6:
                        flag=7;
                        break;
                    case 7:
                        flag=8;
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
                if(flag==1){
                    Intent i1 = new Intent(GPA_Home.this,GPA_1.class);
                    startActivity(i1);
                }
                else if(flag==2){
                    Intent i2 = new Intent(GPA_Home.this,GPA_2.class);
                    startActivity(i2);
                }
                else if(flag==3){
                    Intent i3 = new Intent(GPA_Home.this,GPA_3.class);
                    startActivity(i3);
                }
                else if(flag==4){
                    Intent i4 = new Intent(GPA_Home.this,GPA_4.class);
                    startActivity(i4);
                }
                else if(flag==5){
                    Intent i5 = new Intent(GPA_Home.this,GPA_5.class);
                    startActivity(i5);
                }
                else if(flag==6){
                    Intent i6 = new Intent(GPA_Home.this,GPA_6.class);
                    startActivity(i6);
                }
                else if(flag==7){
                    Intent i7 = new Intent(GPA_Home.this,GPA_7.class);
                    startActivity(i7);
                }
                else if(flag==8){
                    Intent i8 = new Intent(GPA_Home.this,GPA_8.class);
                    startActivity(i8);
                }
            }
        });
    }
}
