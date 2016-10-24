package com.example.digitalhouse.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Integer valorVisor = 0;

    public void suma(View view){
        TextView visor = (TextView) findViewById(R.id.visor);
        String unNumeroTxt = visor.getText().toString();
        Integer unNumero = Integer.parseInt(unNumeroTxt);
        unNumero++;
        visor.setText(unNumero.toString());

    }


}
