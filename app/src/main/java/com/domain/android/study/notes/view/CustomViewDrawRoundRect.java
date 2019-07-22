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
public class CustomViewDrawRoundRect extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewDrawRoundRect(Context context) {
        super(context);
    }

    public CustomViewDrawRoundRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawRoundRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.RED);

        //画实心圆角矩形
        paint.setStyle(Paint.Style.FILL);
        //椭圆占满的矩形
        RectF rectF = new RectF(50,50,350,200);
        canvas.drawRoundRect(rectF,50,50,paint);

        //画空心椭圆
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF1 = new RectF(400, 50, 700, 200);
        canvas.drawRoundRect(rectF1,50,50,paint);



    }
}
