package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :在onDrawForeground后绘制， 先前景色， 后绘制绘制我们自己的内容,绘制绘制的内容会盖住前景色
 *     version: 1.0
 * </pre>
 */

public class CustomViewAfterOnDrawForeground extends AppCompatImageView {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewAfterOnDrawForeground(Context context) {
        super(context);
    }

    public CustomViewAfterOnDrawForeground(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewAfterOnDrawForeground(Context context, AttributeSet attrs, int defStyleAttr) {
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
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);

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
