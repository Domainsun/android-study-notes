package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.domain.android.study.notes.R;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :用bitmap上色，可以理解为把bitmap填充到指定的图形中
 *     version: 1.0
 * </pre>
 */
public class CustomViewBitmapShader extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewBitmapShader(Context context) {
        super(context);
    }

    public CustomViewBitmapShader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewBitmapShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_liuyifei);
        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        paint.setShader(shader);

        canvas.drawCircle(250,250,200,paint);


    }
}
