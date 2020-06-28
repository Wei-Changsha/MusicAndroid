package com.example.musicandroid.myhome.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicandroid.R;
import com.example.musicandroid.bean.Song;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Song> list ;

    public ListAdapter(List<Song> list){
        this.list = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView listRank;
        TextView songName;
        TextView singer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            listRank = itemView.findViewById(R.id.song_rank);
            songName = itemView.findViewById(R.id.list_song_name);
            singer = itemView.findViewById(R.id.list_song_singer);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,
                parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Song song = list.get(position);
        String singerName;

        /*TODO
         *song.getSingerId()  根据歌手的id去数据库中查找歌手名字
         */
        if (song.getSingerId() == 11){
            singerName = "IU";
        }else {
            singerName = "kong";
        }
        holder.singer.setText(singerName);
        holder.songName.setText(song.getName());
        holder.listRank.setText(position + 1 + "");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
