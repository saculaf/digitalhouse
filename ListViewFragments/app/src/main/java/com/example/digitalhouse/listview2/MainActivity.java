package com.example.digitalhouse.listview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList listadoDeTemas = Tema.generoLista();
    private AdaptadorDeTemas miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miAdaptador = new AdaptadorDeTemas(listadoDeTemas, this);

        ListView listViewDeTemas = (ListView) findViewById(R.id.listViewMain);

        listViewDeTemas.setAdapter(miAdaptador);
        listViewDeTemas.setOnItemClickListener(new escuchadorDeTemas());

    }

    class escuchadorDeTemas implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> referencia, View vista, int posicionTocada, long IDPosicionTocada) {
            Tema temaTocado = (Tema) referencia.getItemAtPosition(posicionTocada);

            Toast.makeText(MainActivity.this, temaTocado.getTema(), Toast.LENGTH_SHORT).show();

            String temaAEnviar = temaTocado.getTema();
            String bandaAEnviar = temaTocado.getBanda();
            Integer anioAEnviar = temaTocado.getLanzamiento();
            Boolean checkBoxAEnviar = temaTocado.getEsViejita();
            Integer fotoAEnviar = temaTocado.getFoto();

            Intent unIntent = new Intent(MainActivity.this, MainDetalleActivity.class);

            Bundle unBundle = new Bundle();
            unBundle.putString("Tema",temaAEnviar);
            unBundle.putString("Banda",bandaAEnviar);
            unBundle.putInt("Lanzamiento",anioAEnviar);
            unBundle.putBoolean("EsViejita",checkBoxAEnviar);
            unBundle.putInt("Foto",fotoAEnviar);

            unIntent.putExtras(unBundle);

            startActivity(unIntent);

        }
    }

}