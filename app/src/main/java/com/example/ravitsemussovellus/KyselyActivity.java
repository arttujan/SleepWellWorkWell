package com.example.ravitsemussovellus;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class KyselyActivity extends AppCompatActivity {
    private Button btnuni, btnruoka, btnliikunta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kysely);

        this.btnuni = findViewById(R.id.btnuni);
        this.btnruoka = findViewById(R.id.btnruoka);
        this.btnliikunta = findViewById(R.id.btnliikunta);


        // Buttoneiden OnClickListenerit

        btnuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Uni / stressi activityn avaus tähän
            }
        });

        btnruoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ruoka activityn avaus tähän
            }
        });

        btnliikunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Liikunta activityn avaus tähän
            }
        });



        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }



}
