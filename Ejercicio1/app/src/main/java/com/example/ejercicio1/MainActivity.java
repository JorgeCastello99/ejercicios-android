package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MENSAJE="com.example.ejercicio1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        EditText editt=findViewById(R.id.eTxt);
        String texot=editt.getText().toString();
        Intent inten= new Intent(this, MensajeActivity.class);
        inten.putExtra(EXTRA_MENSAJE,texot);
        startActivity(inten);
    }


}
