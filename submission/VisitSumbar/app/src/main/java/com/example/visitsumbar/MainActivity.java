package com.example.visitsumbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView r_wilayah;
    private ArrayList<Wilayah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_wilayah = findViewById(R.id.r_wilayah);
        r_wilayah.setHasFixedSize(true);

        list.addAll(DataWilayah.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        r_wilayah.setLayoutManager(new LinearLayoutManager(this));
        ListWilayahAdapter listWilayahAdapter = new ListWilayahAdapter(list);
        r_wilayah.setAdapter(listWilayahAdapter);

        listWilayahAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Wilayah wilayah) {
                Intent pindahSkuy = new Intent(MainActivity.this, DetailWilayah.class);
                pindahSkuy.putExtra(DetailWilayah.ITEM_EXTRA, wilayah);
                startActivity(pindahSkuy);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}