package com.example.android.laumusicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the dad's playlist_item
        TextView dad = findViewById(R.id.dad);
        //Set the clicklistener on dad's playlist_item view
        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the DadPlaylistActivity
                Intent dadIntent = new Intent(MainActivity.this, DadPlaylistActivity.class);
                // Start the DadPlaylistActivity
                startActivity(dadIntent);
            }
        });

        //Find the view that shows the mom's playlist_item
        TextView mom = findViewById(R.id.mom);
        //Set the clicklistener on mom's playlist_item view
        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MomPlaylistActivity
                Intent momIntent = new Intent(MainActivity.this, MomPlaylistActivity.class);
                // Start the MomPlaylistActivity
                startActivity(momIntent);
            }
        });

        //Find the view that shows the girl's playlist_item
        TextView girl = findViewById(R.id.girl);
        //Set the clicklistener on girl's playlist_item view
        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the GirlPlaylistActivity
                Intent childIntent = new Intent(MainActivity.this, GirlPlaylistActivity.class);
                // Start the GirlPlaylistActivity
                startActivity(childIntent);
            }
        });

        //Find the view that shows the boy's playlist_item
        TextView boy = findViewById(R.id.boy);
        //Set the clicklistener on boys's playlist_item view
        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the BoyPlaylistActivity
                Intent boyIntent = new Intent(MainActivity.this, BoyPlaylistActivity.class);
                // Start the BoyPlaylistActivity
                startActivity(boyIntent);
            }
        });
    }
}
