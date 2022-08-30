package com.example.intentimplicito;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editTUri,editTMaps,editTElegir;
    Button botonUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
    public void onClickSitioWeb(View view){
        editTUri=findViewById(R.id.editText);
        String url=editTUri.getText().toString();

        Uri pagina= Uri.parse(url);
        Intent intenImplicito=new Intent(Intent.ACTION_VIEW,pagina);
        if(intenImplicito.resolveActivity(getPackageManager())!=null){
            startActivity(intenImplicito);
        }
        else{
            Log.d("IntentImplicito","No puede encontrarse la actividad");
        }


    }

    public void onClickSitioMaps(View view){
        editTMaps=findViewById(R.id.editText2);
        String url=editTMaps.getText().toString();

        Uri dire=Uri.parse("geo:0,0?q="+url);

        Intent intenImplicitoM=new Intent(Intent.ACTION_VIEW,dire);
        if(intenImplicitoM.resolveActivity(getPackageManager())!=null){
            startActivity(intenImplicitoM);
        }
        else{
            Log.d("IntentImplicito","No puede encontrarse la actividad");
        }

    }

    public void onClickCompartir(View view){

        editTElegir=findViewById(R.id.editText3);
        String url=editTElegir.getText().toString();
        ShareCompat.IntentBuilder.from(this).setType("text/plain").setChooserTitle("Titulo del chooser").setText(url).startChooser();

    }
}
