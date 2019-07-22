package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
public class CustomViewDrawCircle extends View {


    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public CustomViewDrawCircle(Context context) {
        super(context);
    }

    public CustomViewDrawCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawCircle(100,100,50,paint);

        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(200,100,50,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,100,50,paint);

        paint.setStrokeWidth(2);
        canvas.drawCircle(400,100,50,paint);


        //500-700
        canvas.drawCircle(600,100,50,paint);
        paint.setStrokeWidth(20);
        canvas.drawCircle(600,100,75,paint);
        paint.setStrokeWidth(2);
        canvas.drawCircle(600,100,100,paint);


    }
}
