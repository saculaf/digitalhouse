package com.example.digitalhouse.listviewfriday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 30/09/16.
 */
public class AdapterProductos extends BaseAdapter {

    //ESTOS DOS ATRIBUTOS SON NECESARIOS PARA CONECTAR LOS DATOS CON LA VISTA

    private List<Producto> productos;
    private Context context;


    public AdapterProductos(List<Producto> productos, Context context) {
        this.productos = productos;
        this.context = context;
    }

    @Override
    //CUENTA CUANTOS ELEMENTOS VOY A MOSTRAR EN EL LISTVIEW
    public int getCount() {
        return productos.size();
    }

    @Override
    //DEVUELVE EL OBJETO QUE SE ENCUENTRA EN LA POSICION i
    public Producto getItem(int i) {
        return productos.get(i);
    }

    @Override
    //DEVUELVE EL ID DEL OBJETO QUE SE ENCUENTRA EN LA POSICION i
    public long getItemId(int i) {
        return i;
    }

    @Override
    //DEVUELVE LA VISTA QUE CONTIENE EL OBJETO EN LA POSICION i (CADA CELDA)
    public View getView(int i, View view, ViewGroup viewGroup) {

        //AGARRA EL XML Y LO INFLA

        //PIDO UN INFLADOR
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //AGARRO EL INFLADOR E INFLO LA VISTA DETALLE
        view = layoutInflater.inflate(R.layout.listview_detalle, viewGroup, false);

        //QUIERO MOSTRAR UNA NUEVA CELDA CON UN PRODUCTO

        Producto unProductoAMostrar = getItem(i);

        TextView unTexViewNombre = (TextView) view.findViewById(R.id.nombre);
        unTexViewNombre.setText(unProductoAMostrar.getNombre());

        ImageView imageView = (ImageView) view.findViewById(R.id.imagen);
        imageView.setImageResource(unProductoAMostrar.getImagen());

        return view;
    }
}
