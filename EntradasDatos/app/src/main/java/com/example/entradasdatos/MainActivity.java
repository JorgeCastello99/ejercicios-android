package com.example.entradasdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Spinner.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> aa=ArrayAdapter.createFromResource(this,R.array.spin,android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
        sp.setOnItemSelectedListener(this);
            }




    public void onClickRadioButton(View view) {

        boolean click=((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.rButtonDia:
                if(click)mostrarToast(getString(R.string.en_el_mismo_dia_string));
                break;

            case R.id.rButtonDia2:
                if(click)mostrarToast(getString(R.string.en_el_siguiente_dia));
                break;

            case R.id.rButtonDia3:
                if(click)mostrarToast(getString(R.string.racogida_string));
                break;

        }
    }
    public void mostrarToast(String mensaje){

        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
    }

    public void onClickSpinner(View view) {
        switch (view.getId()){

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                mostrarToast(getString(R.string.en_el_mismo_dia_string));
                break;
            case 1:
                mostrarToast(getString(R.string.en_el_siguiente_dia));
                break;
            case 2:
                mostrarToast(getString(R.string.racogida_string));
                break;
        }
           }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
