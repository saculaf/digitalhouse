package com.example.digitalhouse.interfaz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(SecondActivity.this, "ON CREATE2", Toast.LENGTH_SHORT).show();

        Intent unIntent = getIntent();

        Bundle unBundle = unIntent.getExtras();

        String unMensajeRecibido= unBundle.getString("Mensaje");

        Toast.makeText(SecondActivity.this, unMensajeRecibido, Toast.LENGTH_SHORT).show();

    }

    public void recibirUnBundle(){
        getIntent();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(SecondActivity.this, "ON START2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(SecondActivity.this, "ON PAUSE2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(SecondActivity.this, "ON RESUME2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(SecondActivity.this, "ON RESTART2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(SecondActivity.this, "ON STOP2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(SecondActivity.this, "ON DESTROY2", Toast.LENGTH_SHORT).show();
    }

}