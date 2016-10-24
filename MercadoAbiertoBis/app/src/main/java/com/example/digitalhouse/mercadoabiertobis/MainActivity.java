package com.example.digitalhouse.mercadoabiertobis;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentListaProducto.SeleccionableDeProductos
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager unFragmentManager = getSupportFragmentManager();
        FragmentTransaction unFragmentTransaction = unFragmentManager.beginTransaction();

        FragmentListaProducto fragmentListaProducto = new FragmentListaProducto();
        unFragmentTransaction.replace(R.id.aca_va_el_fragment, fragmentListaProducto);

        unFragmentTransaction.commit();

    }

    @Override
    public void seleccionableDeProductos(Producto unProducto) {
        Toast.makeText(this, "Seleccionaron " + unProducto.getNombre(), Toast.LENGTH_SHORT).show();
        Intent unIntent = new Intent(this, DetalleActivity.class);

        Bundle unBundle = new Bundle();
        unBundle.putString("nombre", unProducto.getNombre());
        unBundle.putDouble("precio", unProducto.getPrecio());

        unIntent.putExtras(unBundle);
        startActivity(unIntent);
    }
}
