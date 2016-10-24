package com.example.digitalhouse.clasefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by digitalhouse on 29/09/16.
 */
public class FragmentFormulario extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_formulario, container, false);

        TextView unTextView = (TextView) view.findViewById(R.id.textViewFragment);

        unTextView.setText("Hello Fragments");

        return view;

    }
}
