package com.allin.matrix.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

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

        mTabLayout.setupWithViewPager(mViewPager);
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = mTabLayout.getTabAt(i);
            tab.setCustomView(getTabView(i));
        }
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

    private View getTabView(int position){
        View view = LayoutInflater.from(this).inflate(R.layout.activity_tab_item, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(titles[position]);
        if(position == 0){
            view.setSelected(true);
        }
        return view;
    }

}
