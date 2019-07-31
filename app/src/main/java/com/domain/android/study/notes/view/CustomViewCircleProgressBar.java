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
 *              绘制一个圆形的进度调， 通过setProgress方法来动态改变进度
 *     version: 1.0
 *
 * </pre>
 */

public class CustomViewCircleProgressBar extends View {

    Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF rectFArc = new RectF();
    double progress = 0;
    float radius = Utils.dpToPixel(80);

    public CustomViewCircleProgressBar(Context context) {
        super(context);
    }

    public CustomViewCircleProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewCircleProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        textPaint.setTextSize(30);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(Color.BLACK);

        circlePaint.setStrokeWidth(Utils.dpToPixel(15));
        circlePaint.setColor(Color.parseColor("#E91E63"));
        circlePaint.setStyle(Paint.Style.STROKE);
        circlePaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        float centerX = getWidth() / 2;
        float centerY = getHeight() / 2;

//        rectFArc.set(-(getWidth()/2), -(getHeight()/2), getWidth(), getHeight());
        rectFArc.set(centerX - radius, centerY - radius, centerX + radius, centerY + radius);

        canvas.drawArc(rectFArc, -90, (float) CalcUtil.mul(360,progress), false, circlePaint);

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
