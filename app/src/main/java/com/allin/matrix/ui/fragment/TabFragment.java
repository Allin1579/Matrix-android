package com.allin.matrix.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.allin.matrix.R;
import com.allin.matrix.base.ui.BaseFragment;

/**
 * Created by Allin on 2016/6/21.
 */
public class TabFragment extends BaseFragment {
    private TextView textView;

    private Bundle mBundle;

    public TabFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initView(View view){
        textView = (TextView) view.findViewById(R.id.text);
        String title = mBundle.getString("title");
        textView.setText(title);
    }

    @Override
    protected boolean initEvent() {
        return false;
    }

    public void bundleData(Bundle bundle){
        mBundle = bundle;
    }

}
