package com.example.android.laumusicalstructureapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DadPlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //Create the playlist array
        final ArrayList<Song> songs = new ArrayList<>();
        int n = 11;
        for (int i = 1; i <= n; i++) {
            songs.add(new Song("Dad's Favorite Artist Name " + i, "SongTitle" + i, "Duration" + i));
        }

        // Create the SongAdapter, whose data source is a list of songs. The adapter knows how to create list items for each item in the list
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the ListView object in the playlist.xml layout file
        ListView listView = findViewById(R.id.playlist);

        //Set the background color for listView
        listView.setBackgroundColor(Color.parseColor("#880E4F"));

        // Make the listView to use the SongAdapter we created above, so that the listView will display list items for each song in the list
        listView.setAdapter(adapter);

        // Set a click listener to open the now_playing activity when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the artist name at the given position the user clicked on
                String currentArtist = songs.get(position).getArtist();

                // Get the song title at the given position the user clicked on
                String currentTitle = songs.get(position).getSongTitle();

                // Get the song duration at the given position the user clicked on
                String currentDuration = songs.get(position).getSongDuration();

                //create the nowPlayingIntent and send extra artist, song title and song duration to nowPlayingActivity
                Intent nowPlayingIntent = new Intent(DadPlaylistActivity.this, NowPlayingActivity.class);
                nowPlayingIntent.putExtra("artist", currentArtist);
                nowPlayingIntent.putExtra("songTitle", currentTitle);
                nowPlayingIntent.putExtra("songDuration", currentDuration);
                startActivity(nowPlayingIntent);

            }

        });
    }
}
