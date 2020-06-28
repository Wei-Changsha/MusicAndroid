package com.example.musicandroid.bean;

import java.sql.Date;

public class Song {
    private int id;                 //主键
    private int singerId;           //歌手id
    private String name;            //歌曲名字
    private String introduction;    //歌手介绍
    private String pic;             //指向歌曲图片静态资源
    private String lyric;           //歌词
    private String url;             //指向歌曲资源


    public Song(int singerId, String name) {
        this.singerId = singerId;
        this.name = name;
    }

    public Song(String name, String pic) {
        this.name = name;
        this.pic = pic;
    }

    public Song(int id, int singerId, String name, String introduction,
                String pic, String lyric, String url) {
        this.id = id;
        this.singerId = singerId;
        this.name = name;
        this.introduction = introduction;
        this.pic = pic;
        this.lyric = lyric;
        this.url = url;
    }

    public Song(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
