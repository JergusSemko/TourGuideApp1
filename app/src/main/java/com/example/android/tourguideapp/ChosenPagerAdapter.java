package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ChosenPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //This is a constructor for the ViewPager Adapter used in the app
    public ChosenPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new TraditionsFragment();
        } else if (position == 2) {
            return new NatureFragment();
        } else {
            return new SportsFragment();
        }
    }

    @Override
    public int getCount() {
        //Returns the number of items of the Viewpager
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0) {
            return mContext.getString(R.string.fragment_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.fragment_traditions);
        } else if (position == 2) {
            return mContext.getString(R.string.fragment_nature);
        } else {
            return mContext.getString(R.string.fragment_sports);
        }
    }
}