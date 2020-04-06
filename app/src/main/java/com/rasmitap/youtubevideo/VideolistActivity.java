package com.rasmitap.youtubevideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class VideolistActivity extends AppCompatActivity {

       RecyclerView rv_search_playlist;
//
//    ArrayList<SearchResultModel> arrayList = new ArrayList<>();
//
//    SearchPlaylistsItemAdapter searchPlaylistsItemAdapter;
//
//    public static VideolistActivity newInstance(ArrayList<SearchResultModel> arrayList) {
//
//        SeacrhPlaylistsFrag frag = new SeacrhPlaylistsFrag();
//        Bundle args = new Bundle();
//        args.putParcelableArrayList("list", arrayList);
//        frag.setArguments(args);
//        return frag;
//
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);
    }
}
