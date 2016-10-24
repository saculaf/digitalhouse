package com.example.digitalhouse.recyclerviewconlistener;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentRecyclerView.ComunicadorEntreFragmentYActivity {

    private FragmentManager unFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unFragmentManager = getFragmentManager();

        FragmentRecyclerView unFragmentRecyclerView = new FragmentRecyclerView();

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.contenedorPrincipal, unFragmentRecyclerView).addToBackStack("otracosa");

        fragmentTransaction.commit();

    }


    @Override
    public void notificarClickAlActivity(Producto producto) {
        //CUANDO LA NOTIFICAN, COMIENZA A CORRER ESTE CODIGO

        String nombreAEnviar = producto.getNombre();
        String descripcionAEnviar = producto.getDescripcion();
        Integer precioAEnviar = producto.getPrecio();
        int imagenAEnviar = producto.getImagen();


        Bundle unBundle = new Bundle();
        unBundle.putString("Nombre", nombreAEnviar);
        unBundle.putString("Descripcion", descripcionAEnviar);
        unBundle.putInt("Precio", precioAEnviar);
        unBundle.putInt("Foto", imagenAEnviar);

        FragmentDetalleProducto fragmentDetalleProducto = new FragmentDetalleProducto();

        fragmentDetalleProducto.setArguments(unBundle);

        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.contenedorPrincipal, fragmentDetalleProducto).addToBackStack("algo");

        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {
        unFragmentManager.popBackStack();
    }
}
