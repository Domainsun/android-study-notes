package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :在Draw是总调度方法， 由Draw来调度drawBackground,onDraw,dispatchDraw,onDrawForeground 这些方法
 *
 *     方法执行顺序也是   drawBackground -> onDraw -> dispatchDraw -> onDrawForeground
 *
 *
 *      drawBackground -> onDraw -> dispatchDraw -> onDrawForeground
 *
 *     写在Draw绘制方法之后的绘制内容会覆盖上面所有方法的绘制内容
 *
 *     version: 1.0
 *
 * </pre>
 */

public class CustomViewAfterDraw extends AppCompatImageView {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewAfterDraw(Context context) {
        super(context);
    }

    public CustomViewAfterDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewAfterDraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(30);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        paint.setColor(Color.parseColor("#f44336"));
        canvas.drawRect(0, 40, 200, 120, paint);
        paint.setColor(Color.WHITE);

        //居中对齐
        paint.setTextAlign(Paint.Align.CENTER);
        //计算baseline
        Paint.FontMetrics fontMetrics=paint.getFontMetrics();
        float distance=(fontMetrics.descent - fontMetrics.ascent)/2 - fontMetrics.descent;
        float baseline=80+distance; //distance 就是计算出来的需要往下拉的 距离， 默认是从左下角开始，

        canvas.drawText("刘亦菲",100,baseline,paint);

    }
}
