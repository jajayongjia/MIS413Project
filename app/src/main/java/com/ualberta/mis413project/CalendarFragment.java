package com.ualberta.mis413project;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment {


    View view;
    public CalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_calendar, container, false);
        FloatingActionButton add_habit = (FloatingActionButton) view.findViewById(R.id.add_habit);
        add_habit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(getActivity(), CalendarAdd.class);
                startActivity(intent);
            }
        });
        configureViewButton();

        return view;
    }
    private void configureViewButton(){
        TextView addSignUpButton = (TextView) view.findViewById(R.id.event);
        addSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), CalendarView.class);
                startActivity(intent);
            }

        });
    }

}
