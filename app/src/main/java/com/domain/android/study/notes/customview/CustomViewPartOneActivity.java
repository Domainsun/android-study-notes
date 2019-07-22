package com.domain.android.study.notes.customview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.domain.android.study.notes.R;
import com.domain.android.study.notes.base.ActivityManager;
import com.domain.android.study.notes.base.BaseActivity;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CustomViewPartOneActivity extends BaseActivity {


    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tab)
    SlidingTabLayout tab;
    @BindView(R.id.vp)
    ViewPager vp;

    String titls[]={"画颜色","画圆圈","画矩形","画点","画椭圆","画线","画圆角矩形","画弧形 扇形","画bitmap"};

    ArrayList<Fragment> fragments = new ArrayList<Fragment>();
    public static void start(Context context) {
        Intent starter = new Intent(context, CustomViewPartOneActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_custom_view_part_one;
    }

    @Override
    protected void initView() {
        initViewPager();
    }


    @OnClick(R.id.tv_back)
    public void onViewClicked() {
        finish();
    }

    /**
     * 初始化viewpager
     */
    private void initViewPager(){

        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_color));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_circle));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_rect));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_point));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_oval));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_line));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_round_rect));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_arc));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_bitmap));

        tab.setViewPager(vp,titls,this,fragments);
    }
}
