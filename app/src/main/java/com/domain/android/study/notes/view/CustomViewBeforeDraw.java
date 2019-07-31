package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :在Draw是总调度方法， 由Draw来调度drawBackground,onDraw,dispatchDraw,onDrawForeground 这些方法
 *
 *     方法执行顺序也是   drawBackground -> onDraw -> dispatchDraw -> onDrawForeground
 *
 *     写在Draw绘制方法之后的绘制内容会覆盖上面所有方法的绘制内容
 *
 *
 *     version: 1.0
 * </pre>
 */

public class CustomViewBeforeDraw extends AppCompatEditText {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewBeforeDraw(Context context) {
        super(context);
    }

    public CustomViewBeforeDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewBeforeDraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {

        canvas.drawColor(Color.parseColor("#ff0000"));

        super.draw(canvas);

    }
}
