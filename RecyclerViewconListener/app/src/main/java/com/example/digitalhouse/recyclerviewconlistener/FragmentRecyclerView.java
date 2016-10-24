package com.example.digitalhouse.recyclerviewconlistener;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecyclerView extends Fragment {

    private RecyclerView recyclerViewProductos;
    private AdaptadorProductosRecycler adaptadorProductosRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        //OBTENER LOS DATOS
        List<Producto> productos = Producto.obtenerProductos();

        //Aca es donde obtengo el recycler view
//        ListView listViewJuguetes = (ListView)findViewById(R.id.listViewJuguetes);
        recyclerViewProductos = (RecyclerView) view.findViewById(R.id.recyclerViewProductos);

        //Le decios que no va a variar el tamanio de la lista
        recyclerViewProductos.setHasFixedSize(true);

        //Le pedimos que muestre las cosas en forma de lista
        recyclerViewProductos.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false));

        ListenerFragments unListenerFragments = new ListenerFragments();

        //Creamos el adaptador del recycler
//        AdaptadorDeJuguetes adaptadorDeJuguetes = new AdaptadorDeJuguetes(this,listaDeJuguetes);

        adaptadorProductosRecycler = new AdaptadorProductosRecycler(productos, this.getActivity(), unListenerFragments);

        //Le damos el adapter al Recycler
//        listViewJuguetes.setAdapter(adaptadorDeJuguetes);
        recyclerViewProductos.setAdapter(adaptadorProductosRecycler);

        return view;
    }

    //LISTENER PARA EL RECYCLER VIEW
    private class ListenerFragments implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            //BUSCA EL ACTIVITY A LA QUE QUIERO NOTIFICAR
            ComunicadorEntreFragmentYActivity unComunicadorDeFragment = (ComunicadorEntreFragmentYActivity) getActivity();

            Integer posicionTocada = recyclerViewProductos.getChildAdapterPosition(view);

            Producto productoTocado = adaptadorProductosRecycler.dameProducto(posicionTocada);

            //NOTIFICO A LA ACTIVITY Y ENVIO EL MENSAJE
            unComunicadorDeFragment.notificarClickAlActivity(productoTocado);

            Toast.makeText(getActivity(), productoTocado.getNombre(), Toast.LENGTH_SHORT).show();

        }
    }

    public interface ComunicadorEntreFragmentYActivity{

        public void notificarClickAlActivity(Producto producto);

    }



}
