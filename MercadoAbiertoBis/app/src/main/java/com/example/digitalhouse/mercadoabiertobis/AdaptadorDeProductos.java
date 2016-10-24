package com.example.digitalhouse.mercadoabiertobis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by digitalhouse on 05/10/16.
 */
public class AdaptadorDeProductos extends BaseAdapter{

    private Context unContexto;
    private List<Producto> listaDeProductos;

    public AdaptadorDeProductos(Context unContexto, List<Producto> listaDeProductos) {
        this.unContexto = unContexto;
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public int getCount() {
        return listaDeProductos.size();
    }

    @Override
    public Producto getItem(int i) {
        return listaDeProductos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Producto unProducto = getItem(i);

        LayoutInflater layoutInflater= (LayoutInflater)unContexto.getSystemService(unContexto.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.celda_producto, viewGroup, false);

        TextView textViewNombreProducto = (TextView) view.findViewById(R.id.nombreProducto);
        TextView textViewPrecio = (TextView) view.findViewById(R.id.platitaProducto);

        textViewNombreProducto.setText(unProducto.getNombre());
        textViewNombreProducto.setText(unProducto.getPrecio().toString());


        return view;
    }
}
