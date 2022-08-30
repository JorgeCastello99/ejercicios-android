package com.example.imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Intent inten=getIntent();
        String mensaje=inten.getStringExtra(MainActivity.EXTRA_MENSAJE);
        TextView txtv=findViewById(R.id.textView5);
        txtv.setText(mensaje);
    }
}
