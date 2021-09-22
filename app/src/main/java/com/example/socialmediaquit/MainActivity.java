package com.example.socialmediaquit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button stats;
    private Button facts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stats= (Button) findViewById(R.id.stats);
        Button facts= (Button) findViewById(R.id.tips);


        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openStats();
            }
        });


        facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openFacts();
            }
        });

    }

    public void openFacts(){
        Intent facts_intent=new Intent(this, Facts.class);
        startActivity(facts_intent);
    }
    public void openStats(){
        Intent stats_intent=new Intent(this, Stats.class);
        startActivity(stats_intent);
    }

}