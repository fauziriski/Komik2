package com.belajardunia.komik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MangaAdapter extends BaseAdapter {

    private final Context context;
    private ArrayList<Manga> manga;

    public MangaAdapter(Context context) {

        this.context = context;
        manga = new ArrayList<>();
    }


    public void setManga(ArrayList<Manga> manga) {
        this.manga = manga;

    }

    @Override
    public int getCount() {
        return manga.size();
    }

    @Override
    public Object getItem(int i) {
        return manga.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.home, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Manga manga = (Manga)getItem(i);
        viewHolder.bind(manga);
        return view;
    }

    private class ViewHolder{
        private TextView txtName, txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view){
            txtName = view.findViewById(R.id.txt_name);
            imgPhoto = view.findViewById(R.id.img_photo);
            txtDescription = view.findViewById(R.id.txt_description);
        }

        void bind(Manga manga){
            txtName.setText(manga.getName());
            imgPhoto.setImageResource(manga.getPhoto());
            txtDescription.setText(manga.getDescription());
        }
    }

}
