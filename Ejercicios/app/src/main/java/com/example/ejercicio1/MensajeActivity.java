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
        String mensaje1=inten.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        TextView txtn=findViewById(R.id.textView1);
        txtn.setText(mensaje1);

        String mensaje2=inten.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        TextView txta=findViewById(R.id.textView2);
        txta.setText(mensaje2);
        String mensaje3=inten.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        TextView txtc=findViewById(R.id.textView3);
        txtc.setText(mensaje3);



    }


}
