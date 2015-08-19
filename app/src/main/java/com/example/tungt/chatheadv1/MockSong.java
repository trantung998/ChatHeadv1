package com.example.tungt.chatheadv1;

/**
 * Created by onsite_kt on 7/4/2015.
 */
public class MockSong {
    public String mAlbumCoverPath;
    public int mSongDuration;
    public int mCurrentPlayheadPosition;
    public String mTitle;
    public String mSinger;

    public MockSong(String singer, String title, String path, int songDuration){
        mTitle = title;
        mSinger = singer;
        mAlbumCoverPath = path;
        mSongDuration = songDuration;
        mCurrentPlayheadPosition = 0;
    }
}
