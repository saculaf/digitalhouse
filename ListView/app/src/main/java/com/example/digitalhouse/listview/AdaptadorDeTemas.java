package com.example.digitalhouse.listview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/09/16. Lucas Franco
 */
public class AdaptadorDeTemas extends BaseAdapter {

    private ArrayList<String> unConjuntoDeTemas;
    private Context unContexto;

    public AdaptadorDeTemas(ArrayList<String> unConjuntoDeTemas, Context unContexto) {
        this.unConjuntoDeTemas = unConjuntoDeTemas;
        this.unContexto = unContexto;
    }

    @Override
    public int getCount() {
        return unConjuntoDeTemas.size();
    }

    @Override
    public String getItem(int PosicionDelTema) {
        return unConjuntoDeTemas.get(PosicionDelTema);
    }

    @Override
    public long getItemId(int IdDelTema) {
        return IdDelTema;
    }

    @Override
    public View getView(int posicionAMostrar, View vistaActual, ViewGroup grupoActual) {
        View unaVistaAMostrar;

        LayoutInflater infladorDeTemas;
        infladorDeTemas = (LayoutInflater) unContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        unaVistaAMostrar=infladorDeTemas.inflate(R.layout.layout_secundario, grupoActual, false);

        TextView textViewDeLaCelda;
        textViewDeLaCelda = (TextView) unaVistaAMostrar.findViewById(R.id.textViewTemaCelda);

        String temaAAsignar;
        temaAAsignar = unConjuntoDeTemas.get(posicionAMostrar);

        textViewDeLaCelda.setText(temaAAsignar);
        if(posicionAMostrar%2 == 0){
            textViewDeLaCelda.setTextColor(Color.BLACK);
        }else{
            textViewDeLaCelda.setTextColor(Color.BLUE);
        }


        return unaVistaAMostrar;
    }
}
