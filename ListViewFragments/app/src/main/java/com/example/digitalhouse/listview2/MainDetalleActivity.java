package com.example.digitalhouse.listview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainDetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detalle);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();

        String temaRecibido= unBundle.getString("Tema");
        String bandaRecibida= unBundle.getString("Banda");
        Integer anioRecibido= unBundle.getInt("Lanzamiento");
        Boolean checkBoxRecibido = unBundle.getBoolean("EsViejita");
        Integer fotoRecibida= unBundle.getInt("Foto");

        TextView temaMostrable = (TextView) findViewById(R.id.textViewTemaDetalle);
        temaMostrable.setText("Tema: " + temaRecibido);

        TextView bandaMostrable = (TextView) findViewById(R.id.textViewBandaDetalle);
        bandaMostrable.setText("Banda: " + bandaRecibida);

        TextView anioMostrable = (TextView) findViewById(R.id.textViewLanzamientoDetalle);
        anioMostrable.setText("Lanzamiento: " + anioRecibido);

        CheckBox checkBoxMostrable = (CheckBox) findViewById(R.id.checkboxAntiguaDetalle);
        checkBoxMostrable.setChecked(checkBoxRecibido);

        ImageView fotoMostrable = (ImageView) findViewById(R.id.imageViewFotoDetalle);
        fotoMostrable.setImageResource(fotoRecibida);


    }
}
