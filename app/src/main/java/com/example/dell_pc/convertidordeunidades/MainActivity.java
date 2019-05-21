package com.example.dell_pc.convertidordeunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this, Main2Activity.class);

        b1=(Button)findViewById(R.id.BTN1);
        b2=(Button)findViewById(R.id.BTN2);
        b3=(Button)findViewById(R.id.BTN3);
        b4=(Button)findViewById(R.id.BTN4);
        b5=(Button)findViewById(R.id.BTN5);
        b6=(Button)findViewById(R.id.BTN6);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = "1";
                startActivity(intent);
                intent.putExtra("user",user);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = "2";
                startActivity(intent);
                intent.putExtra("user",user);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = "3";
                startActivity(intent);
                intent.putExtra("user",user);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = "4";
                startActivity(intent);
                intent.putExtra("user",user);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = "5";
                startActivity(intent);
                intent.putExtra("user",user);
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = "6";
                startActivity(intent);
                intent.putExtra("user",user);
            }
        });
    }
}
