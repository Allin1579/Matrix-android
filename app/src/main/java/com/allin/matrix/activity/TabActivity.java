package com.allin.matrix.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.allin.matrix.R;
import com.allin.matrix.adapter.TabFragmentAdapter;
import com.allin.matrix.fragment.TabFragment0;
import com.allin.matrix.fragment.TabFragment1;
import com.allin.matrix.fragment.TabFragment2;

public class TabActivity extends BaseActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private Fragment[] mFragments;
    private String[] titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        mFragments = new Fragment[]{
                new TabFragment0(),
                new TabFragment1(),
                new TabFragment2(),
        };
        titles = new String[]{
                "菠萝", "蓝莓", "西瓜"
        };
        initView();
    }

    private void initView(){
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        mViewPager.setAdapter(new TabFragmentAdapter(getSupportFragmentManager(), mFragments, titles));
//        mTabLayout.setTabsFromPagerAdapter(null);
        mTabLayout.addTab(mTabLayout.newTab().setText(titles[0]));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles[1]));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles[2]));
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
