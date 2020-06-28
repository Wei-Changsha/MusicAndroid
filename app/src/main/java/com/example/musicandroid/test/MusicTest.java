package com.example.musicandroid.test;

import android.widget.ImageView;

public class MusicTest {
    private String singer;
    private String musicName;
    private String musicLabel;
    private ImageView musicImage;

    public MusicTest(String singer){
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicLabel() {
        return musicLabel;
    }

    public void setMusicLabel(String musicLabel) {
        this.musicLabel = musicLabel;
    }

    public ImageView getMusicImage() {
        return musicImage;
    }

    public void setMusicImage(ImageView musicImage) {
        this.musicImage = musicImage;
    }
}
