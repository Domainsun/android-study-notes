package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
 *     desc   :用 bitmap 叠加后上色填充，可以理解为把bitmap填充到指定的图形中
 *     version: 1.0
 * </pre>
 */
public class CustomViewComposeShader extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewComposeShader(Context context) {
        super(context);
    }

    public CustomViewComposeShader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewComposeShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_liuyifei);
        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_love);
        Shader shader2 = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Shader shader = new ComposeShader(shader1,shader2, PorterDuff.Mode.SRC_OVER);

        paint.setShader(shader);

        canvas.drawCircle(250,250,200,paint);


    }
}
