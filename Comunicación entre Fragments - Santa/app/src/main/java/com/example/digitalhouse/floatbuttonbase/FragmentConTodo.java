package com.example.digitalhouse.floatbuttonbase;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by andres on 04/10/16.
 */
public class FragmentConTodo extends Fragment {

    private EditText editTextMensajeSanta;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_con_todo, container, false);

        FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.regalitosSanta);
        FABClickListener fabClickListener = new FABClickListener();
        button.setOnClickListener(fabClickListener);

        editTextMensajeSanta = (EditText) view.findViewById(R.id.mensajeSanta);


        return view;
    }

    //CREAR EL LISTENER Y DECIRLE QUE HAGA ALGO EN EL ONCLICK
    private class FABClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //BUSCA EL ACTIVITY A LA QUE QUIERO NOTIFICAR
            ComunicadorEntreFragmentYActivity unComunicadorDeFragment = (ComunicadorEntreFragmentYActivity) getActivity();

            //BUSCO EL MENSAJE QUE QUIERO ENVIAR
            String unMesaje = editTextMensajeSanta.getText().toString();

            //NOTIFICO A LA ACTIVITY Y ENVIO EL MENSAJE
            unComunicadorDeFragment.notificarClickAlActivity(unMesaje);
        }
    }

    public interface ComunicadorEntreFragmentYActivity{

        public void notificarClickAlActivity(String mensaje);

    }
}
