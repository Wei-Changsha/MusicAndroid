package com.example.musicandroid.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicandroid.R;

import java.util.List;

public class MusicTestAdapter extends RecyclerView.Adapter<MusicTestAdapter.ViewHolder> {

    private List<MusicTest> list;
    private Context mContent;

    public MusicTestAdapter(List<MusicTest> list){
        this.list = list;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView imageView;
        TextView singer;
        TextView songNum;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            singer = itemView.findViewById(R.id.singer_name);
            songNum = itemView.findViewById(R.id.song_num);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (mContent == null){
            mContent = parent.getContext();
        }

        View view = LayoutInflater.from(mContent).inflate(R.layout.item_myhome_musiclist,
                parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        MusicTest musicTest = list.get(position);
        holder.singer.setText(musicTest.getSinger());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
