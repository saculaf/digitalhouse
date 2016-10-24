package com.example.digitalhouse.fragmentsejercicio1;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFondoRojo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fondo_rojo, container, false);

        TextView textviewFragmentRojo = (TextView) view.findViewById(R.id.textViewRojo);

        textviewFragmentRojo.setText("Soy el Fragment Rojo");

        return view;
    }

}
