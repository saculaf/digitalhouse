package com.example.digitalhouse.recyclerviewconlistener;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleProducto extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_producto, container, false);

        Bundle unBundle = getArguments();

        String temaRecibido= unBundle.getString("Nombre");

        String nombreRecibido = unBundle.getString("Nombre");
        String descripcionRecibido = unBundle.getString("Descripcion");
        Integer precioRecibido = unBundle.getInt("Precio");
        int imagenRecibido = unBundle.getInt("Foto");

        TextView nombreMostrable = (TextView) view.findViewById(R.id.nombreDetalleProducto);
        nombreMostrable.setText("Producto: " + nombreRecibido);

        TextView descripcionMostrable = (TextView) view.findViewById(R.id.descripcionDetalleProducto);
        descripcionMostrable.setText("Modelo: " + descripcionRecibido);

        TextView precioMostrable = (TextView) view.findViewById(R.id.precioDetalleProducto);
        precioMostrable.setText("Precio: " + precioRecibido);

        ImageView imagenMostrable = (ImageView) view.findViewById(R.id.imagenDetalleProducto);
        imagenMostrable.setImageResource(imagenRecibido);

        return view;


    }

}
