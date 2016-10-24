package com.ejemplo.personas.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by digitalhouse on 19/10/16.
 */
public class Container {

    @SerializedName("personas")
    private List<Person> newsList;

    public List<Person> getNewsList() {
        return newsList;
    }
}
