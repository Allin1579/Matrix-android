package com.allin.matrix.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.allin.matrix.R;
import com.allin.matrix.base.ui.BaseActivity;
import com.allin.matrix.ui.adapter.CommonFragmentAdapter;
import com.allin.matrix.ui.fragment.TabFragment;

/**
 * Created by Allin on 2016/6/20.
 */
public class TabActivity extends BaseActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private TabFragment[] mFragments;
    private String[] titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initVariables(Bundle savedInstanceState) {
        mFragments = new TabFragment[]{
                new TabFragment(),
                new TabFragment(),
                new TabFragment(),
        };
        titles = new String[]{
                "菠萝", "蓝莓", "西瓜"
        };
        Bundle bundle = new Bundle();
        for (int i = 0; i < mFragments.length; i++){
            bundle.putString("title", titles[i]);
            mFragments[i].bundleData(bundle);
        }
    }

    @Override
    protected void initView(Bundle savedInstanceState){
        setContentView(R.layout.activity_tab);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        mViewPager.setAdapter(new CommonFragmentAdapter(getSupportFragmentManager(), mFragments, titles));

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

    @Override
    protected boolean initEvent() {
        return false;
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
