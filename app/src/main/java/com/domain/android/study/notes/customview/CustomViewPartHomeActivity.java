package com.domain.android.study.notes.customview;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.domain.android.study.notes.R;
import com.domain.android.study.notes.adapter.MyAdapter;
import com.domain.android.study.notes.base.BaseActivity;
import com.domain.android.study.notes.entity.ItemVo;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   : 自定义view 学习首页
 *     version: 1.0
 * </pre>
 */
public class CustomViewPartHomeActivity extends BaseActivity {

    @BindView(R.id.tv_back)
    TextView tvBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rv)
    RecyclerView rv;

    MyAdapter myAdapter=null;

    public ArrayList<Class> clazz =new ArrayList<Class>(){
        {
            add(CustomViewPartOneActivity.class);
            add(CustomViewPartTwoActivity.class);
            add(CustomViewPartThreeActivity.class);
            add(CustomViewPartFourActivity.class);
            add(CustomViewPartFiveActivity.class);
            add(CustomViewProgreeBarActivity.class);
        }
    };

    public ArrayList<ItemVo> data =new ArrayList<ItemVo>(){
        {
            add(new ItemVo(R.mipmap.icon_canvas,"画布操作"));
            add(new ItemVo(R.mipmap.icon_paint,"画笔操作"));
            add(new ItemVo(R.mipmap.icon_text,"文字操作"));
            add(new ItemVo(R.mipmap.icon_text,"几何变换"));
            add(new ItemVo(R.mipmap.icon_text,"绘制顺序"));
            add(new ItemVo(R.mipmap.icon_text,"进度条实战"));
        }
    };

    public static void start(Context context) {
        Intent starter = new Intent(context, CustomViewPartHomeActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_custom_view_home;
    }

    @Override
    protected void initView() {
        tvTitle.setText("自定义view学习");
        initAdatper();
    }


    @OnClick(R.id.tv_back)
    public void onViewClicked() {
        finish();
    }


    private void initAdatper() {
        myAdapter = new MyAdapter(R.layout.item, data);
        LinearLayoutManager layoutManage = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManage);
        rv.setAdapter(myAdapter);
        myAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent i=new Intent(CustomViewPartHomeActivity.this,clazz.get(position));
                startActivity(i);
            }
        });

    }
}
