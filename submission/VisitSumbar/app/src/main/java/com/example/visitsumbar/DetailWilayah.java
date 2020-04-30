package com.example.visitsumbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailWilayah extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wilayah);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvHarga = findViewById(R.id.tv_item_harga);

        Wilayah wilayah = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (wilayah != null) {
            Glide.with(this)
                    .load(wilayah.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(wilayah.getNama_wilayah());
            tvDeskripsi.setText(wilayah.getDetail_wilayah());
            tvHarga.setText(wilayah.getLokasi());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Wilayah");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
