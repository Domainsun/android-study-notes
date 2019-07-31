package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :在onDraw 在 Layout
 *     version: 1.0
 * </pre>
 */

public class CustomViewOnDrawLayout extends LinearLayout {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    List<Point> points = new ArrayList<>();
    Random random = new Random();
    public CustomViewOnDrawLayout(Context context) {
        super(context);
    }

    public CustomViewOnDrawLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewOnDrawLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        // ViewGroup 需要主动开启 dispatchDraw() 以外的绘制，才会走onDraw 方法
        setWillNotDraw(false);

        //设置画笔的属性
        paint.setColor(Color.parseColor("#ff0000"));
        paint.setStrokeWidth(15);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        initPoints();
        drawCircles(canvas);
    }

    private void initPoints(){
        for (int i = 0; i <5 ; i++) {
            Point point = new Point(random.nextInt(1000), random.nextInt(1000));
            points.add(point);
        }
    }

    private void drawCircles(Canvas canvas){
        for (Point point : points) {
            canvas.drawCircle(point.x,point.y,random.nextInt(100),paint);
        }
    }

}
