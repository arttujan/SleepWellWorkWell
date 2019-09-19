package com.example.ravitsemussovellus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private Button btnKysely, btnRaportit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnKysely =  findViewById(R.id.btnKysely);
        this.btnRaportit = findViewById(R.id.btnRaportit);


        btnKysely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kysely-activityn (näkymän) avaus
                Intent myIntent = new Intent(getApplicationContext(),
                        KyselyActivity.class);
                startActivity(myIntent);
            }
            });


        btnRaportit.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick (View v) {
                    // Raportit-activityn (näkymän) avaus
                    Intent myIntent = new Intent(MainActivity.this,
                            RaportitActivity.class);
                    startActivity(myIntent);
                }
        });




    }
}


