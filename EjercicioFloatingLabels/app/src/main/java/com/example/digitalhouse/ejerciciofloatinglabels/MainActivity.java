package com.example.digitalhouse.ejerciciofloatinglabels;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrarse (View view){

        EditText password = (EditText) findViewById(R.id.input_password);
        String passwordIngresado = password.getText().toString();

        if(passwordIngresado.length()<10){

            TextInputLayout inputLayoutPassword;
            inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
            inputLayoutPassword.setError("Debe contener más de 10 caracteres");
        }
        else {
            TextInputLayout inputLayoutPassword;
            inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
            inputLayoutPassword.setErrorEnabled(false);
        }

    }



}
