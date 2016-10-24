package com.example.digitalhouse.floatbuttonbase;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by andres on 04/10/16.
 */
public class FragmentConTodo extends Fragment {

    private EditText editTextMensajeSanta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View vistaDelFragment = inflater.inflate(R.layout.fragment_con_todo, container, false);

        FloatingActionButton button = (FloatingActionButton) vistaDelFragment.findViewById(R.id.floatinActionButton);
        FABClickListener fabClickListener = new FABClickListener();
        button.setOnClickListener(fabClickListener);

        editTextMensajeSanta = (EditText) vistaDelFragment.findViewById(R.id.inputMensaje);

        return vistaDelFragment;

    }

    private class FABClickListener implements View.OnClickListener{
        public void onClick(View v){

            ComunicadorEntreFragmentYActivity unComunicadorDeFragment = (ComunicadorEntreFragmentYActivity) getActivity();

            String unMensaje = editTextMensajeSanta.getText().toString();

            unComunicadorDeFragment.notificarClickAlActivity(unMensaje);


        }
    }

    public interface ComunicadorEntreFragmentYActivity{

        public void notificarClickAlActivity(String unMensaje);


    }

}