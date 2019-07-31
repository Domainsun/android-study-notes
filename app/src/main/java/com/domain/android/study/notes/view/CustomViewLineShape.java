package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :设置拐角形状
 *     version: 1.0
 * </pre>
 */
public class CustomViewLineShape extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewLineShape(Context context) {
        super(context);
    }

    public CustomViewLineShape(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewLineShape(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStrokeWidth(15);

        paint.setStrokeCap(Paint.Cap.ROUND);//圆头
        canvas.drawLine(50,60,300,60,paint);

        paint.setStrokeCap(Paint.Cap.BUTT);//平头
        canvas.drawLine(50,80,300,80,paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);//方头
        canvas.drawLine(50,100,300,100,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeMiter(4);

        float points1[] = {50,150,250,150,250,150,50,200};
        paint.setStrokeJoin(Paint.Join.MITER);
        canvas.drawLines(points1,paint);

        float points2[] = {50,250,250,250,250,250,50,300};
        paint.setStrokeJoin(Paint.Join.BEVEL);
        canvas.drawLines(points2,paint);

        float points3[] = {50,350,250,350,250,350,50,400};
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawLines(points3,paint);

        

    }
}
