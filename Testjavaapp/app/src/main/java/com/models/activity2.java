package com.models;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.backend.JSONConvert;
import com.backend.yelpApiCall;
import com.example.testjavaapp.R;

import org.json.JSONException;

import java.util.Random;
import java.util.concurrent.ExecutionException;

public class activity2 extends AppCompatActivity {
    Button goBackButton;
    Button apiButton;
    TextView apiResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        goBackButton = (Button) findViewById(R.id.goBackBtn);
        apiButton = (Button)findViewById(R.id.apiButton);
        apiResponse = (TextView)findViewById(R.id.apiText);
        apiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apiArray[] = new String[20];
                apiResponse.setText("");
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
                    apiArray = gay.getResponseArray();
                    for(int i=0; i < apiArray.length; i++)
                    {
                        int rnd = new Random().nextInt(apiArray.length);
                        apiResponse.append(apiArray[rnd]+"\n");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBackScreen();
            }
        });
    }
    public void goBackScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}