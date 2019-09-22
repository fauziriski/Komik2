package com.belajardunia.komik;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


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
                    MoreFragment moreFragment= new MoreFragment();
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

        HomeFragment homeFragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, homeFragment);
        fragmentTransaction.commit();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
