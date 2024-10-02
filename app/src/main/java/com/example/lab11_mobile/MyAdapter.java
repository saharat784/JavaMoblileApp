package com.example.lab11_mobile;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lab11_mobile.model.Cars;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Cars> values;
    private Context context;

    public MyAdapter(List<Cars> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtFooter,txtThirdLine;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = v.findViewById(R.id.icon);
            txtHeader = v.findViewById(R.id.firstLine);
            txtFooter = v.findViewById(R.id.secondLine);

        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.car_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Cars chat = values.get(position);
        holder.txtHeader.setText(chat.getCars_type());
        holder.txtFooter.setText("models:" + chat.getCars_models());
        Glide.with(context)
                .load(chat.getCars_image())
                .into(holder.imgView);

        holder.imgView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("type", chat.getCars_type());
            intent.putExtra("image", chat.getCars_image());
            intent.putExtra("models", chat.getCars_models());
            intent.putExtra("price", chat.getCars_price());
            intent.putExtra("image1", chat.getCars_image1());
            intent.putExtra("image2", chat.getCars_image2());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}