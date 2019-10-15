package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Map<String,String>> data;
    private RecyclerView recyclerView;
    private SongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        data = new ArrayList<>();
        adapter = new SongAdapter(getApplicationContext(), data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        final String[] songName = new String[]{
                "Omar",
                "Omar",
                "Omar",
                "Omar",
                "Omar",
                "Omar",
                "Omar",
                "Omar",
                "Omar",
                "Omar"
        };

        final String[] songDuration = new String[]{
                "2:45",
                "2:45",
                "2:45",
                "2:45",
                "2:45",
                "2:45",
                "2:45",
                "2:45",
                "2:45",
                "2:45"
        };

        final String[] songImage = new String[]{
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
                String.valueOf(R.drawable.song),
        };

        Map<String,String> temp = new HashMap<>();
        for (int i=0; i<songName.length; i++){
            temp.put("songName", songName[i]);
            temp.put("songDuration", songDuration[i]);
            temp.put("songImage", songImage[i]);
            data.add(temp);
        }

        adapter.notifyDataSetChanged();
    }
}
