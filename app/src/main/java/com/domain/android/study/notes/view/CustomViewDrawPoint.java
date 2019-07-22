package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CustomViewDrawPoint extends View {


    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public static final int START = 0;
    public static final int END = 800;


    public CustomViewDrawPoint(Context context) {
        super(context);
    }

    public CustomViewDrawPoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawPoint(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);//圆头画笔,用来画圆点
        canvas.drawPoint(100, 100, paint);

        paint.setStrokeCap(Paint.Cap.BUTT);//平头画笔，用来画方点
        canvas.drawPoint(200, 100, paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);//方头画笔，用来画方点
        canvas.drawPoint(300, 100, paint);

        //随机画一些圆点
        paint.setStrokeCap(Paint.Cap.ROUND);
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            Float x = Float.valueOf(random.nextInt(END - START + 1) + START);
            Float y = Float.valueOf(random.nextInt(END - START + 1) + START);
            canvas.drawPoint(x,y,paint);
        }


    }
}
