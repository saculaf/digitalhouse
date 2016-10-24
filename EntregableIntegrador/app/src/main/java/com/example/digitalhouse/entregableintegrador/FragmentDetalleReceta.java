package com.example.digitalhouse.entregableintegrador;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleReceta extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_detalle_receta, container, false);

        Bundle unBundle = getArguments();

        String nombreRecibido = unBundle.getString("Nombre");
        String descripcionCortaRecibida = unBundle.getString("DescripcionCorta");
        String descripcionLargaRecibida = unBundle.getString("DescripcionLarga");
        int imagenRecibida = unBundle.getInt("Foto");

        TextView nombreMostrable = (TextView) view.findViewById(R.id.nombreDetalleReceta2);
        nombreMostrable.setText("Receta de: " + nombreRecibido);

        TextView descripcionCortaMostrable = (TextView) view.findViewById(R.id.descripcionCortaDetalleReceta2);
        descripcionCortaMostrable.setText("Vamos a cocinar: " + descripcionCortaRecibida);

        TextView descripcionLargaMostrable = (TextView) view.findViewById(R.id.descripcionLargaDetalleReceta);
        descripcionLargaMostrable.setText("Resumen: " + descripcionLargaRecibida);

        ImageView imagenMostrable = (ImageView) view.findViewById(R.id.imagenDetalleReceta2);
        imagenMostrable.setImageResource(imagenRecibida);

        return view;

    }

}
