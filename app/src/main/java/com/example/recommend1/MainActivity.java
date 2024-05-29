package com.example.recommend1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigationrail.NavigationRailView;

/** @noinspection ALL*/
public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener, NavigationRailView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    NavigationRailView navigationRailView;

    HomeFragment homeFragment = new HomeFragment();
    MarketPlaceFragment marketPlaceFragment = new MarketPlaceFragment();
    NewsFragment newsFragment = new NewsFragment();
    RecommendFragment recommendFragment = new RecommendFragment();
    WeatherFragment weatherFragment = new WeatherFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navigationRailView = findViewById(R.id.navigationRailView);

        if (bottomNavigationView != null) {
            bottomNavigationView.setOnNavigationItemSelectedListener(this);
            bottomNavigationView.setSelectedItemId(R.id.home);
        } else if (navigationRailView != null) {
            navigationRailView.setOnItemSelectedListener(this);
            navigationRailView.setSelectedItemId(R.id.home);
        }

        // Load the default fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, homeFragment)
                    .commit();
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return handleNavigation(item.getItemId());
    }

    private boolean handleNavigation(int itemId) {
        Fragment selectedFragment;

        if (itemId == R.id.home) {
            selectedFragment = homeFragment;
        } else if (itemId == R.id.marketplace) {
            selectedFragment = marketPlaceFragment;
        } else if (itemId == R.id.news) {
            selectedFragment = newsFragment;
        } else if (itemId == R.id.recommend) {
            selectedFragment = recommendFragment;
        } else if (itemId == R.id.weather) {
            selectedFragment = weatherFragment;
        } else {
            return false;
        }

        if (selectedFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit();
            return true;
        }

        return false;
    }
}
