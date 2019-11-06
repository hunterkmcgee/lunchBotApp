package com.models;

import androidx.appcompat.app.AppCompatActivity;
import com.example.testjavaapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

//    final TextInputLayout passwordTextInput;

    Button createNewButton;
    Button startOverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        createNewButton = (Button) findViewById(R.id.createNewAcct);
        startOverButton = (Button) findViewById(R.id.startwo);
        createNewButton.setOnClickListener(this);
        startOverButton.setOnClickListener(this);

    }


    public void onClick(View view) {
        if (view.getId() == R.id.createNewAcct) {
            openCreateNew();
        }

        if (view.getId() == R.id.startwo) {
            openStartWO();
        }
    }

    public void openCreateNew(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openStartWO(){
        Intent intent = new Intent(this, activity_choose_search.class);
        startActivity(intent);
    }


}
