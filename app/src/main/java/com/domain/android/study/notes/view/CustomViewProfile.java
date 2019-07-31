package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :轮廓 设置
 *     version: 1.0
 * </pre>
 */
public class CustomViewProfile extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewProfile(Context context) {
        super(context);
    }

    public CustomViewProfile(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewProfile(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStrokeWidth(20);


        PathEffect pathEffect = new DashPathEffect(new float[]{20,5},10);

        paint.setPathEffect(pathEffect);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,300,200,paint);



    }
}
