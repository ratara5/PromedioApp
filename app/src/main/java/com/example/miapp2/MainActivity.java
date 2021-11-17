package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_matematicas);
        et2=(EditText)findViewById(R.id.txt_fisica);
        et3=(EditText)findViewById(R.id.txt_quimica);

        tv1=(TextView)findViewById(R.id.tv_status);
    }

    public void status(View view){
        String matematicas_String=et1.getText().toString();
        String fisica_String=et2.getText().toString();
        String quimica_String=et3.getText().toString();

        int matematicas_int=Integer.parseInt(matematicas_String);
        int fisica_int=Integer.parseInt(fisica_String);
        int quimica_int=Integer.parseInt(quimica_String);

        int promedio=(matematicas_int+fisica_int+quimica_int)/3;

        if(promedio>=6){
            tv1.setText("Status Aprobado con "+promedio);

        }else if(promedio<=5){
            tv1.setText("Status Reprobado con "+promedio);

        }

    }

}