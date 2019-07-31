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
 *     desc   : 几何变换
 *     version: 1.0
 * </pre>
 */
public class CustomViewPartFourActivity extends BaseActivity {

    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tab)
    SlidingTabLayout tab;
    @BindView(R.id.vp)
    ViewPager vp;

    String titles[]={"矩形裁剪","移动原点","缩放","旋转","错切"};

    ArrayList<Fragment> fragments = new ArrayList<Fragment>();

    public static void start(Context context) {
        Intent starter = new Intent(context, CustomViewPartFourActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_custom_view_part_one;
    }

    @Override
    protected void initView() {
        tvTitle.setText("几何变换");
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

        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_clip_rect));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_translate));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_scale));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_rotate));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_skew));

        tab.setViewPager(vp, titles,this,fragments);

    }


}
