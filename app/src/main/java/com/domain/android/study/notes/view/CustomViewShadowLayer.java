package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
 *     desc   :绘制阴影
 *     version: 1.0
 * </pre>
 */
public class CustomViewShadowLayer extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewShadowLayer(Context context) {
        super(context);
    }

    public CustomViewShadowLayer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewShadowLayer(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStrokeWidth(20);

        paint.setShadowLayer(10,0,0, Color.RED);

        paint.setTextSize(60);
        canvas.drawText("Hello domain",80,300,paint);


    }
}
