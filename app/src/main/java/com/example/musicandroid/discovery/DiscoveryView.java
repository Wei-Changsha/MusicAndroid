package com.example.musicandroid.discovery;

import com.example.musicandroid.base.BaseView;
import com.example.musicandroid.bean.SongList;

import java.util.List;

public interface DiscoveryView extends BaseView {

    void showDiscoveryList(List<SongList> songLists);
}
