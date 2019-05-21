package com.example.dell_pc.convertidordeunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button cal;
    EditText txt;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String met = getIntent().getStringExtra("user");
        Toast.makeText(Main2Activity.this ,""+met,Toast.LENGTH_LONG ).show();

        cal = (Button)findViewById(R.id.BTNcalcular);
        txt = (EditText)findViewById(R.id.editText);
        txt2 = (TextView)findViewById(R.id.textView6);

        if(met == null)
        {
            cal.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String var = txt.getText().toString();
                    Double op1 = Double.parseDouble(var);
                    double res = op1 + 273.15;
                    txt2.setText(""+res+" K");
                }
            });
        }
        if(met == "1")
        {
            cal.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String var = txt.getText().toString();
                    Double op1 = Double.parseDouble(var);
                    double res = op1 - 273.15;
                    txt2.setText(""+res+" C");
                }
            });
        }
        if(met == "2")
        {
            cal.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String var = txt.getText().toString();
                    Double op1 = Double.parseDouble(var);
                    double res = op1 /10000;
                    txt2.setText(""+res+" H");
                }
            });
        }
        if(met == "3")
        {
            cal.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String var = txt.getText().toString();
                    Double op1 = Double.parseDouble(var);
                    double res = op1 * 10000;
                    txt2.setText(""+res+" m²");
                }
            });
        }
        if(met == "4")
        {
            cal.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String var = txt.getText().toString();
                    Double op1 = Double.parseDouble(var);
                    double res = op1 * 100;
                    txt2.setText(""+res+" cm");
                }
            });
        }
        if(met == "5")
        {
            cal.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String var = txt.getText().toString();
                    Double op1 = Double.parseDouble(var);
                    double res = op1 / 100;
                    txt2.setText(""+res+" m");
                }
            });
        }
    }
}
