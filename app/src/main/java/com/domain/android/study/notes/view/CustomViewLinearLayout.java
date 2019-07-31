package com.domain.android.study.notes.view;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.domain.android.study.notes.R;
import com.domain.android.study.notes.util.CalcUtil;

import java.net.PortUnreachableException;
import java.util.logging.LogRecord;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/31
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CustomViewLinearLayout extends LinearLayout {
    public CustomViewLinearLayout(Context context) {
        super(context);
    }

    public CustomViewLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public double progress = 0;
    CustomViewCircleProgressBar circleProgressBar;
    CustomViewRoundRectProgressBar round_rect_progress_bar;
    Handler handler=new Handler() ;
    Runnable r =new Runnable() {
        @Override
        public void run() {
            progress=  CalcUtil.add(progress,0.1);
            circleProgressBar.setProgress(progress);
            round_rect_progress_bar.setProgress(progress);
            handler.postDelayed(this,1000);
        }
    };
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        View tvStart = findViewById(R.id.tv_start);
        circleProgressBar = findViewById(R.id.circle_progress_bar);
        round_rect_progress_bar = findViewById(R.id.round_rect_progress_bar);

        tvStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(r,100);
            }
        });


    }



}
