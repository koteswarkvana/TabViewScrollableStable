package com.koti.apple.tabviewscrollablestable;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Adding class fragments.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstFragment firstFragment = new FirstFragment();
                return firstFragment;
            case 1:
                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;
            case 2:
                ThirdFragment thirdFragment = new ThirdFragment();
                return thirdFragment;

            case 3:
                FourthFragment fourthFragment = new FourthFragment();
                return fourthFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}