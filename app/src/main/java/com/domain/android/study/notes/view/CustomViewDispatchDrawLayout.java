package com.domain.android.study.notes.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * <pre>
 *     author : domain
 *     e-mail : sunlongyue@foxmail.com
 *     time   : 2019/07/12
 *     desc   :
 *
 *     dispatchDraw,是ViewGroup 用来绘制子view的方法，
 *     一个 ViewGroup 会先调用自己的 onDraw() 来绘制完自己的主体之后再去绘制它的子 View。那么ViewGroup的主题内容就有可能被子view的内容挡住
 *      通过重写这个方法， 在执行完子view的内容之后，再来绘制ViewGroup就不会被遮挡了。
 *
 *     version: 1.0
 * </pre>
 */

public class CustomViewDispatchDrawLayout extends LinearLayout {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewDispatchDrawLayout(Context context) {
        super(context);
    }

    public CustomViewDispatchDrawLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDispatchDrawLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);

        //上面的父类方法执行后， 子view就已经绘制完成了， 现在绘制内容就会在子view之上

        paint.setColor(Color.parseColor("#550000ff"));

        canvas.drawCircle(100,100,50,paint);
        canvas.drawCircle(200,200,80,paint);
        canvas.drawCircle(300,300,110,paint);



    }
}
