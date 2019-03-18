package com.vishnu.bunkmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Boolean;
import java.lang.String;
import java.lang.Integer;
import java.lang.*;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {

   // Button my=(Button) findViewById(R.id.button2);
    //Button my=(Button) findViewById(R.id.button2);
    public void min(View view) {
        switch (view.getId()) {
            case (R.id.button2): {
                TextView t3=findViewById(R.id.textView);
                t3.setText("");
                EditText text =  findViewById(R.id.editText);
             //   Button my = (Button) findViewById(R.id.button2)
                String txt=text.getText().toString();
                TextView t=findViewById(R.id.textView);
               // text.setText(txt);
                if ((txt.compareTo(""))==0) {
                    text.setText("0");
                    //  tt.setText("1");
                }
                else {
                  int nume = Integer.parseInt(text.getText().toString());
               // System.out.print(nume);
                    if (nume > 0) {
                        nume--;
                        text.setText(""+nume);
                    } else {
                        text.setText(""+0);
                    }
                }
            }
            break;
            case (R.id.button): {
                TextView t3=findViewById(R.id.textView);
                t3.setText("");
                EditText text= findViewById(R.id.editText);
                String txt = text.getText().toString();
                int nume;
                if (txt.equals("")) {
                    text.setText("0");
                } else {
                    nume =Integer.parseInt(text.getText().toString());
                    if (nume >= 0) {
                        nume++;
                        text.setText(nume+"");
                    } else {
                        text.setText(0+"");
                    }
                }
            }
            break;
            case(R.id.button3):{
                EditText t1=findViewById(R.id.editText2);
                EditText t2=findViewById(R.id.editText3);
                EditText t4=findViewById(R.id.editText);
                TextView t3=findViewById(R.id.textView);
                float number;
                if((t1.getText().toString()).equals("") || (t2.getText().toString()).equals("") || (t4.getText().toString()).equals("")){
                    Toast.makeText(MainActivity.this,"Enter the all fields",Toast.LENGTH_LONG).show();
                    t3.setText("");
                }
                else{
                    number=(Float.parseFloat(t2.getText().toString()) * Float.parseFloat(t1.getText().toString()))/100;
                    number=(Float.parseFloat(t1.getText().toString())-number)-(Float.parseFloat(t4.getText().toString()));
                    if(number>=0) {
                        t3.setText("THE safe bunks are " + (int)floor(number));
                    }
                    else{
                        number=Float.parseFloat(t4.getText().toString())*100/(100-(Float.parseFloat(t2.getText().toString())));
                        number=number-Float.parseFloat(t1.getText().toString());
                        t3.setText("YOU DOESNT HAVE SAFE BUNKS. ATTEND "+ (int)ceil(number) + " MORE CLASSES TO REACH REQUIRED PERCENTAGE");
                    }
                }
            }
            break;
            case(R.id.editText3):{
                TextView t3=findViewById(R.id.textView);
                t3.setText("");
            }
            break;
            case(R.id.editText2):{
                TextView t3=findViewById(R.id.textView);
                t3.setText("");
            }
            break;
            case(R.id.editText):{
                TextView t3=findViewById(R.id.textView);
                t3.setText("");
            }
            break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
