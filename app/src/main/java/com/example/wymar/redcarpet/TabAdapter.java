package com.example.wymar.redcarpet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    private String[] tabs = {"Dashboard","Parties","Chat","Settings"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    public String[] getTabs(){
        return tabs;
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new DashFragment();
            case 1:
                return new PartyFragment();
            case 2:
                return new ChatFragment();
            case 3:
                return new SettingsFragment();
        }

        return null;
    }

    @Override
    public int getCount(){
        return 4;
    }
}
