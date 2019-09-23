package com.belajardunia.komik;

import android.content.res.TypedArray;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private MangaAdapter adapter;
    private ArrayList<Manga> manga;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, homeFragment);
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_rekomendasi:
                    RekomendasiFragment rekomendasiFragment = new RekomendasiFragment();
                    FragmentTransaction fragmentRekomendasiTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentRekomendasiTransaction.replace(R.id.content, rekomendasiFragment);
                    fragmentRekomendasiTransaction.commit();
                    return true;

                case R.id.navigation_more:
                    MoreFragment moreFragment = new MoreFragment();
                    FragmentTransaction fragmentMoreTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentMoreTransaction.replace(R.id.content, moreFragment);
                    fragmentMoreTransaction.commit();
                    return true;
            }
            return false;


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        adapter = new MangaAdapter(this);

        ListView listView = findViewById(R.id.lv_list);

        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(MainActivity.this, manga.get(i).getName(), Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void prepare(){
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }

    private void addItem(){
        manga = new ArrayList<>();

        for(int i=0; i<dataName.length; i++){
            Manga mangas = new Manga();
            mangas.setPhoto(dataPhoto.getResourceId(i,-1));
            mangas.setName(dataName[i]);
            mangas.setDescription(dataDescription[i]);
            manga.add(mangas);

        }
        adapter.setManga(manga);
    }
}
