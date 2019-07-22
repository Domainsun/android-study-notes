package com.domain.android.study.notes.customview;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.domain.android.study.notes.R;
import com.domain.android.study.notes.base.BaseActivity;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   : 画笔 paint 操作
 *     version: 1.0
 * </pre>
 */
public class CustomViewPartTwoActivity extends BaseActivity {


    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tab)
    SlidingTabLayout tab;
    @BindView(R.id.vp)
    ViewPager vp;

    String titls[]={"线性渐变","中央辐射渐变","扫描渐变","bitmap 填充","bitmap叠加填充","画线","画圆角矩形","画弧形 扇形","画bitmap"};

    ArrayList<Fragment> fragments = new ArrayList<Fragment>();
    public static void start(Context context) {
        Intent starter = new Intent(context, CustomViewPartTwoActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_custom_view_part_one;
    }

    @Override
    protected void initView() {
        tvTitle.setText("Paint 使用");
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

        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_linear_gradient));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_radial_gradient));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_sweep_gradient));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_bitmap_shader));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_compose_shader));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_line));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_round_rect));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_arc));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_draw_bitmap));

        tab.setViewPager(vp,titls,this,fragments);
    }
}
