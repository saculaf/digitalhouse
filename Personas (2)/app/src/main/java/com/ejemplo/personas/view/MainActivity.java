package com.ejemplo.personas.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ejemplo.personas.R;
import com.ejemplo.personas.controller.PersonController;
import com.ejemplo.personas.model.Person;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadNewsClick(View view){

        PersonController newsController = new PersonController();
        List<Person> persons = newsController.getPersons(this);

    }
}
