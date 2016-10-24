package com.example.digitalhouse.entregableintegrador;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestoFragment extends Fragment {


    public static RestoFragment dameUnFragment(Resto resto) {
        RestoFragment fragmentResto = new RestoFragment();
        Bundle args = new Bundle();
        args.putString("Resto", resto.getNombre());
        args.putString("Descripcion", resto.getDescripcion());
        args.putInt("Imagen", resto.getImagen());

        fragmentResto.setArguments(args);
        return fragmentResto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resto, container, false);

        ImageView imagenParaMostrar = (ImageView) view.findViewById(R.id.imagenResto);
        TextView nombreParaMostrar = (TextView) view.findViewById(R.id.textViewNombreResto);
        TextView descripcionParaMostrar = (TextView) view.findViewById(R.id.textViewDescripcionResto);

        Bundle bundle = getArguments();
        Integer imagen = bundle.getInt("Imagen");
        String nombre = bundle.getString("Resto");
        String descripcion = bundle.getString("Descripcion");

        imagenParaMostrar.setImageResource(imagen);
        nombreParaMostrar.setText(nombre);
        descripcionParaMostrar.setText(descripcion);

        return view;
    }

}
