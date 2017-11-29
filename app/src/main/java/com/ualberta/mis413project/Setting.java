package com.ualberta.mis413project;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Setting extends Fragment {


    View view;
    public Setting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_setting, container, false);

        ArrayList<String> arrayListHabit = new ArrayList<String>();
        arrayListHabit.add("English");
        arrayListHabit.add("French");

        ArrayList<String> arrayListHabit2 = new ArrayList<String>();
        arrayListHabit2.add("Alberta");
        arrayListHabit2.add("British Columbia");
        arrayListHabit2.add("Ontario");
        arrayListHabit2.add("Quebec");

        ArrayList<String> arrayListHabit3 = new ArrayList<String>();
        arrayListHabit3.add("14");
        arrayListHabit3.add("16");
        arrayListHabit3.add("18");
        arrayListHabit3.add("20");

        final Spinner habitList = (Spinner)view.findViewById(R.id.language1);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrayListHabit);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        habitList.setAdapter(dataAdapter);

        final Spinner habitList2 = (Spinner)view.findViewById(R.id.province1);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrayListHabit2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        habitList2.setAdapter(dataAdapter2);

        final Spinner habitList3 = (Spinner)view.findViewById(R.id.fontSize);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrayListHabit3);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        habitList3.setAdapter(dataAdapter3);

        Button test1 = (Button)view.findViewById(R.id.logout);
        test1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LogIn.class);
               startActivity(intent);
            }
        });
        return view;
    }

}
