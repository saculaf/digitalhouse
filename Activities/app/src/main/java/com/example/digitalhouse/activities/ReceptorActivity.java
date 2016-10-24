package com.example.digitalhouse.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceptorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();

        String unNombreRecibido= unBundle.getString("Nombre");
        String unApellidoRecibido= unBundle.getString("Apellido");
        String unaEdadRecibida= unBundle.getString("Edad");

        TextView nombreRecibido = (TextView) findViewById(R.id.textViewNombreIngresado2);
        nombreRecibido.setText(unNombreRecibido);

        TextView apellidoRecibido = (TextView) findViewById(R.id.textViewApellidoIngresado2);
        apellidoRecibido.setText(unApellidoRecibido);

        TextView edadRecibida = (TextView) findViewById(R.id.textViewEdadIngresada2);
        edadRecibida.setText(unaEdadRecibida);

    }

}
