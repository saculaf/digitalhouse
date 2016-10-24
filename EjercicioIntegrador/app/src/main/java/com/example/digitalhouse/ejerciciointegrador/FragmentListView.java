package com.example.digitalhouse.ejerciciointegrador;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListView extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);

        //OBTENER LOS DATOS
        List<Producto> productos = Producto.obtenerProductos();

        //CREO EL ADAPTER - EL CONTEXTO ES EL MAIN ACTIVITY POR ESO USAMOS THIS
        AdapterProductos adapterProductos = new AdapterProductos(productos, this.getActivity());

        //SETEARLE EL ADAPTER AL LISTVIEW
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapterProductos);

        return view;

    }

}
