package com.example.digitalhouse.floatbuttonbase;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentConTodo.ComunicadorEntreFragmentYActivity {

    private FragmentManager miFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miFragmentManager = getFragmentManager();

        FragmentConTodo unFragmentConTodo = new FragmentConTodo();

        FragmentTransaction unaTransaccion = miFragmentManager.beginTransaction();
        unaTransaccion.replace(R.id.contenedorDeFragments, unFragmentConTodo);
        unaTransaccion.commit();

    }

    @Override
    public void notificarClickAlActivity(String mensaje) {

        if (mensaje.isEmpty()) {
            Toast.makeText(MainActivity.this, "NO HAY REGALO", Toast.LENGTH_SHORT).show();

        } else {


            FragmentConRegalos unFragmentConRegalos = new FragmentConRegalos();

            FragmentTransaction unaTransaccion = miFragmentManager.beginTransaction();
            unaTransaccion.replace(R.id.contenedorDeFragments, unFragmentConRegalos);
            unaTransaccion.commit();

        }


    }
}
