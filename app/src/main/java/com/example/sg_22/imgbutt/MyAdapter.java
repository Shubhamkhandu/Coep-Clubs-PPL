package com.example.sg_22.imgbutt;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public final class MyAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public MyAdapter(Context context) {
        mInflater = LayoutInflater.from(context);

        mItems.add(new Item("Aarya Raas",       R.drawable.aaryaraas));
        mItems.add(new Item("Aero Zealous",   R.drawable.aero));
        mItems.add(new Item("ANC", R.drawable.anc));
        mItems.add(new Item("ASM", R.drawable.asm));
        mItems.add(new Item("Astronomy",     R.drawable.astronomy));
        mItems.add(new Item("Boat Club",      R.drawable.boatclub));
        mItems.add(new Item("BC Quiz Club",   R.drawable.bcqc));
        mItems.add(new Item("Bhau ECell",  R.drawable.bhauecell));
        mItems.add(new Item("CoFSUG",   R.drawable.cofsug));
        mItems.add(new Item("CSAT",   R.drawable.csat));
        mItems.add(new Item("Dance CLub",   R.drawable.daance));
        mItems.add(new Item("Debate Club",   R.drawable.debateclub));
        mItems.add(new Item("Entrepreneur Club",   R.drawable.entraponor));
        mItems.add(new Item("Google Club",   R.drawable.googleclub));
        mItems.add(new Item("HAM",   R.drawable.ham));
        mItems.add(new Item("History CLub",   R.drawable.history));
        mItems.add(new Item("Janeev CLub",   R.drawable.janeev));
        mItems.add(new Item("Team Nemesis Racing",   R.drawable.nemesis));
        mItems.add(new Item("NSS",   R.drawable.nss));
        mItems.add(new Item("Octane Racing", R.drawable.octane));
        mItems.add(new Item("Personality Development",   R.drawable.pd));
        mItems.add(new Item("PhyloMystic",   R.drawable.philomystic));
        mItems.add(new Item("Photography",   R.drawable.photography));
        mItems.add(new Item("Robot Study Circle",   R.drawable.robot));
        mItems.add(new Item("Science Club",   R.drawable.science));
        mItems.add(new Item("Spandan",   R.drawable.spandan));
        mItems.add(new Item("Spicmacay",   R.drawable.spicmacay));
        mItems.add(new Item("Sunrisers", R.drawable.sunrisers));
        mItems.add(new Item("Student Welfare",   R.drawable.studentwelfare));
        mItems.add(new Item("TedX COEP", R.drawable.tedx));

    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }

}