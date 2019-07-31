package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
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
 *     desc   :矩形裁剪
 *     version: 1.0
 * </pre>
 */
public class CustomViewClipRect extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewClipRect(Context context) {
        super(context);
    }

    public CustomViewClipRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewClipRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_liuyifei);

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        int left=width/ 2-100;
        int right=width/2+100;
        int top=height/2-100;
        int bottom=height/2+100;

        canvas.save();
        //裁剪出图片中间的 200*200 的区域
        canvas.clipRect(left,top,right,bottom);
        canvas.drawBitmap(bitmap,0,0,paint);
        canvas.restore();


    }
}
