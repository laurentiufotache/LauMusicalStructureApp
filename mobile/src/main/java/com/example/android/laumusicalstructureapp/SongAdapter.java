package com.example.android.laumusicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lfotache on 12.03.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        // Initialize the ArrayAdapter's internal storage for the context
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View playlistItemView = convertView;
        if (playlistItemView == null) {
            playlistItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playlist_item, parent, false);
        }

        // Get the Song object located at this position in the list
        Song currentSong = getItem(position);

        // Find the Artist TextView in the playlist_item.xml layout
        TextView Artist = playlistItemView.findViewById(R.id.artist_name);

        // Get the artist name from the currentSong object and set this text on the artist_name TextView
        Artist.setText(currentSong.getArtist());

        // Find the SongTitle TextView in the playlist_item.xml layout
        TextView SongTitle = playlistItemView.findViewById(R.id.song_title);

        // Get the song title from the currentSong object and set this text on the song_title TextView
        SongTitle.setText(currentSong.getSongTitle());

        // Find the SongDuration TextView in the playlist_item.xml layout
        TextView SongDuration = playlistItemView.findViewById(R.id.song_duration);

        // Get the song duration from the currentSong object and set this text on the song_title TextView
        SongDuration.setText(currentSong.getSongDuration());

        // Return the playlist_item view
        return playlistItemView;
    }
}
