package com.example.lab11_mobile;

import android.os.Bundle;



import com.example.lab11_mobile.model.Cars;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    //    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private RecyclerView.Adapter<MyAdapter.ViewHolder> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.Main);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        List<Cars> chats = new ArrayList<Cars>();

        Cars chat1 = new Cars();
        chat1.setCars_type("Sedan");
        chat1.setCars_image("https://i.imgur.com/TWIgUXk.png");
        chat1.setCars_models("Audi A6");
        chat1.setCars_price("$74,645");
        chat1.setCars_image1("https://i.imgur.com/6cCSxO1.png");
        chat1.setCars_image2("https://i.imgur.com/lshJnr0.png");
        chats.add(chat1);

        Cars chat2 = new Cars();
        chat2.setCars_type("SUV");
        chat2.setCars_image("https://i.imgur.com/DECv9S7.png");
        chat2.setCars_models("Audi Q7");
        chat2.setCars_price("$79,195");
        chat2.setCars_image1("https://i.imgur.com/eYRcDdI.png");
        chat2.setCars_image2("https://i.imgur.com/i72QYFf.png");
        chats.add(chat2);

        Cars chat3 = new Cars();
        chat3.setCars_type("Coupé");
        chat3.setCars_image("https://i.imgur.com/cEIYLRu.png");
        chat3.setCars_models("Audi TTRS");
        chat3.setCars_price("$72,500");
        chat3.setCars_image1("https://i.imgur.com/0WYTNO2.png");
        chat3.setCars_image2("https://i.imgur.com/IIYRNzM.png");
        chats.add(chat3);

        Cars chat4 = new Cars();
        chat4.setCars_type("Van");
        chat4.setCars_image("https://i.imgur.com/vUsCcID.png");
        chat4.setCars_models("VW Multivan");
        chat4.setCars_price("$72,290");
        chat4.setCars_image1("https://i.imgur.com/bA7hP37.png");
        chat4.setCars_image2("https://i.imgur.com/2lmIu4f.png");
        chats.add(chat4);

        Cars chat5 = new Cars();
        chat5.setCars_type("Pickup");
        chat5.setCars_image("https://i.imgur.com/7OOny2t.png");
        chat5.setCars_models("VW Amarok");
        chat5.setCars_price("$745,987");
        chat5.setCars_image1("https://i.imgur.com/Tj44Its.png");
        chat5.setCars_image2("https://i.imgur.com/yXcw8IW.png");
        chats.add(chat5);


        mAdapter = new MyAdapter(chats, this);
        recyclerView.setAdapter(mAdapter);
    }
}