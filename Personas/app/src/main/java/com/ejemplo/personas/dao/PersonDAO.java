package com.ejemplo.personas.dao;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import android.util.Xml;
import android.widget.Toast;

import com.ejemplo.personas.model.Container;
import com.ejemplo.personas.model.Person;
import com.google.gson.Gson;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by digitalhouse on 6/06/16.
 */
public class PersonDAO {

    public Person getPersonJSON(Context context){

        Person result = null;

        try {

            //ABRIR EL ARCHIVO
            AssetManager manager = context.getAssets();
            InputStream input = manager.open("personas.json");

            //PARSER DE JSON
            BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(input));
            Gson gson = new Gson();
            Container container = gson.fromJson(bufferedReader, Container.class);
            result = container.getNewsList().get(0);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;


    }


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
                        }else if (parser.getName().equals("lastName")){
                            result.setLastName(parser.nextText());
                        }else if (parser.getName().equals("age")){
                            result.setAge(parser.nextText());
                        }else if (parser.getName().equals("lastTweet")){
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


}
