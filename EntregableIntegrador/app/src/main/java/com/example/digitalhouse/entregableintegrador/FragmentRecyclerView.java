package com.example.digitalhouse.entregableintegrador;


import android.os.Bundle;
import android.app.Fragment;
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

    private RecyclerView recyclerViewRecetas;
    private AdaptadorRecetasRecycler adaptadorRecetasRecycler;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_recycler_view, container, false);

        List<Receta> recetas = AdaptadorRecetasRecycler.getListaDeRecetas();

        //Aca es donde obtengo el recycler view
        recyclerViewRecetas = (RecyclerView) view.findViewById(R.id.recyclerViewRecetas);

        //Le decimos que no va a variar el tamanio de la lista
        recyclerViewRecetas.setHasFixedSize(true);

        //Le pedimos que muestre las cosas en forma de lista
        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(this.getActivity(), LinearLayoutManager.VERTICAL, false));

        ListenerFragments unListenerFragments = new ListenerFragments();

        //Creamos el adaptador del recycler
//        AdaptadorDeJuguetes adaptadorDeJuguetes = new AdaptadorDeJuguetes(this,listaDeJuguetes);

        adaptadorRecetasRecycler = new AdaptadorRecetasRecycler(recetas, this.getActivity(), unListenerFragments);

        //Le damos el adapter al Recycler
//        listViewJuguetes.setAdapter(adaptadorDeJuguetes);
        recyclerViewRecetas.setAdapter(adaptadorRecetasRecycler);

        return view;

    }

    //LISTENER PARA EL RECYCLER VIEW
    private class ListenerFragments implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            //BUSCA EL ACTIVITY A LA QUE QUIERO NOTIFICAR
            ComunicadorEntreFragmentYActivity unComunicadorDeFragment = (ComunicadorEntreFragmentYActivity) getActivity();

            Integer posicionTocada = recyclerViewRecetas.getChildAdapterPosition(view);

            Receta recetaTocada = adaptadorRecetasRecycler.dameReceta(posicionTocada);

            //NOTIFICO A LA ACTIVITY Y ENVIO EL MENSAJE
            unComunicadorDeFragment.notificarClickAlActivity(recetaTocada);

            Toast.makeText(getActivity(), recetaTocada.getNombre(), Toast.LENGTH_SHORT).show();

        }
    }

    public interface ComunicadorEntreFragmentYActivity{

        public void notificarClickAlActivity(Receta receta);

    }


}
