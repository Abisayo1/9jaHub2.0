package com.abisayo.a9jahub;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.abisayo.a9jahub.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarHome.toolbar);

        drawer = binding.drawer;
        toggle = new ActionBarDrawerToggle(this,drawer,binding.appBarHome.toolbar,R.string.open,R.string.close);
        navigationView = binding.navView;
        toggle.setDrawerIndicatorEnabled(true); // enable the hamburger sign
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }
}