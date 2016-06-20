package com.allin.matrix.fragment;

import android.animation.Animator;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allin.matrix.util.LogUtil;

/**
 * Created by a on 2016/4/29.
 * Author: Allin
 */
public class BaseFragment extends Fragment {
    protected final String TAG = getTAG();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        LogUtil.i(TAG, "onAttach");
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        LogUtil.i(TAG, "onCreateAnimator");
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtil.i(TAG, "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LogUtil.i(TAG, "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LogUtil.i(TAG, "onViewCreated");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LogUtil.i(TAG, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        LogUtil.i(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtil.i(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtil.i(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtil.i(TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtil.i(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.i(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        LogUtil.i(TAG, "onDetach");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        LogUtil.i(TAG, "onLowMemory");
    }

    public String getTAG() {
        return TAG;
    }

}
