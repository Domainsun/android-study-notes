package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.domain.android.study.notes.R;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :画bitmap
 *     version: 1.0
 * </pre>
 */
public class CustomViewDrawBitmap extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewDrawBitmap(Context context) {
        super(context);
    }

    public CustomViewDrawBitmap(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawBitmap(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Drawable drawable = ContextCompat.getDrawable(getContext(), R.mipmap.icon_circle_shadow);
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            canvas.drawBitmap(bitmap, 300, 300, paint);
        }

    }
}
