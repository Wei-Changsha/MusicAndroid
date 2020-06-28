package com.example.musicandroid.myhome.list;

import android.util.Log;

import com.example.musicandroid.bean.Song;
import com.example.musicandroid.util.CallBackData;

import java.util.ArrayList;
import java.util.List;

public class SongListModel {
    public void getSongListData(String address, final CallBackData<List<Song>> callBackData){


        List<Song> list = new ArrayList<>();

        list.clear();
        Song song = new Song(11,"Blueming");
        for (int i = 0; i< 21;i++){
            list.add(song);
        }
        Log.d(" llll ", " 2222 size = "+ list.size());
        callBackData.onSuccess(list);

    }
}
