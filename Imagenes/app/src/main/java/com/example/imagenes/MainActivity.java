package com.example.imagenes;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MENSAJE="com.example.ejercicio1.MESSAGE";
    Intent inten;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClickImagenFlor(View view) {

        mostrarToast(getString(R.string.esto_es_una_flor));
        txt=getString(R.string.esto_es_una_flor);



    }

    public void mostrarToast(String mensaje){

        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();

    }

    public void onClickAstronauta(View view) {
        txt=getString(R.string.esto_es_un_astronauta);

        mostrarToast(getString(R.string.esto_es_un_astronauta));

    }

    public void onClickSaludo(View view) {

        txt=getString(R.string.esto_es_un_saludo);
        mostrarToast(getString(R.string.esto_es_un_saludo));

    }

    public void onClickBotonCloud(View view){

    Intent inten= new Intent(this, IntentActivity.class);
        inten.putExtra(EXTRA_MENSAJE,txt);

        startActivity(inten);


    // inten.putExtra(EXTRA_MENSAJE,texot);

    }
}

