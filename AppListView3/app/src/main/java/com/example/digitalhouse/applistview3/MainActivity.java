package com.example.digitalhouse.applistview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList listadoDeTemas = Tema.generoLista();
    private AdaptadorDeTemas miAdaptador;

    private void actualizarContadorDeTemas(){
        TextView totalDeTemas = (TextView) findViewById(R.id.textViewCantidadDeElementos);
        totalDeTemas.setText("Cantidad de Temas: " + listadoDeTemas.size());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miAdaptador = new AdaptadorDeTemas(listadoDeTemas, this);

        ListView listViewDeTemas = (ListView) findViewById(R.id.listViewPrincipal);

        listViewDeTemas.setAdapter(miAdaptador);

        actualizarContadorDeTemas();

    }

    public void registro(View view){
        EditText temaAAgregar = (EditText) findViewById(R.id.editTextNombreDelTemaMain);
        EditText bandaAAgregar = (EditText) findViewById(R.id.editTextBandaDelTemaMain);
        EditText lanzamientoAAgregar = (EditText) findViewById(R.id.editTextAnioDelTemaMain);

        String temaIngresado = temaAAgregar.getText().toString();
        String bandaIngresada = bandaAAgregar.getText().toString();
        String anioRecibido = lanzamientoAAgregar.getText().toString();


        if(temaIngresado.isEmpty() || bandaIngresada.isEmpty() || anioRecibido.isEmpty()){
            Toast.makeText(MainActivity.this, "Ingresar Todos los Datos", Toast.LENGTH_SHORT).show();
        }else {
            Integer lanzamientoIngresado = Integer.parseInt(anioRecibido);

            Tema nuevoTema = new Tema(temaIngresado, bandaIngresada, lanzamientoIngresado);

            listadoDeTemas.add(nuevoTema);

            miAdaptador.notifyDataSetChanged();

            actualizarContadorDeTemas();
        }

    }




}
