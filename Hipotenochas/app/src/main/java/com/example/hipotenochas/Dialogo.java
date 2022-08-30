package com.example.hipotenochas;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class Dialogo extends DialogFragment {
    RespuestaDialogoJava respuesta;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Usamos la clase Builder para construir el diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //Escribimos el título
        builder.setTitle("Pregunta muy importante:");
        //Escribimos la pregunta
        builder.setMessage("¿Consideras que sabes Java?");
        //añadimos el botón de Si y su acción asociada




        builder.setPositiveButton("¡SI!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                respuesta.onRespuesta("No me lo creo...");
            }
        });


        //añadimos el botón de No y su acción asociada
        builder.setNegativeButton("¡NO!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                respuesta.onRespuesta("Gracias por tu sinceridad");
            }
        });


        // Crear el AlertDialog y devolverlo
        return builder.create();
    }


    public interface RespuestaDialogoJava{
        public void onRespuesta(String s);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        respuesta=(RespuestaDialogoJava)activity;
    }
}
