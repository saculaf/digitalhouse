package com.example.digitalhouse.applistview3;

import java.util.ArrayList;

/**
 * Created by saculaf on 27/09/16.
 */
public class Tema {
    private String tema;
    private String banda;
    private Integer lanzamiento;

    public Tema(String nombreDelTema, String nombreBanda, Integer anioDeLanzamiento) {
        this.tema = nombreDelTema;
        this.banda = nombreBanda;
        this.lanzamiento = anioDeLanzamiento;
    }

    public static ArrayList<Tema> generoLista(){
        ArrayList<Tema> listaDeTemaADevolver = new ArrayList<>();

        Tema unTema = new Tema("Tema 1", "Banda 1", 1990);
        Tema otroTema = new Tema("Tema 2", "Banda 2", 1999);

        listaDeTemaADevolver.add(unTema);
        listaDeTemaADevolver.add(otroTema);

        listaDeTemaADevolver.add(new Tema("Tema 3", "Banda 3", 2010));

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

}
