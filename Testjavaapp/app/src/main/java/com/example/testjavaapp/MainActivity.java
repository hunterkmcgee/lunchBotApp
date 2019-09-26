package com.example.testjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button workButton;
Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        workButton= (Button)findViewById(R.id.workButton);
        playButton = (Button)findViewById(R.id.playButton);
        workButton.setOnClickListener(this);
        playButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.workButton){
            openScreen2();
        }
        if(view.getId()==R.id.playButton){

        }
    }
    public void openScreen2(){
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
}
