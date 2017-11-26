package com.ualberta.mis413project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CalendarView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);
        setTitle("Green Party Election!");
        configureJoinButton();
    }
    private void configureJoinButton(){
        Button addSignUpButton = (Button) findViewById(R.id.join);
        addSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(CalendarView.this, "You have successfully joined this special event!", Toast.LENGTH_SHORT).show();
                finish();
            }

        });
    }
}
