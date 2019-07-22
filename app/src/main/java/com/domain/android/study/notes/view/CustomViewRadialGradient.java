package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :中央辐射渐变
 *     version: 1.0
 * </pre>
 */
public class CustomViewRadialGradient extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewRadialGradient(Context context) {
        super(context);
    }

    public CustomViewRadialGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewRadialGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new RadialGradient(250, 250, 150, Color.RED, Color.BLUE, Shader.TileMode.CLAMP);

        paint.setShader(shader);


        RectF rectF = new RectF(50, 150, 550, 350);
        canvas.drawCircle(250,250,200,paint);


    }
}
