package com.ejemplo.personas.controller;

import android.content.Context;

import com.ejemplo.personas.dao.PersonDAO;
import com.ejemplo.personas.model.Person;

/**
 * Created by digitalhouse on 6/06/16.
 */
public class PersonController {

    public Person getPerson(Context context){
        PersonDAO personDAO = new PersonDAO();
        Person result = personDAO.getPersonJSON(context);
        return result;
    }

}
