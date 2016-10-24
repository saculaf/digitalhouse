package com.example.digitalhouse.listviewfriday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //OBTENER LOS DATOS
        List<Producto> productos = Producto.obtenerProductos();

        //CREO EL ADAPTER - EL CONTEXTO ES EL MAIN ACTIVITY POR ESO USAMOS THIS
        AdapterProductos adapterProductos = new AdapterProductos(productos, this);

        //SETEARLE EL ADAPTER AL LISTVIEW
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapterProductos);
    }
}
