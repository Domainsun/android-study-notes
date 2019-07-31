package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.domain.android.study.notes.R;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :在onDraw后绘制
 *     version: 1.0
 * </pre>
 */

public class CustomViewAfterOnDraw extends AppCompatImageView {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewAfterOnDraw(Context context) {
        super(context);
    }

    public CustomViewAfterOnDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewAfterOnDraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            canvas.save();
            canvas.concat(getImageMatrix());
            Rect bounds = drawable.getBounds();
            canvas.drawText(String.format("size:%s,%s", bounds.width(), bounds.height()), 20, 40, paint);
            canvas.restore();
        }
    }
}
