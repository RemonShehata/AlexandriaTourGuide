package com.example.android.alexandriatourguide.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.alexandriatourguide.fragments.AboutFragment;
import com.example.android.alexandriatourguide.fragments.FoodFragment;
import com.example.android.alexandriatourguide.fragments.HotelsFragment;
import com.example.android.alexandriatourguide.fragments.SightseeingFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new SightseeingFragment();
            default:
                return new FoodFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "About";
            case 1:
                return "Hotels";
            case 2:
                return "SightSeeings";
            default:
                return "Food";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
