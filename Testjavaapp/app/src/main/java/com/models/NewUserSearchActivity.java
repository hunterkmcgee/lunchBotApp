package com.models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.testjavaapp.R;

public class NewUserSearchActivity extends AppCompatActivity implements View.OnClickListener {

    Button startOverButton;
    Button searchButton;

    public final static String EXTRA_TEXT = "com.models.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_search);

        startOverButton = (Button)findViewById(R.id.startOver);
        searchButton = (Button)findViewById(R.id.searchCriteria);

        searchButton.setOnClickListener(this);
        startOverButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.startOver) {
            openStartOver();
        }
        if (view.getId() == R.id.searchCriteria){
            openSearch();
        }
    }

    public void openStartOver(){
        Intent intent = new Intent(this, activity_choose_search.class);
        startActivity(intent);
    }

    public void openSearch(){
        EditText searchInput = (EditText)findViewById(R.id.userInput);
        String userInput = searchInput.getText().toString();

        Intent intent = new Intent(this, UserInputDisplayActivity.class);
        intent.putExtra(EXTRA_TEXT, userInput);
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
