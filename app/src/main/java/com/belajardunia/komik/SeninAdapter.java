package com.belajardunia.komik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SeninAdapter {

    private final Context context;
    private ArrayList<Senin> senin;

    public HeroAdapter(Context context) {

        this.context = context;
        senin = new ArrayList<>();
    }

    public SeninAdapter() {
    }

    public void setHeroes(ArrayList<Senin> senin) {
        this.senin = senin;

    }

    @Override
    public int getCount() {
        return senin.size();
    }

    @Override
    public Object getItem(int i) {
        return senin.get(i);
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
        Senin senin = (Senin)getItem(i);
        viewHolder.bind(senin);
        return view;
    }

    private class ViewHolder{
        private TextView txtName, txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view){
            txtName = view.findViewById(R.id.tv_title_senin);
            imgPhoto = view.findViewById(R.id.img_photo_senin);
        }

        void bind(Senin senin){
            txtName.setText(senin.getName());
            imgPhoto.setImageResource(senin.getPhoto());
        }
    }

}
