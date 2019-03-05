package com.example.weathermoji;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ForecastAdapter extends FragmentPagerAdapter {
    //private static final String TAG = CustomFragmentForecastAdapter.class.getSimpleName();
    private static final int FRAGMENT_COUNT = 4;

    public Context mContext;

    public ForecastAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TodaysForecastFragment();
            case 1:
                return new TomorrowsForecastFragment();
            case 2:
                return new TenDayForecastFragment();
            case 3:
                return new MapFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.today);
            case 1:
                return mContext.getString(R.string.tomorrow);
            case 2:
                return mContext.getString(R.string.ten_day);
            case 3:
                return mContext.getString(R.string.map);

        }
        return null;
    }

}