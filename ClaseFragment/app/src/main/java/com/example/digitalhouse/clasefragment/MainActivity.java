package com.example.digitalhouse.clasefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager unFragmentManager = this.getFragmentManager();

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        FragmentFormulario fragmentFormulario = new FragmentFormulario();

        fragmentTransaction.replace(R.id.acaVaElFragment, fragmentFormulario);

        fragmentTransaction.commit();

    }
}
