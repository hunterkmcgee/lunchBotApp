package com.example.testjavaapp;
import com.example.testjavaapp.backend.request.*;
import androidx.appcompat.app.AppCompatActivity;
import static java.lang.System.out;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.io.*;
import java.util.*;

import java.util.List;

import com.example.testjavaapp.backend.request.api.JSONConvert;
import com.example.testjavaapp.backend.request.api.yelpApiCall;
import com.google.gson.Gson;

import org.json.JSONException;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button workButton;
Button playButton;
String a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        yelpApiCall.asshole hello = new yelpApiCall.asshole("Mexican","nashville");
        String bitch = null;
        try {
            bitch = hello.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bitch);
        try {
            JSONConvert gay = new JSONConvert(bitch);
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
