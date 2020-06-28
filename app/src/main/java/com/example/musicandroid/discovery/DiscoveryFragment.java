package com.example.musicandroid.discovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicandroid.R;
import com.example.musicandroid.base.BaseFragment;
import com.example.musicandroid.bean.SongList;
import com.example.musicandroid.test.MusicTestAdapter;

import java.util.List;

public class DiscoveryFragment extends BaseFragment<DiscoveryView,DiscoveryPresenter> implements DiscoveryView, View.OnClickListener  {

    private static final String ARG_SECTION = "section";
    private RecyclerView recyclerView;
    private DiscoveryListAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discovery,container,false);
        findView(view);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DiscoveryPresenter presenter = new DiscoveryPresenter();
        presenter.attachView(DiscoveryFragment.this);
        presenter.setListData();
    }


    //实例化碎片的构造方法
    public static DiscoveryFragment newInstance(String setion) {
        DiscoveryFragment fragment = new DiscoveryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION, setion);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public DiscoveryPresenter createPresenter() {
        return new DiscoveryPresenter();
    }

    @Override
    public DiscoveryView createView() {
        return this;
    }

    @Override
    public void showDiscoveryList(List<SongList> songLists) {

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new DiscoveryListAdapter(songLists);
        adapter.notifyDataSetChanged();

        //recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

    }


    public void findView(View view){
        recyclerView = view.findViewById(R.id.discovery_recycler_view);




    }
}
