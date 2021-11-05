package com.arul.iphong;

import android.graphics.drawable.Drawable;


public class PHONE {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;

    PHONE(String judul, String deskripsi, int harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}