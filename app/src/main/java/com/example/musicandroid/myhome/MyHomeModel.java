package com.example.musicandroid.myhome;


import android.util.Log;

import com.example.musicandroid.test.MusicTest;
import com.example.musicandroid.util.CallBackData;

import java.util.ArrayList;
import java.util.List;

public class MyHomeModel  {

    public void getRecylerViewData(String address, final CallBackData<List<MusicTest>> callBackData){


        List<MusicTest> list = new ArrayList<>();
        list.clear();
        MusicTest music1 = new MusicTest("iu");
        for (int i = 0; i< 21;i++){
            list.add(music1);
        }
        Log.d(" llll ", " 2222 size = "+ list.size());
        callBackData.onSuccess(list);

    }


}
