package com.ejemplo.personas.dao;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import android.util.Xml;

import com.ejemplo.personas.model.Person;

import org.xmlpull.v1.XmlPullParser;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 6/06/16.
 */
public class PersonDAO {

    public Person getPerson(Context context){
        XmlPullParser parser = Xml.newPullParser();
        Person result = null;
        try{
            AssetManager manager = context.getAssets();
            InputStream input = manager.open("person.xml");
            // Vas a leer este archivo (input)
            parser.setInput(input, null);
            Integer status = parser.getEventType();
            while (status != XmlPullParser.END_DOCUMENT){
                switch (status){
                    case XmlPullParser.START_DOCUMENT:
                        result = new Person();
                        break;
                    case XmlPullParser.START_TAG:
                        // PROGRAMAR ACA.
                        if (parser.getName().equals("name")){
                            result.setName(parser.nextText());
                        }
                        else if (parser.getName().equals("lastname")){
                            result.setLastName(parser.nextText());
                        }
                        else if (parser.getName().equals("age")){
                            result.setAge(parser.nextText());
                        }
                        else if (parser.getName().equals("lastTweet")){
                            result.setLastTweet(parser.nextText());
                        }
                        break;
                }
                status = parser.next();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Log.d("INFO", result.toString());

        return result;
    }


    public List<Person> getPersons(Context context){
        XmlPullParser parser = Xml.newPullParser();
        List<Person> persons = null;
        try{
            AssetManager manager = context.getAssets();
            InputStream input = manager.open("person.xml");
            // Vas a leer este archivo (input)
            parser.setInput(input, null);
            Integer status = parser.getEventType();
            Person person = null;
            while (status != XmlPullParser.END_DOCUMENT){
                switch (status){
                    case XmlPullParser.START_DOCUMENT:
                        persons = new ArrayList<>();
                        break;
                    case XmlPullParser.START_TAG:
                        // PROGRAMAR ACA.
                        if(parser.getName().equals("person")){
                            person = new Person();
                        }
                        else if (parser.getName().equals("name")){
                            person.setName(parser.nextText());
                        }
                        else if (parser.getName().equals("lastname")){
                            person.setLastName(parser.nextText());
                        }
                        else if (parser.getName().equals("age")){
                            person.setAge(parser.nextText());
                        }
                        else if (parser.getName().equals("lastTweet")){
                            person.setLastTweet(parser.nextText());

                        }
                        break;

                    case XmlPullParser.END_TAG:
                        if (parser.getName().equals("person")){
                            persons.add(person);
                        }

                        break;
                }
                status = parser.next();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Log.d("INFO", persons.toString());

        return persons;
    }
}

