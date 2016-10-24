package com.example.digitalhouse.entregableintegrador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resto (View view){
        Intent unIntent = new Intent(MainActivity.this, RestoActivity.class);
        startActivity(unIntent);

    }

    public void receta (View view){
        Intent unIntent = new Intent(MainActivity.this, RecetaActivity.class);
        startActivity(unIntent);

    }


}
