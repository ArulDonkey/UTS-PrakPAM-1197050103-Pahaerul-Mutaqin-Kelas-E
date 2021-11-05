package com.arul.iphong;

import android.content.Context;

import java.util.ArrayList;

public class PHONEdata {
    public static ArrayList<PHONE> getData(Context context) {
        ArrayList<PHONE> list = new ArrayList<PHONE>();
        list.add(new PHONE("Iphone 11", "64gb, 128gb, 256gb", 11000000, context.getDrawable(R.drawable.sabelasaja)));
        list.add(new PHONE("Iphone 11 Pro", "64gb, 128gb, 256gb", 8000000, context.getDrawable(R.drawable.sebelaspro)));
        list.add(new PHONE("Iphone X", "64gb, 128gb, 256gb", 5000000, context.getDrawable(R.drawable.iphoneten)));
        list.add(new PHONE("Iphone XR", "64gb, 128gb, 256gb", 5000000, context.getDrawable(R.drawable.iphonetenar)));
        list.add(new PHONE("Iphone 8+", "64gb, 128gb, 256gb", 4000000, context.getDrawable(R.drawable.delapanplus)));
        return list;
    }
}
