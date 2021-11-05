package com.arul.iphong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class detailactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivity);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<PHONE> list = PHONEdata.getData(getApplicationContext());
        PHONE food = list.get(id);

        if (food != null) {
            TextView judulTV = findViewById(R.id.detail_judul);
            TextView hargaTV = findViewById(R.id.detail_harga);
            TextView deskripsiTV = findViewById(R.id.detail_deskripsi);
            ImageView image = findViewById(R.id.detail_photo);

            image.setImageDrawable(food.image);
            judulTV.setText(food.judul);
            hargaTV.setText(String.valueOf(food.harga));
            deskripsiTV.setText(food.deskripsi);
        }
    }
}