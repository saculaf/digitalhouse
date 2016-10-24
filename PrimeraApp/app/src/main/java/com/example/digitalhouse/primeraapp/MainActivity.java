package com.example.digitalhouse.primeraapp;

import android.content.ContentValues;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "ON CREATE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "ON START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "ON PAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "ON RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "ON RESTART", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "ON STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "ON DESTROY", Toast.LENGTH_SHORT).show();
    }

    public void botonApretado1(View view){
        LinearLayout unLinear = (LinearLayout) findViewById(R.id.linearLayout);
        unLinear.setBackgroundResource(R.color.colorPrimaryDark);
        EditText unEditText = (EditText) findViewById(R.id.editTextNombre);
        String unTextoIngresado = unEditText.getText().toString();
        Toast.makeText(MainActivity.this, unTextoIngresado, Toast.LENGTH_SHORT).show();
    }

    public void botonApretado2(View view){
        TextView unTextViewNombre = (TextView) findViewById(R.id.textViewNombre);
        unTextViewNombre.setTextColor(getResources().getColor(R.color.colorAccent));
    }

    public void botonApretado3(View view){
        TextView unTextViewNombre = (TextView) findViewById(R.id.textViewNombre);
        unTextViewNombre.setText("Apellido");
    }
}