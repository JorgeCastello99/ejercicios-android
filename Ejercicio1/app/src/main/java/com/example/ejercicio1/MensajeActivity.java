package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        Intent inten=getIntent();
        String mensaje=inten.getStringExtra(MainActivity.EXTRA_MENSAJE);
        TextView txtv=findViewById(R.id.txtV);
        txtv.setText(mensaje);
    }
}
