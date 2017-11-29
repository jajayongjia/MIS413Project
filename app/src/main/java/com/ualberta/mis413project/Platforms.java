package com.ualberta.mis413project;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Platforms extends Fragment {



    View view;
    public Platforms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_platforms, container, false);

        ArrayList<String> arrayListHabit = new ArrayList<String>();
        arrayListHabit.add("Green Party of Canada");
        arrayListHabit.add("Liberal Party of Canada");
        arrayListHabit.add("Conservative Party of Canada ");
        arrayListHabit.add("New Democratic Party");


        final Spinner habitList = (Spinner)view.findViewById(R.id.spinner2);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrayListHabit);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        habitList.setAdapter(dataAdapter);

        ImageButton test1 = (ImageButton)view.findViewById(R.id.test3);
        test1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openWebURL("https://www.greenparty.ca/en/our-vision-new");
            }
        });


        return view;
    }

    public void openWebURL( String inURL ) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );

        startActivity( browse );
    }

}
