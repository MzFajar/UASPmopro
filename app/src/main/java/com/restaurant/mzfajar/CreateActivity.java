package com.restaurant.mzfajar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateActivity extends AppCompatActivity {
    EditText Id, Title, Genre, Year;
    String id,title,genre,year;
    Button insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Id = (EditText) findViewById(R.id.mId);
        Title = (EditText) findViewById(R.id.mTitle);
        Genre = (EditText) findViewById(R.id.mGenre);
        Year = (EditText) findViewById(R.id.mYear);
        insert = (Button) findViewById(R.id.inser);

    }
}

