package com.example.digitalhouse.ejerciciointegrador;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager unFragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unFragmentManager = getFragmentManager();

        FragmentListView unFragmentListView = new FragmentListView();

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.contenedorPrincipal, unFragmentListView);

        fragmentTransaction.commit();

    }


}
