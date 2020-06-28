package com.example.musicandroid.myhome.list;

import com.example.musicandroid.base.BaseView;
import com.example.musicandroid.bean.Song;

import java.util.List;

public interface SongListView extends BaseView {

    void showSongList(List<Song> list);
}
