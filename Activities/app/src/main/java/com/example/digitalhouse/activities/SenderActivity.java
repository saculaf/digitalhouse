package com.example.digitalhouse.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
    }

    public void enviarMensaje(View view){

        TextView unEditTextNombre= (EditText) findViewById(R.id.editText1);
        String unNombreIngresado = unEditTextNombre.getText().toString();

        TextView unEditTextApellido= (EditText) findViewById(R.id.editText2);
        String unApellidoIngresado = unEditTextApellido.getText().toString();

        TextView unEditTextEdad= (EditText) findViewById(R.id.editText3);
        String unaEdadIngresada = unEditTextEdad.getText().toString();


        Intent unIntent = new Intent(SenderActivity.this, ReceptorActivity.class);

        Bundle unBundle = new Bundle();
        unBundle.putString("Nombre",unNombreIngresado);
        unBundle.putString("Apellido",unApellidoIngresado);
        unBundle.putString("Edad",unaEdadIngresada);

        unIntent.putExtras(unBundle);

        startActivity(unIntent);
    }

}
