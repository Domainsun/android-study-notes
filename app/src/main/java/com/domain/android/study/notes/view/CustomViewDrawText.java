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
 *     desc   :画文字 居中显示
 *     version: 1.0
 * </pre>
 */
public class CustomViewDrawText extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text="hello domain";

    public CustomViewDrawText(Context context) {
        super(context);
    }

    public CustomViewDrawText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.YELLOW);
//        RectF rectF = new RectF(50, 50, 400, 200);
//        canvas.drawRect(rectF,textPaint);
//
//
//        textPaint.setColor(Color.RED);
//        textPaint.setTextSize(60);
//        textPaint.setTextAlign(Paint.Align.CENTER);
//        canvas.drawText(text, 0, 50, textPaint);
//

        int x=300;
        int y=300;
        canvas.drawCircle(x,y,200,paint);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(x,y,10,paint);


        paint.setTextSize(50);
        paint.setColor(Color.RED);
        //居中对齐
        paint.setTextAlign(Paint.Align.CENTER);
        //计算baseline
        Paint.FontMetrics fontMetrics=paint.getFontMetrics();
        float distance=(fontMetrics.descent - fontMetrics.ascent)/2 - fontMetrics.descent;
        float baseline=y+distance; //distance 就是计算出来的需要往下拉的 距离， 默认是从左下角开始，

        canvas.drawText(text,x,baseline,paint);


        canvas.drawLine(0,300,600,300,paint);
        canvas.drawLine(0,baseline,600,baseline,paint);
    }
}
