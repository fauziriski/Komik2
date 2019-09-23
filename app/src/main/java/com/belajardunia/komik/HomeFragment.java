package com.belajardunia.komik;


//import android.content.res.TypedArray;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.Toast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment{


//    private String[] dataName;
//    private String[] dataDescription;
//    private TypedArray dataPhoto;
//    private MangaAdapter adapter;
//    private ArrayList<Manga> manga;


    public HomeFragment() {
        // Required empty public constructor
    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        adapter = new MangaAdapter(this);
//
//
//        ListView listView = getView().findViewById(R.id.lv_list);
//        listView.setAdapter(adapter);
//
//        prepare();
//        addItem();
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
//                Toast.makeText(MainActivity.this, manga.get(i).getName(), Toast.LENGTH_SHORT).show();
//            }
//
//        });
//
//        return inflater.inflate(R.layout.fragment_home, container, false);
//    }
//
//    private void prepare(){
//        dataName = getResources().getStringArray(R.array.data_name);
//        dataDescription = getResources().getStringArray(R.array.data_description);
//        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
//    }
//
//    private void addItem(){
//        manga = new ArrayList<>();
//
//        for(int i=0; i<dataName.length; i++){
//            Manga mangas = new Manga();
//            mangas.setPhoto(dataPhoto.getResourceId(i,-1));
//            mangas.setName(dataName[i]);
//            mangas.setDescription(dataDescription[i]);
//            manga.add(mangas);
//
//        }
//        adapter.setManga(manga);
//    }
//
//    @Override
//    public void onClick(View v) {
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
