package com.ualberta.mis413project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        configureRegisterButton();
        configureTrySignInButton();
    }


    /**
     * Disable Back button on android phone
     */
    @Override
    public void onBackPressed() {
    }


    /**
     * Configure SignUp Button
     * <br>
     * SignUp Button brings user to Register Page
     * Once SignUp Button is clicked, the current Login Page is closed.
     */
    private void configureRegisterButton(){
        Button addSignUpButton = (Button) findViewById(R.id.register);
        addSignUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Register.this,Register.class));//Let signup buttion jump to Register activity page.
//                finish();
            }

        });
    }


    /**
     * Configure SignIn Button
     * <br>
     * SignIn Button checks User's input ID and bring user to next page
     * If User ID is invalid, show hit message
     *
     * For admin :
     * add an additional check to see if the user is an admin user. if so put extra to put its id so that i
     * in AdminActivity which is current admin known
     *
     * @author donglin
     * @since 2.0
     */
    private void configureTrySignInButton() {
        Button addSignInButton = (Button) findViewById(R.id.trysignin);
        addSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, LogIn.class));//Let signup buttion jump to Register activity page.
            }

        });
    }





}

