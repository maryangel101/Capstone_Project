package com.example.recommend1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    MarketPlaceFragment marketPlaceFragment = new MarketPlaceFragment();
    NewsFragment newsFragment = new NewsFragment();
    RecommendFragment recommendFragment = new RecommendFragment();
    WeatherFragment weatherFragment = new WeatherFragment();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.home) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, homeFragment) // corrected here
                    .commit();
            return true;
        } else if (itemId == R.id.marketplace) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, marketPlaceFragment) // corrected here
                    .commit();
            return true;
        } else if (itemId == R.id.news) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, newsFragment) // corrected here
                    .commit();
            return true;
        } else if (itemId == R.id.recommend) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, recommendFragment) // corrected here
                    .commit();
            return true;
        } else if (itemId == R.id.weather) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, weatherFragment) // corrected here
                    .commit();
            return true;
        }
        return false;
    }
}
