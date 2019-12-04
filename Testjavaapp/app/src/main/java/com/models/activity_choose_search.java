package com.models;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.backend.JSONConvert;
import com.backend.yelpApiCall;
import com.example.testjavaapp.R;

import org.json.JSONException;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class activity_choose_search extends AppCompatActivity {
    Button youChooseButton;
    Button weChooseButton;
    Button startOverButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        youChooseButton= findViewById(R.id.youChoose);
        weChooseButton = findViewById(R.id.weChoose);
        startOverButton = findViewById(R.id.startOver);

        youChooseButton.setOnClickListener(this);
        weChooseButton.setOnClickListener(this);
        startOverButton.setOnClickListener(this);

        buttonEffect(youChooseButton);
        buttonEffect(weChooseButton);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.youChoose){
            openUserChoose();
        }
        if(view.getId()==R.id.weChoose){
            openRandomChoose();
        }
        if(view.getId()==R.id.startOver){
            openStartOver();
        }
    }

    public void openUserChoose(){
        Intent intent = new Intent(this, UserChoicesActivity.class);
        startActivity(intent);
    }
    public void openRandomChoose(){
        Intent intent = new Intent(this, RandomDisplayActivity.class);
        startActivity(intent);
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
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public static void buttonEffect(View button){
        button.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(0x00FF2400, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        v.getBackground().clearColorFilter();
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_BUTTON_RELEASE: {
                        v.getBackground().setColorFilter(0x00000000, PorterDuff.Mode.SRC_ATOP);
                     }
                }
                return false;
            }
        });
    }
}
