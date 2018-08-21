package com.example.android.berkeleyhills;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Paths", "Parks", "Hikes", "Homes" };

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PathsFragment();
        } else if (position == 1){
            return new ParksFragment();
        } else if (position == 2){
            return new HikesFragment();
        } else {
            return new HomesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}


