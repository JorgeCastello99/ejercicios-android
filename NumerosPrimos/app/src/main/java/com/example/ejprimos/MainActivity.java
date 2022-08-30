package com.example.ejprimos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btcalcular;
    TextView txtresul;
    EditText edittxt;
    int resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btcalcular=(Button)findViewById(R.id.botonC);
        btcalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        edittxt=(EditText)findViewById(R.id.txtentrada);
        if(edittxt.getText().toString().equals("")){
            edittxt.setText("0");
        }

        int numero=Integer.parseInt(edittxt.getText().toString());
        txtresul = (TextView) findViewById(R.id.txt2);
        int re=ejPrimos(numero);
        String padre1=getString(R.string.resultado);
        String padre2=getString(R.string.resultado2);

        txtresul.setText(padre1+" "+numero+" "+padre2+" "+re);

    /*   ArrayList<Integer> prims = new ArrayList<Integer>();

        prims.set(numero,re);*/
    }

    public int ejPrimos(int numero){

        int bucle=-1;
        int primos=0;
        int bucle2;
        int resul;
        int u;
        for(u=2;u<99999;u++){
            bucle2=0;

            for(int i=1;i<=u;i++){
                if(u%i==0){
                    bucle2++;
                }

            }
            if(bucle2==2){

                primos++;
            }
            if(primos==numero){



                break;
            }
        }
        return u;
    }



}
