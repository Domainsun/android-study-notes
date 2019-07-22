package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CustomViewDrawLine extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewDrawLine(Context context) {
        super(context);
    }

    public CustomViewDrawLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.RED);
        //设置线条宽度
        paint.setStrokeWidth(20);
        //设置方头
        paint.setStrokeCap(Paint.Cap.SQUARE);

        //画一条线
        canvas.drawLine(50,50,80,80,paint);

        //画多条线
        float[] points = {100,100,200,200,200,200,300,100,300,100,400,200};
        canvas.drawLines(points,paint);

    }
}
