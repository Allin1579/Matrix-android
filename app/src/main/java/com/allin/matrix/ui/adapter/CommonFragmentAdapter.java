package com.allin.matrix.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Allin on 2016/6/21.
 */
public class CommonFragmentAdapter extends FragmentPagerAdapter {
    private Fragment[] fragments;
    private String[] titles;

    public CommonFragmentAdapter(FragmentManager fm, Fragment[] fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public CommonFragmentAdapter(FragmentManager fm, Fragment[] fragments, String[] titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return fragments != null ? fragments[position] : null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return fragments != null ? fragments.length : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles != null ? titles[position] : null;
    }

}
