package com.example.musicandroid.discovery;

import com.example.musicandroid.bean.SongList;
import com.example.musicandroid.util.CallBackData;

import java.util.ArrayList;
import java.util.List;

public class DiscoveryModel {

    public void getListData(String address, final CallBackData<List<SongList>> callBackData){


        List<SongList> list =  new ArrayList<>();
        list.clear();
        SongList songList = new SongList("iu的歌");
        for (int i = 0;i < 10; i++){
            list.add(songList);
        }

        callBackData.onSuccess(list);

    }
}
