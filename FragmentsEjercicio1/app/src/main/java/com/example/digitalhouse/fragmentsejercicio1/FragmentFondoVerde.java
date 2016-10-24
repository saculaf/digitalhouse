package com.example.digitalhouse.fragmentsejercicio1;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFondoVerde extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fondo_verde, container, false);

        TextView textviewFragmentVerde = (TextView) view.findViewById(R.id.textViewVerde);

        textviewFragmentVerde.setText("Soy el Fragment Verde");

        return view;


    }

}
