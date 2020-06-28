package com.example.musicandroid.discovery;

import com.example.musicandroid.base.BasePresenter;
import com.example.musicandroid.bean.SongList;
import com.example.musicandroid.util.CallBackData;

import java.util.List;

public class DiscoveryPresenter extends BasePresenter<DiscoveryView> {

    private DiscoveryModel discoveryModel;

    public DiscoveryPresenter(){
        this.discoveryModel = new DiscoveryModel();
    }

    public void setListData(){
        this.discoveryModel.getListData("", new CallBackData<List<SongList>>() {
            @Override
            public void onSuccess(List<SongList> songLists) {
                if (getView() != null){
                    getView().showDiscoveryList(songLists);
                }
            }

            @Override
            public void onStart() {

            }

            @Override
            public void onFailed() {

            }

            @Override
            public void onFinish() {

            }
        });
    }

}
