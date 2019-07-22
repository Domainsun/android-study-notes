package com.domain.android.study.notes.customview;

import android.os.Bundle;

import com.domain.android.study.notes.R;
import com.domain.android.study.notes.base.BaseFragment;


/**
 * Description:
 * Data：2018/11/5-10:20
 * Author: domain
 */

public class CustomeViewFragment extends BaseFragment {

    /**
     *布局id
     */
    private int layoutId ;

    public static CustomeViewFragment newInstance(int layoutId) {
        Bundle bundle = new Bundle();
        bundle.putInt("layoutId", layoutId);
        CustomeViewFragment fragment = new CustomeViewFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int setLayoutId() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            layoutId = bundle.getInt("layoutId");
        }
        return layoutId;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void lazyLoadData() {}



}
