package com.ualberta.mis413project;


import android.content.Intent;
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
public class BlankFragment extends Fragment {

    View view;

    ImageButton test1 ;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank, container, false);




        ArrayList<String> arrayListHabit = new ArrayList<String>();
        arrayListHabit.add("Alberta");
        arrayListHabit.add("British Columbia");
        arrayListHabit.add("Ontario");
        arrayListHabit.add("Quebec");


        final Spinner habitList = (Spinner)view.findViewById(R.id.spinner1);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrayListHabit);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        habitList.setAdapter(dataAdapter);

        test1 = (ImageButton)view.findViewById(R.id.test1);
        test1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(getActivity(),Detail_activity.class);
                startActivity(intent);
            }
        });

        return view;
    }




}
