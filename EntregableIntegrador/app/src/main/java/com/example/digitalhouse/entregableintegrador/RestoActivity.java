package com.example.digitalhouse.entregableintegrador;


import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RestoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);

        //FRAGMENT MANAGER
        FragmentManager fragmentManager = getSupportFragmentManager();

        //CREO UNA INSTANCIA DEL ADAPTADOR
        AdaptadorViewPager adaptadorViewPager = new AdaptadorViewPager(fragmentManager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(adaptadorViewPager);

        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(12);
    }
}
