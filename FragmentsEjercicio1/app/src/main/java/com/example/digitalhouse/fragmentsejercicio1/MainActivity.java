package com.example.digitalhouse.fragmentsejercicio1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager unFragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unFragmentManager = getFragmentManager();

    }

    public void rojo (View view){

        FragmentFondoRojo fragmentRojo = new FragmentFondoRojo();

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.acaVaElFragment, fragmentRojo);

        fragmentTransaction.commit();
    }

    public void verde (View view){

        FragmentFondoVerde fragmentVerde = new FragmentFondoVerde();

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.acaVaElFragment, fragmentVerde);

        fragmentTransaction.commit();
    }


}
