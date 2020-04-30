package com.example.visitsumbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWilayahAdapter extends RecyclerView.Adapter<ListWilayahAdapter.ListViewHolder> {
    private final ArrayList<Wilayah> listWilayah;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListWilayahAdapter(ArrayList<Wilayah> list) {
        this.listWilayah = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wilayah, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        final Wilayah wilayah = listWilayah.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(wilayah.getPhoto())
                .apply(new RequestOptions().override(150, 150))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(wilayah.getNama_wilayah());
        listViewHolder.tvDetail.setText(wilayah.getDetail_wilayah());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(wilayah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWilayah.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
