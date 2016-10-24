package com.example.digitalhouse.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 26/09/16.
 */
public class AdaptadorDeTemas extends BaseAdapter{

    private ArrayList<Tema> unListadoDeTemas;
    private Context unContexto;

    public AdaptadorDeTemas(ArrayList<Tema> unListadoDeTemas, Context unContexto) {
        this.unListadoDeTemas = unListadoDeTemas;
        this.unContexto = unContexto;
    }


    @Override
    public View getView(int posicionAMostrar, View vistaActual, ViewGroup grupoActual) {
        View unaVistaAMostrar;

        LayoutInflater infladorDeTemas = (LayoutInflater) unContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        unaVistaAMostrar = infladorDeTemas.inflate(R.layout.layout_second, grupoActual, false);

        TextView nombreTema = (TextView) unaVistaAMostrar.findViewById(R.id.textViewTema);
        TextView nombreBanda = (TextView) unaVistaAMostrar.findViewById(R.id.textViewBanda);
        TextView anioLanzamiento = (TextView) unaVistaAMostrar.findViewById(R.id.textViewLanzamiento);
        ImageView foto = (ImageView) unaVistaAMostrar.findViewById(R.id.imageViewFoto);

        Tema temaDeLaPosicion = unListadoDeTemas.get(posicionAMostrar);

        nombreTema.setText("Nombre del Tema: " + temaDeLaPosicion.getTema());
        nombreBanda.setText("Banda: " + temaDeLaPosicion.getBanda());
        anioLanzamiento.setText("Año de Lanzamiento: " + temaDeLaPosicion.getLanzamiento().toString());
        foto.setImageResource(temaDeLaPosicion.getFoto());

        return unaVistaAMostrar;
    }

    @Override
    public int getCount() {
        return unListadoDeTemas.size();
    }

    @Override
    public Tema getItem(int posicionDelTema) {
        return unListadoDeTemas.get(posicionDelTema);
    }

    @Override
    public long getItemId(int posicionDelTema) {
        return posicionDelTema;
    }
}