package com.ejemplo.personas.controller;

import android.content.Context;

import com.ejemplo.personas.dao.PersonDAO;
import com.ejemplo.personas.model.Person;

import java.util.List;

/**
 * Created by digitalhouse on 6/06/16.
 */
public class PersonController {

    public Person getPerson(Context context){
        PersonDAO personDAO = new PersonDAO();
        Person result = personDAO.getPerson(context);
        return result;
    }

    public List<Person> getPersons(Context context){
        PersonDAO personDAO = new PersonDAO();
        List<Person> persons = personDAO.getPersons(context);
        return persons;
    }

}
