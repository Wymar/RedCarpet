package com.example.wymar.redcarpet;

import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity{

    private ViewPager viewPager;
    private TabAdapter mAdapter;
    private TabLayout   tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tabs);
        mAdapter = new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAdapter);

        for(String tab:mAdapter.getTabs()) {
            tabLayout.addTab(tabLayout.newTab().setText(tab));
        }


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageSelected(int pos){

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    public void onTabSelected(TabLayout.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    public void onTabUnselected(TabLayout.Tab tab, FragmentTransaction ft) {

    }

    public void onTabReselected(TabLayout.Tab tab, FragmentTransaction ft) {

    }
}
