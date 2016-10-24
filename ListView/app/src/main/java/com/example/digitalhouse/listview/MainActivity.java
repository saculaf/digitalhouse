package com.example.digitalhouse.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList listadoDeTemas = llenarConjuntoDeTemas();
    private AdaptadorDeTemas miAdaptadorDeTemas;

    private void actualizarContadorDeTemas(){
        TextView totalDeTemas = (TextView) findViewById(R.id.textViewCantidadDeElementos);
        totalDeTemas.setText("Cantidad de Temas: " + listadoDeTemas.size());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miAdaptadorDeTemas = new AdaptadorDeTemas(listadoDeTemas, this);

        ListView listViewDeTemas = (ListView) findViewById(R.id.listViewPrincipal);

        listViewDeTemas.setAdapter(miAdaptadorDeTemas);

        actualizarContadorDeTemas();
    }

    public void registro (View view){
        EditText temaAAgregar = (EditText) findViewById(R.id.editTextNombreDelTemaMain);

        String temaIngresado = temaAAgregar.getText().toString();

        if(temaIngresado.isEmpty()){
            Toast.makeText(MainActivity.this, "Ingresar un Tema", Toast.LENGTH_SHORT).show();
        }else {
            listadoDeTemas.add(temaIngresado);

            miAdaptadorDeTemas.notifyDataSetChanged();

            actualizarContadorDeTemas();
        }

    }

    private ArrayList llenarConjuntoDeTemas(){
        ArrayList<String> unConjuntoDeTemas = new ArrayList<>();

        unConjuntoDeTemas.add("It’s So Easy");
        unConjuntoDeTemas.add("Mr. Brownstone");
        unConjuntoDeTemas.add("Welcome To The Jungle");
        unConjuntoDeTemas.add("Estranged");
        unConjuntoDeTemas.add("Live And Let Die");
        unConjuntoDeTemas.add("Rocket Queen");
        unConjuntoDeTemas.add("You Could Be Mine");
        unConjuntoDeTemas.add("Civil War");
        unConjuntoDeTemas.add("Sweet Child O’ Mine");
        unConjuntoDeTemas.add("Coma");
        unConjuntoDeTemas.add("Knockin’ On Heaven’s Door");
        unConjuntoDeTemas.add("November Rain");
        unConjuntoDeTemas.add("Paradise City");

        return unConjuntoDeTemas;
    }
}
