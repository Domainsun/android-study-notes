package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :在onDraw前绘制,绘制的内容会在view本身的绘制前绘制
 *     version: 1.0
 * </pre>
 */

public class CustomViewBeforeOnDraw extends AppCompatTextView {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF bounds = new RectF();
    public CustomViewBeforeOnDraw(Context context) {
        super(context);
    }

    public CustomViewBeforeOnDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewBeforeOnDraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    {
        paint.setColor(Color.parseColor("#FFC107"));
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Layout layout = getLayout();
        bounds.left = layout.getLineLeft(1);
        bounds.right = layout.getLineRight(1);
        bounds.top = layout.getLineTop(1);
        bounds.bottom = layout.getLineBottom(1);
        canvas.drawRect(bounds,paint);

        bounds.left = layout.getLineLeft(3);
        bounds.right = layout.getLineRight(3);
        bounds.top = layout.getLineTop(3);
        bounds.bottom = layout.getLineBottom(3);
        canvas.drawRect(bounds,paint);
        super.onDraw(canvas);

    }
}
