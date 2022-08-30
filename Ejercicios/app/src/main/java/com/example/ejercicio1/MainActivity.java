package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE1="com.example.ejercicio1.MESSAGE";
    public static final String EXTRA_MESSAGE2="com.example.ejercicio2.MESSAGE";
    public static final String EXTRA_MESSAGE3="com.example.ejercicio3.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        EditText nombre,apellido,curso;

        nombre=findViewById(R.id.txtV1);
        apellido=findViewById(R.id.txtV2);
        curso=findViewById(R.id.txtV3);

        String texon=nombre.getText().toString();
        String texoa=apellido.getText().toString();
        String texoc=curso.getText().toString();

        Intent inten= new Intent(this, MensajeActivity.class);

        inten.putExtra(EXTRA_MESSAGE1,texon);
        inten.putExtra(EXTRA_MESSAGE2,texoa);
        inten.putExtra(EXTRA_MESSAGE3,texoc);

        startActivity(inten);


    }

}
