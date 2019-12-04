package com.models;
import java.util.ArrayList;
import java.util.Arrays;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.backend.JSONConvert;
import com.backend.yelpApiCall;
import com.example.testjavaapp.R;

import java.lang.Object;
import org.json.JSONException;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.Arrays;

public class activity2 extends AppCompatActivity {
    Button goBackButton;
    Button apiButton;
    TextView apiResponse;
    TextView randomInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
       /* super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        final String[] stringArray;
        stringArray = new String[]{ "American", "Mexican", "Asian","European", "African", "South American",
                "Indian", "burgers", "Pizza", "Steak", "Desserts", "Breakfast" };
        Random randomIndex = new Random();
        final int n = randomIndex.nextInt(12);

        Intent intent = getIntent();
        final String apiInput = intent.getStringExtra(stringArray[n]);

        TextView inputString;


        inputString = (TextView) findViewById(R.id.textView9);



        goBackButton = (Button) findViewById(R.id.goBackBtn);
        apiButton = (Button)findViewById(R.id.apiButton);
        apiResponse = (TextView)findViewById(R.id.apiText);
        apiResponse.setMovementMethod(new ScrollingMovementMethod());
        apiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List apiArray;
                apiResponse.setText("");



                yelpApiCall.asshole hello = new yelpApiCall.asshole( stringArray[n],"nashville");





                String bitch = null;
                try {
                    bitch = hello.execute().get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    JSONConvert gay = new JSONConvert(bitch);
                    apiArray = gay.getResponseArray();
                    System.out.println(apiArray.size() + " hey!");
                    //apiResponse.append(gay.getOneRandom()+"\n");
                    int length = apiArray.size();

                    for(int i=0; i < length; i++)
                    {
                        int rnd = new Random().nextInt(apiArray.size());
                        apiResponse.append("IMG   " + apiArray.get(rnd)+ "\n");
                        apiArray.remove(rnd);
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
        });  */







    }
    public void goBackScreen() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}



/*

    <Button
        android:id="@+id/apiButton"
        android:layout_width="137dp"
        android:layout_height="62dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentBottom="true"
        android:layout_gravity="center_horizontal"
        android:layout_marginStart="61dp"
        android:layout_marginLeft="61dp"
        android:layout_marginEnd="30dp"
        android:layout_marginRight="30dp"
        android:layout_marginBottom="31dp"
        android:layout_toStartOf="@+id/goBackBtn"
        android:layout_toLeftOf="@+id/goBackBtn"
        android:text="Get results"
        android:background="@drawable/custom_button"
        app:layout_constraintBottom_toTopOf="@+id/goBackBtn"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent" />
 */