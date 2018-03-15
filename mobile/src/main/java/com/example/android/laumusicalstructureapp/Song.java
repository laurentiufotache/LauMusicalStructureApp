package com.example.android.laumusicalstructureapp;

/**
 * Created by lfotache on 12.03.2018.
 */

public class Song {

    //Declare the private variable for the artist name and the song title
    private String mArtist;
    private String mSongTitle;
    private String mDuration;

    //Create a new Song object
    public Song(String Artist, String SongTitle, String Duration) {
        mArtist = Artist;
        mSongTitle = SongTitle;
        mDuration = Duration;
    }

    //Get the artist name
    public String getArtist() {
        return mArtist;
    }

    //Get the song title
    public String getSongTitle() {
        return mSongTitle;
    }

    //Get the song duration
    public String getSongDuration() {
        return mDuration;
    }
}
