package com.example.digitalhouse.listview2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 26/09/16.
 */
public class Tema {

    private String tema;
    private String banda;
    private Integer lanzamiento;
    private Integer foto;

    public Tema(String nombreDelTema, String nombreBanda, Integer anioDeLanzamiento, Integer foto) {
        this.tema = nombreDelTema;
        this.banda = nombreBanda;
        this.lanzamiento = anioDeLanzamiento;
        this.foto = foto;
    }

    public static ArrayList<Tema> generoLista(){
        ArrayList<Tema> listaDeTemaADevolver = new ArrayList<>();

        Tema unTema = new Tema("Tema 1", "Banda 1", 1990, R.drawable.imagen1);
        Tema otroTema = new Tema("Tema 2", "Banda 2", 1999, R.drawable.imagen2);

        listaDeTemaADevolver.add(unTema);
        listaDeTemaADevolver.add(otroTema);

        listaDeTemaADevolver.add(new Tema("Tema 3", "Banda 3", 2010, R.drawable.imagen3));

        return listaDeTemaADevolver;

    }

    public Boolean getEsViejita(){
        Boolean respuesta;
        if (lanzamiento >= 2000){
            respuesta = false;
        }else{
            respuesta = true;
        }
        return respuesta;
    }

    public String getTema() {
        return tema;
    }

    public String getBanda() {
        return banda;
    }

    public Integer getLanzamiento() {
        return lanzamiento;
    }

    public Integer getFoto(){
        return foto;
    }

}
