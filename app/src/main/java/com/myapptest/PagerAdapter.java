package com.myapptest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Hoyoung on 2017-07-02.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    private static int PAGE_NUMBER = 3;
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case  0:
                Log.d("Test","getItem() 0 호출!");
                return PageOneFragment.newInstance();
            case 1:
                Log.d("Test","getItem() 1 호출!");
                return PageTwoFragment.newInstance();
            case 2:
                Log.d("Test","getItem() 2 호출!");
                return PageThreeFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }
}
