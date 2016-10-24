package com.example.digitalhouse.mercadoabiertobis;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListaProducto extends Fragment {

    private List<Producto> listaDeProductos;
    private SeleccionableDeProductos unSeleccionableDeProductos;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        unSeleccionableDeProductos = (SeleccionableDeProductos)activity;

    }



    public FragmentListaProducto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_producto, container, false);

        inicializarYCargarProductosEnLaLista();

        ListView listView = (ListView) view.findViewById(R.id.ListViewFragmentProducto);

        AdaptadorDeProductos adaptadorDeProductos = new AdaptadorDeProductos(getContext(), listaDeProductos);

        listView.setAdapter(adaptadorDeProductos);
        listView.setOnItemClickListener(new listenerDeProductos());

        return view;
    }

    private void inicializarYCargarProductosEnLaLista() {
        listaDeProductos = new ArrayList<>();

        listaDeProductos.add(new Producto("Coca","Puro Fuego", 18.50));
        listaDeProductos.add(new Producto("Fanta","Puro Fuego", 18.50));
        listaDeProductos.add(new Producto("Alfajor","Puro Fuego", 35.50));
        listaDeProductos.add(new Producto("Jugo","Puro Fuego", 125.50));
        listaDeProductos.add(new Producto("Chocolate","Puro Fuego", 25.50));
        listaDeProductos.add(new Producto("Cocaina","Puro Fuego", 20.00));
        listaDeProductos.add(new Producto("Sandwich","Puro Fuego", 10.50));

    }

    public class listenerDeProductos implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Producto unProductoSeleccionado = (Producto) adapterView.getItemAtPosition(i);
            SeleccionableDeProductos seleccionableDeProductos;

            unSeleccionableDeProductos.seleccionableDeProductos(unProductoSeleccionado);

        }
    }

    public interface SeleccionableDeProductos {
        public void seleccionableDeProductos(Producto unProducto);

    }
}
