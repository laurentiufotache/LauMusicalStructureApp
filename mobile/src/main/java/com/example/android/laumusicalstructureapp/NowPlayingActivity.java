package com.example.android.laumusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);

        // Get current name artist
        String display_artist = getIntent().getStringExtra("artist");

        // Find the TextView for the current artist name in the nowplaying.xml layout file
        TextView current_artist = findViewById(R.id.current_artist);

        //Set the current artist name
        current_artist.setText(display_artist);

        // Get current song title
        String display_song_title = getIntent().getStringExtra("songTitle");

        // Find the TextView for the current song title in the nowplaying.xml layout file
        TextView current_song_title = findViewById(R.id.current_song_title);

        //Set the current song title
        current_song_title.setText(display_song_title);

        // Get current song duration
        String display_song_duration = getIntent().getStringExtra("songDuration");

        // Find the TextView for the current song duration in the nowplaying.xml layout file
        TextView current_song_duration = findViewById(R.id.current_song_duration);

        //Set the current song duration
        current_song_duration.setText(display_song_duration);

        //Display a toast message with the current artist name and song title
        Toast.makeText(NowPlayingActivity.this, getString(R.string.playing) + display_artist + " \n " + display_song_title, Toast.LENGTH_SHORT).show();
    }
}
