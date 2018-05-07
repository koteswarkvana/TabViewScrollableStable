package com.koti.apple.tabviewscrollablestable;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages. Adding class fragments.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    // tab titles
    private String[] tabTitles = new String[]{"Tab1", "Tab2", "Tab3", "Tab4"};
    private int[] tabImages = new int[]{R.drawable.android_m, R.drawable.android_n, R.drawable.android_o, R.drawable.android_p};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    // TODO:- Try to set the images for the tab along with the text ok na.
    public int[] getTabImages() {
        return tabImages;
    }


    @Override
    public Fragment getItem(int position) {
        FirstFragment firstFragment = null;
        switch (position) {
            case 0:
                Log.e("info >> ", "getItem: >> "+position);
                firstFragment = new FirstFragment();
                return firstFragment;
            case 1:
                Log.e("info >> ", "getItem: >> "+position);
                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;
            case 2:
                Log.e("info >> ", "getItem: >> "+position);
                ThirdFragment thirdFragment = new ThirdFragment();
                return thirdFragment;

            case 3:
                Log.e("info >> ", "getItem: >> "+position);
                FourthFragment fourthFragment = new FourthFragment();
                return fourthFragment;
            default:
                Log.e("info >> ", "getItem: >> ");
                return null;
        }
//        return firstFragment;
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }
}