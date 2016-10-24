package com.example.digitalhouse.entregableintegrador;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecetaActivity extends AppCompatActivity implements FragmentRecyclerView.ComunicadorEntreFragmentYActivity  {

    private FragmentManager unFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        unFragmentManager = getFragmentManager();

        FragmentRecyclerView unFragmentRecyclerView = new FragmentRecyclerView();

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.contenedorPrincipal, unFragmentRecyclerView);

        fragmentTransaction.commit();

    }

    public void notificarClickAlActivity(Receta receta) {
        //CUANDO LA NOTIFICAN, COMIENZA A CORRER ESTE CODIGO

        String nombreAEnviar = receta.getNombre();
        String descripcionCortaAEnviar = receta.getDescripcioncorta();
        String descripcionLargaAEnviar = receta.getDescripcionlarga();
        int imagenAEnviar = receta.getImagen();


        Bundle unBundle = new Bundle();
        unBundle.putString("Nombre", nombreAEnviar);
        unBundle.putString("DescripcionCorta", descripcionCortaAEnviar);
        unBundle.putString("DescripcionLarga", descripcionLargaAEnviar);
        unBundle.putInt("Foto", imagenAEnviar);

        FragmentDetalleReceta fragmentDetalleReceta = new FragmentDetalleReceta();

        fragmentDetalleReceta.setArguments(unBundle);

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.contenedorPrincipal, fragmentDetalleReceta).addToBackStack("tag");

        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {
        if (!unFragmentManager.popBackStackImmediate()) {
            super.onBackPressed();
        }
    }

}
