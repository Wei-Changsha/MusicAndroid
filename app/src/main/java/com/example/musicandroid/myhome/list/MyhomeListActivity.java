package com.example.musicandroid.myhome.list;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.musicandroid.R;
import com.example.musicandroid.base.BaseActivity;
import com.example.musicandroid.bean.Song;

import java.util.List;

public class MyhomeListActivity extends BaseActivity<SongListView,SongListPresenter> implements SongListView, View.OnClickListener  {

    private RecyclerView recyclerView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myhome_list);
        initView();
        SongListPresenter songListPresenter = new SongListPresenter();
        songListPresenter.attachView(this);
        songListPresenter.setSongRecyclerView();
    }

    @Override
    public SongListPresenter createPresenter() {
        return new SongListPresenter();
    }

    @Override
    public SongListView createView() {
        return this;
    }

    public void initView(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back);
        }

        recyclerView  = findViewById(R.id.song_list_recycler_view);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.myhome_list_menu,menu);

        return true;

    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent intent;

        switch (item.getItemId()){

            case R.id.list_more:{
                Toast.makeText(this,"更多",Toast.LENGTH_SHORT).show();
                //跳转到“查找”
                break;
            }
            case R.id.list_search:{
                Toast.makeText(this,"查找",Toast.LENGTH_SHORT).show();
                //跳转到“查找”
                break;
            }

            case android.R.id.home:{
                finish();
                break;
            }

            default:

        }

        return true;
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void showSongList(List<Song> list) {
        GridLayoutManager layoutManager = new GridLayoutManager(MyhomeListActivity.this,1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ListAdapter(list);
        adapter.notifyDataSetChanged();

        //加分割线
        //recyclerView.addItemDecoration(new DividerItemDecoration(MyhomeListActivity.this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        //getPresenter().setSongRecyclerView();
    }
}
