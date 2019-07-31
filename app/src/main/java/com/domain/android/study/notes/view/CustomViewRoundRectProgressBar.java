package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.domain.android.study.notes.util.CalcUtil;
import com.domain.android.study.notes.util.Utils;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :
 *              绘制一个圆角矩形的进度调， 通过setProgress方法来动态改变进度
 *     version: 1.0
 *
 * </pre>
 */

public class CustomViewRoundRectProgressBar extends View {

    Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint backgroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint foregroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    double progress = 0;

    float r=Utils.dpToPixel(15);

    public CustomViewRoundRectProgressBar(Context context) {
        super(context);
    }

    public CustomViewRoundRectProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewRoundRectProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        textPaint.setTextSize(30);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(Color.BLACK);

        backgroundPaint.setStrokeWidth(Utils.dpToPixel(10));
        backgroundPaint.setColor(Color.parseColor("#ffe5e5"));
//        backgroundPaint.setStrokeCap(Paint.Cap.ROUND);

        foregroundPaint.setStrokeWidth(Utils.dpToPixel(10));
        foregroundPaint.setColor(Color.parseColor("#0000ff"));
//        foregroundPaint.setStrokeCap(Paint.Cap.ROUND);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int w=getWidth();
        int h=getHeight();
        float centerX = w / 2;
        float centerY = h / 2;


        RectF rectF = new RectF(0, 0, w, h);
        canvas.drawRoundRect(rectF,r,r,backgroundPaint);

//        canvas.drawRoundRect(0,centerY,w,centerY,Utils.dpToPixel(10),Utils.dpToPixel(10),backgroundPaint);

        canvas.drawRoundRect(0,0, (float) CalcUtil.mul(progress,w),h,r,r,foregroundPaint);

        //计算baseline
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float distance = (fontMetrics.descent - fontMetrics.ascent) / 2 - fontMetrics.descent;
        float baseline = centerY + distance; //distance 就是计算出来的需要往下拉的 距离， 默认是从左下角开始，

        double present = CalcUtil.mul(progress, 100);

        canvas.drawText(present + "%", centerX, baseline, textPaint);

    }


    public void setProgress(double progress) {
        if (progress <= 1) {
            this.progress = progress;
            invalidate();
        }
    }
}
