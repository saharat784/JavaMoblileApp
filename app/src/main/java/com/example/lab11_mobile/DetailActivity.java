package com.example.lab11_mobile;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        String image = intent.getStringExtra("image");
        String models = intent.getStringExtra("models");
        String price = intent.getStringExtra("price");
        String image1 = intent.getStringExtra("image1");
        String image2 = intent.getStringExtra("image2");


        ImageView imageView = findViewById(R.id.img);
        Glide.with(this)
                .load(image)
                .into(imageView);

        ImageView imageView1 = findViewById(R.id.img1);
        Glide.with(this)
                .load(image1)
                .into(imageView1);

        ImageView imageView2 = findViewById(R.id.img2);
        Glide.with(this)
                .load(image2)
                .into(imageView2);


        TextView textView = findViewById(R.id.type);
        textView.setText("Type: " + type);

        TextView textView1 = findViewById(R.id.model);
        textView1.setText("Models: " + models);

        TextView textView2 = findViewById(R.id.Detail);
        textView2.setText("MoreInformations:");

        TextView textView3 = findViewById(R.id.Price);
        textView3.setText("Price: " + price);

    }
}