package com.domain.android.study.notes.view;

import android.content.Context;
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
 *     desc   :画弧形
 *     version: 1.0
 * </pre>
 */
public class CustomViewDrawArc extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public CustomViewDrawArc(Context context) {
        super(context);
    }

    public CustomViewDrawArc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewDrawArc(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        paint.setColor(Color.RED);

        //画实心扇形，弧形
        paint.setStyle(Paint.Style.FILL);
        //椭圆占满的矩形
        RectF rectF = new RectF(50,50,350,200);
        //userCenter 表示是否连接到中心， true连接到中心就是画扇形， false 就是话弧形
        canvas.drawArc(rectF,0,50,true,paint);

        canvas.drawArc(rectF,80,100,false,paint);

        //画空心弧形
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF,250,80,false,paint);


    }
}
