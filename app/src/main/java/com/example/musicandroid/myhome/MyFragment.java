package com.example.musicandroid.myhome;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musicandroid.R;
import com.example.musicandroid.base.BaseFragment;
import com.example.musicandroid.myhome.list.MyhomeListActivity;
import com.example.musicandroid.test.MusicTestAdapter;

import java.util.List;


public class MyFragment extends BaseFragment<MyHomeView, MyHomePresenter> implements MyHomeView, View.OnClickListener {

    private static final String ARG_SECTION = "section";


    private MusicTestAdapter adapter;

    private RecyclerView recyclerView;
    private MyHomePresenter presenter;


    //实例化碎片的构造方法
    public static MyFragment newInstance(String setion) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION, setion);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        findView(view);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MyHomePresenter presenter = new MyHomePresenter();
        presenter.attachView(MyFragment.this);
        presenter.setHomeRecyclerView();
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (this.presenter != null && this != null){
            this.presenter.detachView();
        }
    }

    @Override
    public MyHomePresenter createPresenter() {
        return new MyHomePresenter();
    }

    @Override
    public MyHomeView createView() {
        return this;
    }


    @Override
    public void showClickResult(String type, String name, String songlist, String address) {

        //getPresenter().test(list);


    }

    @Override
    public void setMusicList(List songLists) {


        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MusicTestAdapter(songLists);
        adapter.notifyDataSetChanged();

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

        Log.d("llll", "  000 isEmpty = "+ String.valueOf(songLists.size()));

    }


    public void findView(View view){

        recyclerView = view.findViewById(R.id.my_home_recycler_view);

        //顶部4个选项
        view.findViewById(R.id.my_localMusic).setOnClickListener(this);
        view.findViewById(R.id.my_star).setOnClickListener(this);
        view.findViewById(R.id.my_downlandMusic).setOnClickListener(this);
        view.findViewById(R.id.my_newSong).setOnClickListener(this);

        //我的音乐
        view.findViewById(R.id.my_myMusic_more).setOnClickListener(this);
        view.findViewById(R.id.my_myMusic_favor).setOnClickListener(this);
        view.findViewById(R.id.my_myMusic_recentPlay).setOnClickListener(this);
        view.findViewById(R.id.my_myMusic_newRecommend).setOnClickListener(this);

        //创建歌单
        view.findViewById(R.id.my_create_more).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int itemId = view.getId();
        Intent intent;
        switch (itemId){
            case R.id.my_localMusic:{
                Log.d("llll","  localMusic!");
                intent = new Intent(getActivity(), MyhomeListActivity.class);
                getActivity().startActivity(intent);
                //跳转
                break;
            }
            case R.id.my_star:{
                Log.d("llll","  star!");
                break;
            }
            case R.id.my_downlandMusic:{
                break;
            }
            case R.id.my_newSong:{
                break;
            }
            case R.id.my_myMusic_more:{
                break;
            }
            case R.id.my_myMusic_favor:{
                break;
            }
            case R.id.my_myMusic_recentPlay:{
                break;
            }
            case R.id.my_myMusic_newRecommend:{
                break;
            }
            case R.id.my_create_more:{
                Log.d("llll","  create more!");
                break;
            }



        }
    }
}
