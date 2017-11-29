package com.ualberta.mis413project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Inbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);
        this.setTitle("InBox");
        configureViewButton();
    }


    private void configureViewButton(){
        TextView addSignUpButton = (TextView) findViewById(R.id.inboxtest);
        addSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Inbox.this, MessageDetail.class);
                startActivity(intent);
            }

        });
    }
}
