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
 *     desc   : 实战， 进度条的绘制
 *     version: 1.0
 * </pre>
 */
public class CustomViewProgreeBarActivity extends BaseActivity {

    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tab)
    SlidingTabLayout tab;
    @BindView(R.id.vp)
    ViewPager vp;

    String titles[]={"圆形进度条","onDraw前绘制","在ViewGroup中onDraw","dispatchDrawLayout","onDrawForeground 先绘制前景色","onDrawForeground 后绘制前景色","draw所有绘制方法前执行","draw所有绘制方法后执行"};

    ArrayList<Fragment> fragments = new ArrayList<Fragment>();

    public static void start(Context context) {
        Intent starter = new Intent(context, CustomViewProgreeBarActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_custom_view_part_one;
    }

    @Override
    protected void initView() {
        tvTitle.setText("绘制的顺序");
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

        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_circle_progress_bar));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_before_ondraw));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_ondraw_layout));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_dispatch_draw_layout));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_after_ondraw_foreground));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_before_ondraw_foreground));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_after_draw));
        fragments.add(CustomeViewFragment.newInstance(R.layout.custom_view_before_draw));
        
        tab.setViewPager(vp, titles,this,fragments);

    }


}
