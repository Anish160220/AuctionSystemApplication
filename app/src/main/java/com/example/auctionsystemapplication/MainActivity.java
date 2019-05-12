package com.example.auctionsystemapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.MainActivityAdapter;
import fragments.LogInFragment;
import fragments.SignUpFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabId);

        MainActivityAdapter adapter = new MainActivityAdapter(getSupportFragmentManager());

        adapter.addFragment(new LogInFragment(),"Log In");
        adapter.addFragment(new SignUpFragment(),"Sign Up");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
